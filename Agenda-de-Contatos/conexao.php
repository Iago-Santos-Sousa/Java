<?php

$database = "agenda";
$servername = "localhost";
$username = "root";
$password = "senac";

try {
  $conn = new PDO("mysql:host=$servername;dbname=$database;", $username, $password);
  $conn->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
  echo "Conexão bem sucedida.";
} catch(PDOException $e) {
  echo "Falha na conexão: " . $e->getMessage();
}

?>