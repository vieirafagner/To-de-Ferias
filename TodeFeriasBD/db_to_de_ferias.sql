-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 05-Mar-2017 às 18:58
-- Versão do servidor: 10.1.16-MariaDB
-- PHP Version: 5.6.24

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_to_de_ferias`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `anime`
--

CREATE TABLE `anime` (
  `id` int(11) NOT NULL,
  `duracao_ep` int(11) NOT NULL,
  `sinopse` varchar(50) NOT NULL,
  `nome` varchar(25) NOT NULL,
  `qtd_temp` int(11) NOT NULL,
  `status` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `anime`
--

INSERT INTO `anime` (`id`, `duracao_ep`, `sinopse`, `nome`, `qtd_temp`, `status`) VALUES
(27, 20, 'naruto ama sakura', 'naruto', 10, 0),
(28, 20, 'luffy san', 'one piece', 7, 1),
(30, 20, 'goku ', 'dragon ball', 6, 1),
(31, 20, 'bom', 'full metal', 12, 0),
(32, 20, 'foda', 'another', 1, 0),
(33, 10, 'aaaa', 'teste', 10, 1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `conta`
--

CREATE TABLE `conta` (
  `id` int(11) NOT NULL,
  `email` varchar(30) NOT NULL,
  `senha` varchar(25) NOT NULL,
  `nome` varchar(25) NOT NULL,
  `status` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `conta`
--

INSERT INTO `conta` (`id`, `email`, `senha`, `nome`, `status`) VALUES
(1, 'admin', 'admin123', 'admin', 1),
(6, 'fagner', '12345678', 'fagner123', 2),
(7, 'caio xavier', '12345678', 'caio123', 2),
(8, 'winylouca', '12345678', 'winy@gmail.com', 2),
(9, 'manoel', '12345678', 'manoel123', 2),
(10, 'silvio', '12345678', 'silvio123', 2),
(11, 'joao caio', '1234567890', 'jojo', 2),
(12, 'willian junior', '12345678', 'willian123', 2),
(13, 'jesus maria', '12345678', 'jesus123', 0),
(14, 'ian silva', '12345678', 'ian123', 2),
(15, 'jofrey123', '12345678', 'jofrey rei', 2),
(16, 'thaisbs', '12345678', 'thais barbosa', 2),
(17, 'ann', '12345678', 'anderson', 2),
(18, 'Deusnaoexiste@ilusao.com', '12345678', 'Manoel', 1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `conta_anime`
--

CREATE TABLE `conta_anime` (
  `id` int(11) NOT NULL,
  `idConta` int(11) NOT NULL,
  `idAnime` int(11) NOT NULL,
  `classificacao` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `conta_anime`
--

INSERT INTO `conta_anime` (`id`, `idConta`, `idAnime`, `classificacao`) VALUES
(4, 6, 28, 3);

-- --------------------------------------------------------

--
-- Estrutura da tabela `conta_documentario`
--

CREATE TABLE `conta_documentario` (
  `id` int(11) NOT NULL,
  `idConta` int(11) NOT NULL,
  `idDocumentario` int(11) NOT NULL,
  `classificacao` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `conta_documentario`
--

INSERT INTO `conta_documentario` (`id`, `idConta`, `idDocumentario`, `classificacao`) VALUES
(7, 6, 3, 2);

-- --------------------------------------------------------

--
-- Estrutura da tabela `conta_filme`
--

CREATE TABLE `conta_filme` (
  `id` int(11) NOT NULL,
  `idConta` int(11) NOT NULL,
  `idFilme` int(11) NOT NULL,
  `classificacao` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `conta_filme`
--

INSERT INTO `conta_filme` (`id`, `idConta`, `idFilme`, `classificacao`) VALUES
(31, 6, 43, 4),
(32, 6, 48, 4),
(40, 6, 49, 1),
(41, 6, 49, 1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `conta_livro`
--

CREATE TABLE `conta_livro` (
  `id` int(11) NOT NULL,
  `idConta` int(11) NOT NULL,
  `idLivro` int(11) NOT NULL,
  `classificacao` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `conta_livro`
--

INSERT INTO `conta_livro` (`id`, `idConta`, `idLivro`, `classificacao`) VALUES
(3, 6, 8, 2),
(4, 6, 8, 3);

-- --------------------------------------------------------

--
-- Estrutura da tabela `conta_novela`
--

CREATE TABLE `conta_novela` (
  `id` int(11) NOT NULL,
  `idConta` int(11) NOT NULL,
  `idNovela` int(11) NOT NULL,
  `classificacao` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `conta_novela`
--

INSERT INTO `conta_novela` (`id`, `idConta`, `idNovela`, `classificacao`) VALUES
(2, 6, 18, 2);

-- --------------------------------------------------------

--
-- Estrutura da tabela `conta_serie`
--

CREATE TABLE `conta_serie` (
  `id` int(11) NOT NULL,
  `idConta` int(11) NOT NULL,
  `idSerie` int(11) NOT NULL,
  `classificacao` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `conta_serie`
--

INSERT INTO `conta_serie` (`id`, `idConta`, `idSerie`, `classificacao`) VALUES
(1, 6, 1, 4),
(2, 6, 1, 3);

-- --------------------------------------------------------

--
-- Estrutura da tabela `documentario`
--

CREATE TABLE `documentario` (
  `id` int(11) NOT NULL,
  `sinopse` varchar(250) NOT NULL,
  `duracao` int(11) NOT NULL,
  `data` varchar(12) NOT NULL,
  `autor` varchar(25) NOT NULL,
  `nome` varchar(30) NOT NULL,
  `status` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `documentario`
--

INSERT INTO `documentario` (`id`, `sinopse`, `duracao`, `data`, `autor`, `nome`, `status`) VALUES
(1, 'teste', 10, 'teste', 'teste', 'teste', 1),
(2, 'teste2', 10, 'teste2', 'teste2', 'teste2', 0),
(3, 'nada ', 10, '10/02/1900', 'Drauzio Varela', 'History Chanel ', 1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `filme`
--

CREATE TABLE `filme` (
  `id` int(11) NOT NULL,
  `diretor` varchar(50) NOT NULL,
  `duracao` int(11) NOT NULL,
  `nome` varchar(25) NOT NULL,
  `genero` varchar(25) NOT NULL,
  `sinopse` varchar(250) NOT NULL,
  `status` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `filme`
--

INSERT INTO `filme` (`id`, `diretor`, `duracao`, `nome`, `genero`, `sinopse`, `status`) VALUES
(29, 'Andrew Niccol', 125, 'A hospedeira', 'Ação', 'Na trama, nosso planeta foi dominado por um inimigo invisível, que controla as nossas mentes e o nosso corpo e prossegue a vida como se nada tivesse acontecido. A garota Melanie é um dos poucos humanos ainda não ‘dominados''.', 0),
(33, 'dfs', 12, 'narnia', 'fdfdgf', 'dfds', 0),
(35, 'fagner', 1111, 'alice no pais', 'terror', 'aaaaaaaaaaaaaaaaaaaaaaaaaaa', 0),
(36, 'cleiton', 120, 'elbis', 'terror', 'cleiton gay', 0),
(37, 'teste', 120, 'teste', 'teste', 'teste', 0),
(38, 'asda', 1231, 'eita', 'asda', 'ads', 0),
(39, 'ppppp', 89, 'ppppp', 'oooo', 'Na trama, nosso planeta foi dominado por um inimigo invisível, que controla as nossas mentes e o nosso corpo e prossegue a vida como se nada tivesse acontecido. A garota Melanie é um dos poucos humanos ainda não ‘dominados''.', 0),
(40, 'qq', 11, 'qq', '11', '11', 0),
(41, 'oi', 8, 'pp', 'iu', 'jyh', 0),
(42, '78', 123, 'hh', '3245', '435', 0),
(43, '12345', 13425, '123456789', '1245', 'TESTE', 1),
(44, 'bla', 123, 'bla', '13', 'lal', 0),
(45, 'kid Bengala', 30, 'O Chamado Versão Porn', 'xxx', 'k7', 0),
(46, 'teste2', 120, 'teste2', 'ação', 'teste2', 0),
(47, 'a', 1, 'a', 'q', 'a	', 0),
(48, 'Alguem', 90, 'Os outros', 'Elbis', 'teste', 1),
(49, 'nao sei mesmo', 120, 'A origem', 'ficção', 'legal', 1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `livro`
--

CREATE TABLE `livro` (
  `id` int(11) NOT NULL,
  `titulo` varchar(25) NOT NULL,
  `resumo` varchar(250) NOT NULL,
  `autor` varchar(25) NOT NULL,
  `qtd_pag` int(11) NOT NULL,
  `status` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `livro`
--

INSERT INTO `livro` (`id`, `titulo`, `resumo`, `autor`, `qtd_pag`, `status`) VALUES
(8, 'O vendedor de sonhos', 'top', 'augusto cury', 230, 1),
(9, 'teste', 'teste', 'teste', 10, 1),
(10, 'eu1', 'eu', 'eu', 1, 0);

-- --------------------------------------------------------

--
-- Estrutura da tabela `novela`
--

CREATE TABLE `novela` (
  `id` int(11) NOT NULL,
  `qtdCap` int(11) NOT NULL,
  `diretor` varchar(25) NOT NULL,
  `nome` varchar(25) NOT NULL,
  `status` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `novela`
--

INSERT INTO `novela` (`id`, `qtdCap`, `diretor`, `nome`, `status`) VALUES
(16, 200, 'jorge 3', 'chiquititas', 1),
(17, 150, 'nao sei', 'a feia mais bela', 0),
(18, 200, 'nao sei', 'Pantanal mt', 1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `serie`
--

CREATE TABLE `serie` (
  `id` int(11) NOT NULL,
  `duracao_ep` int(11) NOT NULL,
  `genero` varchar(30) NOT NULL,
  `nome` varchar(30) NOT NULL,
  `sinopse` varchar(300) NOT NULL,
  `qtd_temp` int(11) NOT NULL,
  `status` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `serie`
--

INSERT INTO `serie` (`id`, `duracao_ep`, `genero`, `nome`, `sinopse`, `qtd_temp`, `status`) VALUES
(1, 40, 'ação', 'narcos', 'pablo escobar', 4, 1),
(2, 40, 'horror', 'ahs freak show', 'cool', 6, 0);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `anime`
--
ALTER TABLE `anime`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `conta`
--
ALTER TABLE `conta`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `conta_anime`
--
ALTER TABLE `conta_anime`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `conta_documentario`
--
ALTER TABLE `conta_documentario`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `conta_filme`
--
ALTER TABLE `conta_filme`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `conta_livro`
--
ALTER TABLE `conta_livro`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `conta_novela`
--
ALTER TABLE `conta_novela`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `conta_serie`
--
ALTER TABLE `conta_serie`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `documentario`
--
ALTER TABLE `documentario`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `filme`
--
ALTER TABLE `filme`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `livro`
--
ALTER TABLE `livro`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `novela`
--
ALTER TABLE `novela`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `serie`
--
ALTER TABLE `serie`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `anime`
--
ALTER TABLE `anime`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=34;
--
-- AUTO_INCREMENT for table `conta`
--
ALTER TABLE `conta`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;
--
-- AUTO_INCREMENT for table `conta_anime`
--
ALTER TABLE `conta_anime`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `conta_documentario`
--
ALTER TABLE `conta_documentario`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT for table `conta_filme`
--
ALTER TABLE `conta_filme`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=42;
--
-- AUTO_INCREMENT for table `conta_livro`
--
ALTER TABLE `conta_livro`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `conta_novela`
--
ALTER TABLE `conta_novela`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `conta_serie`
--
ALTER TABLE `conta_serie`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `documentario`
--
ALTER TABLE `documentario`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `filme`
--
ALTER TABLE `filme`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=50;
--
-- AUTO_INCREMENT for table `livro`
--
ALTER TABLE `livro`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
--
-- AUTO_INCREMENT for table `novela`
--
ALTER TABLE `novela`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;
--
-- AUTO_INCREMENT for table `serie`
--
ALTER TABLE `serie`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
