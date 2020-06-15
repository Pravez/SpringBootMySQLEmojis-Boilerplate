CREATE TABLE post
(
    id      INT AUTO_INCREMENT NOT NULL,
    title   VARCHAR(255)       NOT NULL,
    content TEXT               NOT NULL,
    PRIMARY KEY (id)
) DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_unicode_ci;