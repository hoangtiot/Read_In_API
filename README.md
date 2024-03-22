<div align='center'>

<p>The Read_In_API is the server-side component of the ReadIn mobile application, built using Spring Boot and MongoDB. This backend system serves as the backbone for the ReadIn app, allowing users to read novels and textbooks. The application has two main roles: user and admin. Users have the ability to read content, while admins can upload and manage the content available for reading.</p>

<h4> <span> · </span> <a href="https://github.com/hoangtiot/Read_In_API/blob/master/README.md"> Documentation </a> <span> · </span> <a href="https://github.com/hoangtiot/Read_In_API/issues"> Report Bug </a> <span> · </span> <a href="https://github.com/hoangtiot/Read_In_API/issues"> Request Feature </a> </h4>


</div>

# :notebook_with_decorative_cover: Table of Contents

- [About the Project](#star2-about-the-project)
- [Contact](#handshake-contact)


## :star2: About the Project

### :dart: Features
- User Authentication: Secure login and registration system for users and admins.
- Content Management: Admins can upload, update, and delete novels and textbooks.
- Reading History: Track and manage reading history for users, allowing them to resume reading where they left off.
- Search Functionality: Users can search for specific novels or textbooks by title, author, or category.
- Deployment: Packed with Docker and deployed on Amazon Web Services (AWS) for scalability and reliability.


## :toolbox: Getting Started

### :gear: Installation

Clone the repository:
```bash
git clone https://github.com/hoangtiot/Read_In_API.git
```
Set up MongoDB by Install MongoDB locally or use a cloud-based MongoDB service like MongoDB Atlas. Then update the MongoDB connection URI in the application.properties file.
Navigate to the project directory
```bash
cd Read_In_API
```
Build the project image using Dockerfile
```bash
docker build -t readin .
```
Run the image created in a container
```bash
docker run -dp 127.0.0.1:3000:3000 readin
```


## :handshake: Contact

hoangtiot - [Linkedin](https://www.linkedin.com/in/hoangdh1262/) - dohuyhoang1120@gmail.com

Project Link: [https://github.com/hoangtiot/Read_In_API](https://github.com/hoangtiot/Read_In_API)
