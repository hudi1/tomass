-- user with password test
INSERT INTO `PLAYER` (`ID`, `NAME`, `SURNAME`, `NAME_ASCII`, `SURNAME_ASCII`) VALUES
(1, 'Tomáš', 'Hudec', 'Tomas', 'Hudec');

INSERT INTO `USER` (`PLAYER_ID`, `EMAIL`, `LOGIN`, `PASSWORD`, `ROLE`) VALUES
(1, '@', 'hudi1', 'ee26b0dd4af7e749aa1a8ee3c10ae9923f618980772e473f8819a5d4940e0db27ac185f8a0e1d5f84f88bc887fd67b143732c304cc5fa9ad8e6f57f50028a8ff', 'ADMIN');
