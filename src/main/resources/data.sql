INSERT IGNORE INTO users (username, password, role) VALUES
('satish', 'password123', 'ROLE_USER'),
('ravi', 'password456', 'ROLE_USER'),
('admin', 'adminpass', 'ROLE_ADMIN');

INSERT IGNORE INTO accounts (account_number, balance, user_id) VALUES
('ACC10001', 5000.00, 1),
('ACC10002', 15000.50, 1),
('ACC20001', 7500.75, 2),
('ACC30001', 100000.00, 3);
