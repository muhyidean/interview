# Getting Started


## Project structure

* The application is built using React.js for the frontend and Java (Spring boot) in the backend. It is running on the Postgres DB.

    * FrontEnd: https://github.com/muhyidean/interview-Frontend.git
    * BackEnd: https://github.com/muhyidean/interview.git


* Frontend: React project
    * Run frontend project
    * In the terminal:

        ```
           $ npm install
           $ npm start
  
          Access >>> http://localhost:3000/
       
      ```

* Backend: Spring Porject
    * src:
        * main: Java codes
        * resources: application configuration files
    * docker-compose.yaml

        * Run backend project
            * Open the project using IDE( Intellij IDEA, eclipse, ...)
            * run the database docker container from the terminal
                 ```
               $ docker compose up -d
                   
            * Compile, build and run the project
    
    
