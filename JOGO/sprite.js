function sprite(x, y, largura, altura){
	this.x = x;
	this.y = y;
	this.largura = largura;
	this.altura = altura;

	this.desenha = function(xCanvas, yCanvas){
		ctx.drawImage(img, this.x, this.y, this.largura, this.altura, xCanvas, yCanvas, this.largura, this.altura);
	}
}

var bg = new sprite(0, 0, 800, 500);
var spriteBoneco = new sprite(806, 0, 80, 57);
var spriteChao = new sprite(0, 505, 800, 112);
var spriteLogo = new sprite(806, 74, 500, 414);
var spritePerdeu = new sprite(806, 505, 342, 118);