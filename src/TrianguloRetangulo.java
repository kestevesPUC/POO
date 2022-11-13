/** 
 * MIT License
 *
 * Copyright(c) 2022 João Caram <caram@pucminas.br>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

 /**
  * Triângulo Retângulo, especialização de polígono
  */
public class TrianguloRetangulo extends PoligonoReto{
    
    /**
     * Construtor: os catetos são base e altura do triângulo
     * @param cateto1 Cateto tratado como base (repassado e validado pelo polígono)
     * @param cateto2 Cateto tratado como altura (repassado e validado pelo polígono)
     */
    public TrianguloRetangulo(double cateto1, double cateto2){
        super(cateto1, cateto2);
        this.descricao = "Triangulo";
    }

    @Override
    /**
     * Área do triângulo
     */
    public double area(){
        return (this.altura * this.base)/2;
    }

    /**
     * Hipotenusa, para perímetro
     * @return Valor da hipotenusa do triângulo
     */
    private double hipotenusa(){
        return Math.hypot(this.base, this.altura);
    }

    @Override
    /**
     * Perímetro do triângulo
     */
    public double perimetro(){ 
        return this.altura + this.base + this.hipotenusa();
    }

    @Override
    /**
     * Descricao, com os 3 lados
     * @return String Descrição do triângulo com seus lados
     */
    public String toString(){
        String aux = super.toString();
        return aux + "("+this.base+" ; "+this.altura+" ; " + this.hipotenusa()+")";
    }
}
