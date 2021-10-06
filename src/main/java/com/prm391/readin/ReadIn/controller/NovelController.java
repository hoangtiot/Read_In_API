package com.prm391.readin.ReadIn.controller;

import com.prm391.readin.ReadIn.model.Novel;
import com.prm391.readin.ReadIn.repository.NovelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api/novel")
public class NovelController {

    final
    NovelRepository novelRepository;

    @Autowired
    public NovelController(NovelRepository novelRepository) {
        this.novelRepository = novelRepository;
    }

    @PostMapping("/novels")
    public ResponseEntity<Novel> createTutorial(@RequestBody Novel novel) {
        try {
            Novel _novel = novelRepository.save(new Novel(novel.getName(), novel.getAuthor(), novel.getCategory(), novel.getDescription(), novel.getImage(), "false", novel.getNation(), 0));
            return new ResponseEntity<>(_novel, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @GetMapping("/novels")
    public ResponseEntity<List<Novel>> getAllNovels(@RequestParam(required = false) String name) {
        try {
            List<Novel> novels = new ArrayList<Novel>();

            if (name == null) {
                novelRepository.findAll().forEach(novels::add);
            } else
                novelRepository.findByName(name).forEach(novels::add);

            if (novels.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(novels, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Novel> findByID(@PathVariable("id") String id) {
        Optional<Novel> novelData = novelRepository.findById(id);

        if (novelData.isPresent()) {
            return new ResponseEntity<>(novelData.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/author/{author}")
    public ResponseEntity<List<Novel>> findByAuthor(@PathVariable("author") String author) {
        try {
            List<Novel> novels = new ArrayList<Novel>();

            if (author == null) {
                novelRepository.findAll().forEach(novels::add);
            } else
                novelRepository.findByAuthor(author).forEach(novels::add);

            if (novels.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(novels, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/category/{category}")
    public ResponseEntity<List<Novel>> findByCategory(@PathVariable("category") String category) {
        try {
            List<Novel> novels = new ArrayList<Novel>();

            if (category == null) {
                novelRepository.findAll().forEach(novels::add);
            } else
                novelRepository.findByCategory(category).forEach(novels::add);

            if (novels.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(novels, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/status/{status}")
    public ResponseEntity<List<Novel>> findByStatus(@PathVariable("status") String status) {
        try {
            List<Novel> novels = new ArrayList<Novel>();

            novelRepository.findByStatus(status).forEach(novels::add);

            if (novels.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(novels, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/novel/{id}")
    public ResponseEntity<Novel> updateNovel(@PathVariable("id") String id, @RequestBody Novel novel) {
        Optional<Novel> novelData = novelRepository.findById(id);

        if (novelData.isPresent()) {
            Novel _novel = novelData.get();
            _novel.setName(novel.getName());
            _novel.setAuthor(novel.getAuthor());
            _novel.setCategory(novel.getCategory());
            _novel.setChapter(novel.getChapter());
            _novel.setDescription(novel.getDescription());
            _novel.setImage(novel.getImage());
            _novel.setStatus(novel.getStatus());
            _novel.setNation(novel.getNation());
            return new ResponseEntity<>(novelRepository.save(_novel), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

//    @PutMapping("/{id}/chapter")
//    public ResponseEntity<Novel> updateChapter(@PathVariable("id") String id, @RequestBody Novel novel) {
//        Optional<Novel> novelData = novelRepository.findById(id);
//
//        if (novelData.isPresent()) {
//            Novel _novel = novelData.get();
//            _novel.setChapter(novel.getChapter());
//
//            return new ResponseEntity<>(novelRepository.save(_novel), HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }

    @PutMapping("/{id}/chapter/{cid}")
    public ResponseEntity<Novel> updateChapter(@PathVariable("id") String id, @PathVariable("cid") String cid, @RequestBody Map<String, List<String>> chap) {
        Optional<Novel> novelData = novelRepository.findById(id);

        if (novelData.isPresent()) {
            Novel _novel = novelData.get();
            Map<Integer, List<String>> curChap = _novel.getChapter();
            curChap.put(Integer.parseInt(cid), chap.get(cid));
            _novel.setChapter(curChap);

            return new ResponseEntity<>(novelRepository.save(_novel), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/{novel_id}/chapter")
    public ResponseEntity<Novel> updateChapterView(@PathVariable("novel_id") String novel_id) {
        Optional<Novel> novelData = novelRepository.findById(novel_id);

        if (novelData.isPresent()) {
            Novel _novel = novelData.get();

            _novel.setNo_views(_novel.getNo_views() + 1);

            return new ResponseEntity<>(novelRepository.save(_novel), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/novels/{id}")
    public ResponseEntity<HttpStatus> deleteNovel(@PathVariable("id") String id) {
        try {
            novelRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
