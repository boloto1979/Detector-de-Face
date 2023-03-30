# Detector de Rosto utilizando Java e OpenCV
Este é um pequeno projeto de detecção de rosto utilizando a linguagem de programação Java e a biblioteca OpenCV.

## Requisitos ##
Java JDK 8 ou superior
OpenCV 3.0 ou superior

## Como utilizar ##
Faça o download do arquivo "haarcascade_frontalface_alt.xml" e coloque-o na raiz do projeto.
Abra o arquivo FaceDetection.java em sua IDE Java preferida.
Verifique se a variável "filename" possui o nome correto para a imagem de saída.
Execute o arquivo FaceDetection.java.
Verifique se a imagem de saída foi gerada com sucesso no diretório especificado.

## Como funciona ##
Este projeto utiliza o algoritmo de detecção de rosto baseado em Haar Cascade, que é uma técnica de aprendizado de máquina utilizada para detectar objetos em imagens ou vídeos.

O código começa carregando a biblioteca OpenCV e o arquivo XML com o modelo treinado para a detecção de rostos. Em seguida, é carregada uma imagem para ser analisada. A detecção de rostos é feita utilizando a função detectMultiScale(), que procura por padrões na imagem que correspondem ao modelo treinado.

Cada face detectada é desenhada com um retângulo verde utilizando a função rectangle(). Finalmente, a imagem com as faces detectadas é salva em um arquivo e uma mensagem é exibida no console indicando que a detecção foi realizada com sucesso.

## Contribuindo ##
Sinta-se à vontade para contribuir com melhorias e correções de bugs neste projeto. Para isso, basta fazer um fork do repositório, fazer as alterações necessárias e criar um pull request para ser revisado pela equipe de desenvolvimento.
