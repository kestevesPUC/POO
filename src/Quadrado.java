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
  * Quadrado, especialização de polígono (lembre-se do perigo de herdar de RETÂNGULO)
  */
public class Quadrado extends PoligonoReto{
    
    /**
     * Construtor, recebendo o lado
     * @param lado Lado (será passado como base e altura e validado pelo construtor do polígono)
     */
    public Quadrado(double lado){
        super(lado, lado);
        this.descricao = "Quadrado";
    }

    @Override
    /**
     * Área do quadrado
     */
    public final double area(){
        return this.altura * this.base;
    }

    @Override
    /**
     * Perímetro do quadrado
     */
    public double perimetro(){
        return 2*this.altura + 2*this.base;
    }
    
    @Override
    /**
     * Descricao, com lado
     * @return String Descrição do quadrado com seu lado
     */
    public String toString(){
        String aux = super.toString();
        return aux + "("+this.base+")";
    }
}
