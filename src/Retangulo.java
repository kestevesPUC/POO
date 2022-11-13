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
  * Retângulo, especialização de polígono
  */
public class Retangulo extends PoligonoReto{
    
    /**
     * Construtor, recebendo base e altura
     * @param base Base (será repassada e validada pelo construtor do polígono)
     * @param alt Altura (será repassada e validada pelo construtor do polígono)
     */
    public Retangulo(double base, double alt){
        super(base, alt);
        this.descricao = "Retangulo";
    }

    
    @Override
    /**
     * Área do retângulo
     */
    public final double area(){
        return this.altura * this.base;
    }

    @Override
    /**
     * Perímetro do retângulo
     */
    public double perimetro(){
        return 2*this.altura + 2*this.base;
    }

    @Override
    /**
     * Descricao, com base e altura
     * @return String Descrição do retângulo com suas dimensões
     */
    public String toString(){
        String aux = super.toString();
        return aux + "("+this.base+" ; "+this.altura+")";
    }
}
