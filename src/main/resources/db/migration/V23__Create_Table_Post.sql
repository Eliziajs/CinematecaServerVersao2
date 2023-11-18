CREATE TABLE IF NOT EXISTS `post` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `mensagem` varchar(255) DEFAULT NULL,
  `tipo_msg` bigint DEFAULT NULL,
  `status` bit(1) DEFAULT NULL,
  `data` datetime(6) DEFAULT NULL,
  `filme_id` bigint DEFAULT NULL,
  `user_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY  (`filme_id`),
  KEY  (`user_id`),
  CONSTRAINT  FOREIGN KEY (`filme_id`) REFERENCES `filme` (`id`),
  CONSTRAINT  FOREIGN KEY (`user_id`) REFERENCES `users` (`id`)
);





