USE my_database;


CREATE TABLE transaction_statuses (
    id INT PRIMARY KEY,
    name VARCHAR(50)
);

CREATE TABLE transactions (
    id INT PRIMARY KEY,
    product_id VARCHAR(50),
    product_name VARCHAR(100),
    amount DECIMAL(19, 2),
    customer_name VARCHAR(100),
    status_id INT,
    transaction_date DATETIME,
    create_by VARCHAR(100),
    create_on DATETIME,
    FOREIGN KEY (status_id) REFERENCES transaction_statuses(id)
);

INSERT INTO transaction_statuses (id, name) VALUES (0, 'SUCCESS');
INSERT INTO transaction_statuses (id, name) VALUES (1, 'FAILED');

INSERT INTO transactions (id, product_id, product_name, amount, customer_name, status_id, transaction_date, create_by, create_on)
VALUES
(1372, '10001', 'Test 1', 1000.00, 'abc', 0, '2022-07-10 11:14:52', 'abc', '2022-07-10 11:14:52'),
(1373, '10002', 'Test 2', 2000.00, 'abc', 0, '2022-07-11 13:14:52', 'abc', '2022-07-10 13:14:52'),
(1375, '10002', 'Test 2', 1000.00, 'abc', 1, '2022-08-10 13:10:52', 'abc', '2022-07-10 13:10:52');