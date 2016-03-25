CREATE DATABASE our_company;

USE  our_company;

CREATE TABLE companies(
name VARCHAR(80) NOT NULL UNIQUE,
id INT AUTO_INCREMENT, 
PRIMARY KEY(id)
)Engine = InnoDB;

CREATE TABLE categories(
name VARCHAR(80) NOT NULL UNIQUE,
code VARCHAR(3) NOT NULL UNIQUE,
company_id INT NOT NULL,
PRIMARY KEY(code),
FOREIGN KEY(company_id) REFERENCES companies(id)
)Engine = InnoDB;


CREATE TABLE products(
product_name VARCHAR(80) NOT NULL UNIQUE,
price DOUBLE ,
id INT AUTO_INCREMENT,
category_code VARCHAR(3) NOT NULL ,
PRIMARY KEY(id),
FOREIGN KEY(category_code) REFERENCES categories(code)
)Engine = InnoDB;


CREATE TABLE employees(
name VARCHAR(80) NOT NULL ,
email VARCHAR(80) NOT NULL ,
status VARCHAR(10),
birthday DATE NOT NULL,
id INT AUTO_INCREMENT,
company_id INT NOT NULL ,
manager_id INT ,
PRIMARY KEY(id),
FOREIGN KEY(company_id) REFERENCES companies(id)
)Engine = InnoDB;

CREATE TABLE departments(
name VARCHAR(80) ,
id INT AUTO_INCREMENT,
company_id INT NOT NULL,
manager_id INT NOT NULL,
PRIMARY KEY(id),
FOREIGN KEY(company_id)REFERENCES companies(id),
FOREIGN KEY(manager_id)REFERENCES employees(id)
)Engine = InnoDB;

CREATE TABLE customers(
name VARCHAR(80) NOT NULL,
email VARCHAR(80) NULL DEFAULT NULL,
address VARCHAR(160) NOT NULL ,
discount DOUBLE NOT NULL,
id INT AUTO_INCREMENT,
PRIMARY KEY(id)
)Engine = InnoDB;

CREATE TABLE orders(
order_date DATETIME NOT NULL,
price DOUBLE NOT NULL,
id INT AUTO_INCREMENT,
customer_id INT NOT NULL ,
PRIMARY KEY(id),
FOREIGN KEY(customer_id)REFERENCES customers(id)
)Engine = InnoDB;

CREATE TABLE order_products(
order_id INT NOT NULL,
product_id INT NOT NULL,
quantity INT NOT NULL,
FOREIGN KEY(order_id)REFERENCES orders(id),
FOREIGN KEY(product_id)REFERENCES products(id)
)Engine = InnoDB;
