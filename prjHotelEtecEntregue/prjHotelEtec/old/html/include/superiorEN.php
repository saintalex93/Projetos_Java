<?php 
$url = basename($_SERVER['PHP_SELF']);
?>


<!DOCTYPE html>
<html lang="pt-BR">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="../css/estilo.css">
    <link rel="stylesheet" href="../css/font-awesome.min.css">
    <link rel="shortcut icon" href="../img/logoHotel.ico" type="image/x-icon"/>
    <title>Clube Azul do Mar</title>

</head>

<body>
    <header style="top:0">
        <div id="logoMobile">
            <a href="../html/indexEN.php"><img src="../img/logo.png" alt=""></a>
        </div>

        <div id="botaoMenu" onClick="toggleMenu();"><i class="fa fa-bars" aria-hidden="true"></i></div>

        <div id="menuTop" class="inactive">
            <nav id="menuE">
                <ul id="direita">
                    <li id="menuAcomoda"><a <?php if($url == 'acomodacoesEN.php'){ echo "class = 'menuActive'" ;}?> href="../html/acomodacoesEN.php">Acomodation</a></li>
                    <li id="menuRegulamento"><a <?php if($url == 'regulamentoEN.php'){ echo "class = 'menuActive'" ;}?> href="../html/regulamentoEN.php">Schedules</a></li>
                </ul>
            </nav>
            <div id="logo">
                <a href="../html/indexEN.php"><img src="../img/logoHotel.png" alt=""></a>
            </div>
            <nav id="menuD">
                <ul id="esquerda">
                    <li id="menuSobre"><a <?php if($url == 'galeriasEN.php'){ echo "class = 'menuActive'" ;}?> href="../html/galeriasEN.php">Gallerys</a></li>
                    <li id="menuContato"><a <?php if($url == 'contatoEN.php'){ echo "class = 'menuActive'" ;}?> href="../html/contatoEN.php">Contact</a></li>
                   <ul id="bandeiraMobi">
                        <li>
                            <a href="../html/index.php"><img src="../img/bandeiraBR%20-%20Copia.png" alt=""></a>
                        </li>
                        <li>
                            <a href="../html/indexEN.php"><img src="../img/bandeiraEN%20-%20Copia.png" alt=""></a>
                        </li>

                    </ul>
                </ul>
            </nav>

        </div>

        <div id="bandeiras">
            <ul>
                <li id=>
                    <a href="../html/index.php"><img src="../img/bandeiraBR%20-%20Copia.png" alt=""></a>
                </li>
                <li>
                    <a href="../html/indexEN.php"><img src="../img/bandeiraEN%20-%20Copia.png" alt=""></a>
                </li>
            </ul>
        </div>
        <div class="clear"></div>
    </header>
