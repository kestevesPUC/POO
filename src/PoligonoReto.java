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
  * Classe abstrata que herda de Figura, para agrupar base e altura
  */
public abstract class PoligonoReto extends Figura{
    
    //atributos
    protected double base;
    protected double altura;

    /**
     * Construtor: base e altura mínimas = 1
     * @param base Base do polígono (valor mínimo 1)
     * @param altura Altura do polígono (valor mínimo 1)
     */
    public PoligonoReto(double base, double altura){
        super("Poligono");
        this.base = 1;
        this.altura = 1;
        if(base>1) this.base = base;
        if(altura>1) this.altura = altura;
    }

    /**
     * Retorna a base
     * @return Dimensão da base (double)
     */
    public double getBase(){
        return this.base;
    }

    
    /**
     * Retorna a altura
     * @return Dimensão da altura (double)
     */
    public double getAltura(){
        return this.altura;
    }
}
