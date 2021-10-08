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
    public ResponseEntity<Novel> createNovel(@RequestBody Novel novel) {
        try {
            Novel _novel = novelRepository.save(new Novel(novel.getName(), novel.getAuthor(), novel.getCategory(), novel.getDescription(), novel.getImage(), "false", novel.getNation(), 0));
            return new ResponseEntity<>(_novel, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/novels/generate")
    public ResponseEntity<List<Novel>> generateNovels() {
        try {
            List<Novel> list = new ArrayList<Novel>();
            list.add(new Novel("Linh Vũ Thiên Hạ", "Sói Già",
                    Arrays.asList(new String[]{"Tiên Hiệp", "Dị Giới", "Huyền Huyễn", "Xuyên Không"}),
                    "Lục Thiếu Du, linh hồn bị xuyên qua đến thế giới khác, nhập vào thân thể của một thiếu gia không có địa vị phải trải qua cuộc sống không khác gì nô bộc.\n" +
                            "Thế giới này lấy Vũ vi cường, lấy Linh vi tôn, nghe đồn khi võ đạo đỉnh phong, linh đạo đạt đến cực hạn có thể phá toái hư không.\n" +
                            "Lục Thiếu Du mang theo ký ức từ kiếp trước tái sinh, không cam lòng làm một thiếu gia chẳng khác gì củi mục.\n" +
                            "\n" +
                            "Trong thế giới xa lạ,\n" +
                            "Say - nằm trên gối mỹ nhân,\n" +
                            "Tỉnh - nắm quyền thiên hạ.\n" +
                            "Đây mới là cuộc sống đáng mơ ước.\n" +
                            "Linh - Vũ song tu\n" +
                            "Bá chủ kiêu hùng\n" +
                            "Đã đến, ta sẽ lưu lại một huyền thoại......\n" +
                            "\n" +
                            "Hệ Thống Tu Luyện:\n" +
                            "\n" +
                            "- Vũ giả: Vũ khí, Vũ đồ, Vũ sĩ, Vũ sư, Vũ phách, Vũ tướng, Vũ suất, Vũ vương, Vũ tôn, Vũ đế.\n" +
                            "- Linh giả: Linh khí, Linh đồ, Linh sĩ, Linh sư, Linh phách, Linh tướng, Linh suất, Linh vương, Linh tôn, Linh đế.\n" +
                            "\n" +
                            "Mỗi cấp được chia làm cửu trọng (chín tầng). Ngoài ra còn có Yêu thú, Linh thú các thể loại, chia làm nhất giai, nhị giai,... mỗi giai chia làm sơ kỳ, trung kỳ, hậu kỳ.\n" +
                            "\n" +
                            "- Công pháp: chia làm sáu loại, từ cao đến thấp: Thiên, Địa, Huyền, Hoàng, Tinh, Thần\n" +
                            "\n" +
                            "Tất nhiên là vẫn tồn tại một số công pháp đặc biệt bí ẩn khác.\n" +
                            "\n" +
                            "- Ngũ hệ: Vũ giả, Vũ kỹ (công pháp cho vũ giả) được chia thành năm loại Mộc, Thủy, Hỏa, Thổ, Phong.",
                    "img", "false", "TQ", 0));
            list.add(new Novel("Thần Đạo Đan Tôn", "Cô Đơn Địa Phi",
                    Arrays.asList(new String[]{"Tiên Hiệp", "Huyền Huyễn"}),
                    "Lăng Hàn - Một Đan Đế đại danh đỉnh định mang trong thân mình tuyệt thế công pháp vì truy cầu bước cuối, xé bỏ tấm màn thành thần nhưng thất bại đã phải bỏ mình. Thế nhưng ông trời dường như không muốn tuyệt dường người, Lăng Hàn đã được trọng sinh vào một thiếu niên cùng tên và điều may mắn nhất là \"Bất Diệt Thiên Kinh\" ấn ký vẫn còn nằm nguyên trong tâm thức hắn.\n" +
                            "\n" +
                            "Từ nay về sau sóng gió cuộn trào nổi lên, Đan Đế ngày xưa bây giờ phải cùng tranh phong với vô số thiên tài trẻ tuổi, lại bắt đầu một truyền thuyết mới như để chứng minh với trời đất: Ta, là người mạnh nhất!\n" +
                            "Phân chia cảnh giới: Luyện Thể, Tụ Nguyên, Dũng Tuyền, Linh Hải, Thần Thai, Sinh Hoa, Linh Anh, Hóa Thần cùng Thiên Nhân Cảnh.....\n" +
                            "Mỗi cảnh giới chia làm chín tầng: tầng một đến ba là tiền kỳ, tầng bốn đến sáu gọi là trung kỳ và tầng bảy đến chín gọi là hậu kỳ và đỉnh\n" +
                            "Cảnh giới Đan Sư: Hoàng cấp,Huyền cấp, Địa cấp, Thiên cấp...\n" +
                            "Thần Cảnh: Nhật Nguyệt Cảnh, Sơn Hà Cảnh, Tinh Thần Cảnh, Hằng Hà Cảnh, Sáng Thế Cảnh\n" +
                            "Mỗi cảnh giới chia làm: Tiểu Cực Vị, Trung Cực Vị, Đại Cực Vi, Đại Viên Mãn trong một Cực Vị lại chia làm: Tiền kỳ, Trung kỳ, Hậu kỳ, Viên mãn\n" +
                            "Cảnh giới Tiên Vực:Trảm Trần Cảnh (Nhất Trảm-Nhị Trảm-Tam Trảm-Tứ Trảm-Ngũ Trảm),Phân Hồn Cảnh (Dương Hồn-Âm Hồn-Thiên Hồn-Địa Hồn), Tiên Phủ Cảnh, Thăng Nguyên Cảnh, Tiên Vương có 9 tầng từ 1 đến 9, bên trên Tiên Vương là Thiên Tôn\n" +
                            "Cảnh giới Đan Sư ở Tiên Vực: Nhất Tinh, Nhị Tinh, Tam Tinh, Tứ Tinh,Ngũ Tinh Đan Sư",
                    "img", "false", "TQ", 0));
            list.add(new Novel("Dị Thế Tà Quân", "Phong Lăng Thiên Hạ",
                    Arrays.asList(new String[]{"Kiếm Hiệp", "Dị Giới", "Huyền Huyễn"}),
                    "- Thế gian khen chê, thế nhân lạnh lùng cùng ta có quan hệ gì? Lấy bản tính chính mình ân cừu khoái ý, lấy bản tâm tự thân ngao du thế gian. Mệnh tại ta chứ không phải tại thiên… Một đại ngưu nhân xuyên việt đến dị giới. Xem thử nhân vật chúng ta như thế nào có thể đứng trên đỉnh thế giới. Trở thành một thế hệ Tà Quân!\n" +
                            "\n" +
                            "- Bạn thích truyện hài hước? Thích luyện binh? Đấu trí và gái đẹp nữa à? Vậy hãy đọc Dị Thế Tà Quân để tận hưởng nhé!",
                    "img", "false", "TQ", 0));
            list.add(new Novel("Đấu Phá Thương Khung", "Thiên Tàm Thổ Đậu",
                    Arrays.asList(new String[]{"Tiên Hiệp", "Dị Giới", "Huyền Huyễn"}),
                    "- Đấu Phá Thương Khung là một câu chuyện huyền huyễn đặc sắc kể về Tiêu Viêm, một thiên chi kiêu tử với thiên phú tu luyện mà ai ai cũng hâm mộ, bỗng một ngày người mẹ mất đi đễ lại di vật là một chiếc giới chỉ màu đen nhưng từ khi đó Tiêu Viêm đã mất đi thiên phú tu luyện của mình.\n" +
                            "\n" +
                            "- Từ thiên tài rớt xuống làm phế vật trong 3 năm, rồi bị vị hôn thê thẳng thừng từ hôn, làm dấy lên ý chí nam nhi của mình, Tiêu Viêm nhờ di vật của mẫu thân để lại là 1 chiếc hắc giới chỉ (nhẫn màu đen)Tiêu Viêm gặp được hồn của Dược Lão (Dược Trần – Dược tôn giả) 1 đại luyện dược tông sư của đấu khí đại lục…\n" +
                            "\n" +
                            "- Từ đó cuộc đời của Tiêu Viêm có những biến hóa gì? Gặp được các đại ngộ gì? Thân phận thật sự của Huân Nhi (thanh mai trúc mã lúc nhỏ của Tiêu Viêm) ra sao? Bí mật của gia tộc hắn là gì? Cùng theo dõi bộ truyện Đấu Phá Thương Khung để có thể giải đáp các thắc mắc này các bạn nhé!",
                    "img", "false", "TQ", 0));
            list.add(new Novel("Thế Giới Hoàn Mỹ", "Thần Đông",
                    Arrays.asList(new String[]{"Tiên Hiệp", "Dị Giới", "Huyền Huyễn"}),
                    "Một hạt bụi có thể lấp biển, một cọng cỏ chém hết mặt trời mặt trăng và ngôi sao, trong nháy mắt ở giữa long trời lỡ đất. Quần hùng cùng nổi lên, vạn tộc mọc lên san sát như rừng, chư thánh tranh bá, loạn khắp đất trời. Hỏi mặt đất bao la, cuộc đời thăng trầm? Một thiếu niên theo trong đất hoang đi ra, tất cả bắt đầu từ nơi này...",
                    "img", "false", "TQ", 0));
            list.add(new Novel("Nhất Niệm Vĩnh Hằng", "Nhĩ Căn",
                    Arrays.asList(new String[]{"Tiên Hiệp", "Huyền Huyễn"}),
                    "Nhất niệm thành biển cả, nhất niệm hóa nương dâu.\n" +
                            "Nhất niệm trảm nghìn Ma, nhất niệm giết vạn Tiên.\n" +
                            "\n" +
                            "Chỉ có niệm của ta... là Vĩnh hằng.",
                    "img", "false", "TQ", 0));
            list.add(new Novel("Ngạo Thế Đan Thần", "Tịch Tiểu Tặc",
                    Arrays.asList(new String[]{"Tiên Hiệp"}),
                    "Thể loại truyện tiên hiệp đã và đang nhận được không ít sự quan tâm của các bạn độc giả, truyện với những tình tiết và nhân vật đem lại không ít sự tò mò, lối kể chuyện lạ, tình tiết không quá đặc sắc nhưng khi dựng thành một câu chuyện thì thực sống động và cuốn hút. Truyện Ngạo Thế Đan Thần là một trong những truyện nổi bật ở thể loại này được tác giả Tịch Tiểu Tặc chắp bút.\n" +
                            "\n" +
                            "Năm nay Trầm Tường mười sáu tuổi, thân hình so với bạn cùng lứa tuổi thì cường tráng cao lớn hơn, thân thể này cùng gương mặt tuấn tú mang theo tính trẻ con, nhìn rất là trái ngược, nhưng cặp mắt kia của hắn lại thâm thúy không tương xứng cùng tuổi tác, xem ra nhàn đến muốn thành thục hơn so với bạn cùng lứa tuổi một ít.\n" +
                            "\n" +
                            "Lúc này Trầm Tường muốn đi hái thuốc, mặc dù hắn là trưởng tôn tử của Trầm gia tộc, nhưng bởi vì hắn không có linh mạch, không thể trở thành một võ giả lợi hại, bởi vậy, từ nhỏ hắn đã rất chăm chỉ rèn luyện thân thể của mình, thường thường ra ngoài tiến hành các loại huấn luyện bí mật, thậm chí còn tiến hành tranh đấu với Hổ thú, tuy hắn tuổi còn trẻ, nhưng cũng từng có mấy lần trải qua sinh tử, tâm tình cùng ý chí đều hơn xa bạn cùng lứa tuổi.\n" +
                            "\n" +
                            "Thiếu niên Trầm Tường diễm ngộ Thần nữ cùng Ma nữ, đạt được vô thượng truyền thừa của các nàng, thu được Âm Dương Thần Mạch, học được tuyệt thế thần công, nắm giữ đan thuật siêu tuyệt, này khiến cho hắn ở võ đạo chi lộ xuân phong đắc ý... lúc đói bụng luyện đan dược làm đồ ăn vặt, thời điểm tịch mịch đùa giỡn Thần nữ cao cao tại thượng, lúc tẻ nhạt chơi đùa với những cao nhân đến van cầu đan dược, lúc mệt mỏi để kiều thê bên người xoa xoa bóp bóp...\n" +
                            "\n" +
                            "Phân chia đằng cấp: Phàm Võ Cảnh mười tầng, Chân Võ Cảnh thập đoạn, Tam đại cảnh giới cực hạn, Niết Bàn Cảnh cửu kiếp....\n" +
                            "\n" +
                            "Luyện Đan Sư phân chia thập đoạn....",
                    "img", "false", "TQ", 0));
            list.add(new Novel("Phàm Nhân Tu Tiên", "Vong Ngữ",
                    Arrays.asList(new String[]{"Tiên Hiệp", "Kiếm Hiệp"}),
                    "Phàm Nhân Tu Tiên là một câu chuyện Tiên Hiệp kể về Hàn Lập - Một người bình thường nhưng lại gặp vô vàn cơ duyên để bước đi trên con đường tu tiên, không phải anh hùng - cũng chẳng phải tiểu nhân, Hàn Lập từng bước khẳng định mình... Liệu Hàn Lập và người yêu có thể cùng bước trên con đường tu tiên và có một cái kết hoàn mỹ? Những thử thách nào đang chờ đợi bọn họ?\n" +
                            "\n" +
                            "- Truyện kết cấu khá hợp lý, tình tiết không quá chậm, không quá nhanh, diễn tả khá đặc biệt, lời văn trôi chảy, nhân vật tính cách đặc thù. Nhân vật chính, Hàn Lập, mang hơi hướng khá cô độc. Bạn nào thích đọc Tru Tiên hoặc Thương Thiên chắc sẽ thích Phàm Nhân Tu Tiên Truyện. Mời bạn đọc cùng thưởng thức và dõi theo bước chân của Hàn Lập!",
                    "img", "false", "TQ", 0));
            list.add(new Novel("Nguyên Tôn", "Thiên Tằm Thổ Đậu",
                    Arrays.asList(new String[]{"Tiên Hiệp", "Huyền Huyễn"}),
                    "Nhóm Dịch: Thánh Thiên Tiên Vực\n" +
                            "\n" +
                            "Dùng huyền hoàng khí bạn thân sở hữu, mọi thứ thiện địa nhật nguyệt tinh đều bị ta nuốt hết.",
                    "img", "false", "TQ", 0));
            list.add(new Novel("Đế Bá", "Yếm Bút Tiêu Sinh",
                    Arrays.asList(new String[]{"Huyền Huyễn"}),
                    "Ngàn vạn năm trước, Lý Thất Dạ trồng xuống một cây Thúy Trúc.\n" +
                            "\n" +
                            "Tám trăm vạn năm trước, Lý Thất Dạ nuôi một đầu cá chép.\n" +
                            "\n" +
                            "Năm trăm vạn năm trước, Lý Thất Dạ thu dưỡng một cái tiểu cô nương.\n" +
                            "\n" +
                            "... ... ... ... ...\n" +
                            "\n" +
                            "Hôm nay, Lý Thất Dạ tỉnh lại sau giấc ngủ, Thúy Trúc tu luyện thành thần linh, cá chép hóa thành Kim Long, tiểu cô nương trở thành Cửu Giới Nữ Đế.\n" +
                            "\n" +
                            "Đây là cố sự về một tiểu tử bất tử Nhân tộc dưỡng thành Yêu Thần, dưỡng thành Tiên thú, dưỡng thành Nữ Đế...",
                    "img", "false", "TQ", 0));



            novelRepository.saveAll(list);

            return new ResponseEntity<>(list, HttpStatus.CREATED);
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
