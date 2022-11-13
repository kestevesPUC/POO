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
  * Círculo: herança de figura
  */
public class Circulo extends Figura{
    //atributo
    private double raio;

    /**
     * Construtor. Raio mínimo = 1
     * @param raio O raio do círculo
     */
    public Circulo(double raio){
        super("Circulo");
        this.raio = 1;
        if(raio>1)
            this.raio = raio;
    }

    @Override
    /**
     * Área do círculo (sobrescrita de figura)
     * @return double Área do círculo
     */
    public double area(){
        return Math.PI * Math.pow(this.raio,2);
    }

    @Override
    /**
     * Perímetro do círculo (sobrescrita de figura)
     * @return double Perímetro do círculo
     */
    public double perimetro(){
        return 2*Math.PI*this.raio;
    }

    @Override
    /**
     * Descricao, com raio
     * @return String Descrição do círculo com seu raio
     */
    public String toString(){
        String aux = super.toString();
        return aux + "("+this.raio+")";
    }
}
