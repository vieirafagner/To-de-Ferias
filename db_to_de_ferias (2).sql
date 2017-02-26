-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 25-Fev-2017 às 21:44
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
  `classificacao` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `anime`
--

INSERT INTO `anime` (`id`, `duracao_ep`, `sinopse`, `nome`, `qtd_temp`, `classificacao`) VALUES
(27, 20, 'naruto ama sakura', 'naruto', 10, 5),
(28, 20, 'luffy san', 'one piece', 7, 4),
(30, 20, 'goku ', 'dragon ball', 6, 3);

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
(16, 'thaisbs', '12345678', 'thais barbosa', 2);

-- --------------------------------------------------------

--
-- Estrutura da tabela `conta_documentario`
--

CREATE TABLE `conta_documentario` (
  `id` int(11) NOT NULL,
  `idConta` int(11) NOT NULL,
  `idDocumentario` int(11) NOT NULL,
  `classificacao` int(11) NOT NULL,
  `status` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

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

-- --------------------------------------------------------

--
-- Estrutura da tabela `documentario`
--

CREATE TABLE `documentario` (
  `id` int(11) NOT NULL,
  `sinopse` varchar(250) NOT NULL,
  `classificacao` int(11) NOT NULL,
  `duracao` int(11) NOT NULL,
  `data` varchar(12) NOT NULL,
  `autor` varchar(25) NOT NULL,
  `nome` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `documentario`
--

INSERT INTO `documentario` (`id`, `sinopse`, `classificacao`, `duracao`, `data`, `autor`, `nome`) VALUES
(4, 'aaaaaaaa', 1, 20, '10/10/10', 'teste', 'teste');

-- --------------------------------------------------------

--
-- Estrutura da tabela `filme`
--

CREATE TABLE `filme` (
  `id` int(11) NOT NULL,
  `diretor` varchar(50) NOT NULL,
  `duracao` int(11) NOT NULL,
  `nome` varchar(25) NOT NULL,
  `classificacao` int(11) NOT NULL,
  `genero` varchar(25) NOT NULL,
  `sinopse` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `filme`
--

INSERT INTO `filme` (`id`, `diretor`, `duracao`, `nome`, `classificacao`, `genero`, `sinopse`) VALUES
(29, 'Andrew Niccol', 125, 'A hospedeira', 5, 'Ação', 'Na trama, nosso planeta foi dominado por um inimigo invisível, que controla as nossas mentes e o nosso corpo e prossegue a vida como se nada tivesse acontecido. A garota Melanie é um dos poucos humanos ainda não ‘dominados''.'),
(33, 'dfs', 12, 'narnia', 3, 'fdfdgf', 'dfds'),
(35, 'fagner', 1111, 'alice no pais', 4, 'terror', 'aaaaaaaaaaaaaaaaaaaaaaaaaaa');

-- --------------------------------------------------------

--
-- Estrutura da tabela `livro`
--

CREATE TABLE `livro` (
  `id` int(11) NOT NULL,
  `titulo` varchar(25) NOT NULL,
  `classificacao` int(11) NOT NULL,
  `resumo` varchar(250) NOT NULL,
  `autor` varchar(25) NOT NULL,
  `qtd_pag` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `livro`
--

INSERT INTO `livro` (`id`, `titulo`, `classificacao`, `resumo`, `autor`, `qtd_pag`) VALUES
(8, 'O vendedor de sonhos', 3, 'top', 'augusto cury', 230);

-- --------------------------------------------------------

--
-- Estrutura da tabela `novela`
--

CREATE TABLE `novela` (
  `id` int(11) NOT NULL,
  `qtdCap` int(11) NOT NULL,
  `classificacao` int(11) NOT NULL,
  `diretor` varchar(25) NOT NULL,
  `nome` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `novela`
--

INSERT INTO `novela` (`id`, `qtdCap`, `classificacao`, `diretor`, `nome`) VALUES
(15, 200, 3, 'jorge', 'chiquititas');

-- --------------------------------------------------------

--
-- Estrutura da tabela `serie`
--

CREATE TABLE `serie` (
  `id` int(11) NOT NULL,
  `duracao_ep` int(11) NOT NULL,
  `genero` varchar(30) NOT NULL,
  `nome` varchar(30) NOT NULL,
  `classificacao` int(11) NOT NULL,
  `sinopse` varchar(300) NOT NULL,
  `qtd_temp` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `serie`
--

INSERT INTO `serie` (`id`, `duracao_ep`, `genero`, `nome`, `classificacao`, `sinopse`, `qtd_temp`) VALUES
(1, 40, 'ação', 'narcos', 3, 'tiro', 4),
(2, 10, 'ação', 'narcos', 2, 'tiro', 10);

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
-- Indexes for table `conta_novela`
--
ALTER TABLE `conta_novela`
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
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;
--
-- AUTO_INCREMENT for table `conta`
--
ALTER TABLE `conta`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;
--
-- AUTO_INCREMENT for table `conta_documentario`
--
ALTER TABLE `conta_documentario`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `conta_filme`
--
ALTER TABLE `conta_filme`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `conta_novela`
--
ALTER TABLE `conta_novela`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `documentario`
--
ALTER TABLE `documentario`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `filme`
--
ALTER TABLE `filme`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=41;
--
-- AUTO_INCREMENT for table `livro`
--
ALTER TABLE `livro`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
--
-- AUTO_INCREMENT for table `novela`
--
ALTER TABLE `novela`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;
--
-- AUTO_INCREMENT for table `serie`
--
ALTER TABLE `serie`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
