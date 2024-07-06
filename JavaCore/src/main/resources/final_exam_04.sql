DROP DATABASE IF EXISTS final_exam_04;
CREATE DATABASE final_exam_04;
USE final_exam_04;

DROP TABLE IF EXISTS users;
CREATE TABLE users (
    id          INT PRIMARY KEY AUTO_INCREMENT,
    full_name   VARCHAR(50)                     NOT NULL,
    email       VARCHAR(50) UNIQUE KEY          NOT NULL,
    password    VARCHAR(50)                     NOT NULL DEFAULT '123456Q',
    role        ENUM('EMPLOYEE', 'MANAGER')       NOT NULL DEFAULT 'EMPLOYEE',
    pro_skill  VARCHAR(50),
    project_id INT,
    exp_in_year INT
);

INSERT INTO users (full_name        , email              , password  , role		 , pro_skill, project_id ,exp_in_year)
VALUES            ('Nguyễn Văn Khoa', 'khoa.nv@gmail.com', '123456Q' , 'EMPLOYEE', 'Java'   , 1		, NULL       ),
				  ('Nguyễn Ngọc Duy', 'duy.nn@gmail.com' , '123456Q' , 'MANAGER'   , NULL    ,1		, 10         ),
				  ('Nguyễn Ngọc Tùng', 'tung.nn@gmail.com' ,'123456Q' , 'EMPLOYEE'   , NULL    ,2		, 10     ),
                  ('Ngô Nguyễn Huy', 'huy.nn@gmail.com' , '123456Q' , 'EMPLOYEE'   , NULL    ,1		, 10         );

DROP PROCEDURE IF EXISTS find_manager_by_email_and_password;
DELIMITER $$
CREATE PROCEDURE find_manager_by_email_and_password (
	IN in_email     VARCHAR(50),
    IN in_password  VARCHAR(50)
)
BEGIN
	SELECT *
	FROM users
	WHERE role = 'MANAGER' AND email = in_email AND password = in_password;
END $$
DELIMITER ;

SELECT * FROM users