<?php

$file = fopen("dados.txt","r");

echo "<table border='1'>";
echo "<th>Nome</th><th>Gênero</th><th>DT-Nasci</th><th>Tel</th><th>Email</th>";
while(! feof($file)) 
{
  $line = fgets($file);
  
  $pessoa = json_decode($line, true);

if (isset($pessoa["nome"]) || isset($pessoa["genero"]) || isset($pessoa["dtNasc"]) || isset($pessoa["tel"]) || isset($pessoa["email"])) {
  echo "<tr>";
  echo "<td>";
  echo $pessoa["nome"];
  echo "</td>";
  echo "<td>";
  echo $pessoa["genero"];
  echo "</td>";
  echo "<td>";
  echo $pessoa["dtNasc"];
  echo "</td>";
  echo "<td>";
  echo $pessoa["tel"];
  echo "</td>";
  echo "<td>";
  echo $pessoa["email"];
  echo "</td>";
  echo "</tr>";
}

}
echo "</table>";
fclose($file);
?>