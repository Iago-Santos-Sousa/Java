const input = document.getElementById('input');
const btn = document.getElementById('btn');
const main = document.getElementById('main')
const container1 = document.querySelector('.container1')
let contador = 0


btn.addEventListener('click', function () {
  if (input.value == '' || input.value == null) {

    alert("Insira uma tarefa");
    return false;
  }

  contador++
  const secao = document.createElement('section')
  secao.className = 'resultado'
  const span = document.createElement('span')
  const span2 = document.createElement('span')
  span.className = 'tarefa'
  span2.innerHTML = '<i class="fas fa-trash-alt"></i>'
  span2.className = 'icone'
  span2.title = 'Excluir'
  const texto = document.createTextNode(`Tarefa ${contador.toString()} - ${input.value}`)
  span.appendChild(texto)

  secao.append(span, span2)
  document.body.appendChild(secao)
  input.value = ''
  input.focus()
  span2.addEventListener('click', () => {
    secao.remove()
    contador--
    input.focus()
  })

})

