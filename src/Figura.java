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
  * Classe abstrata: figura geométrica
  */
public abstract class Figura{

    //atributo
    protected String descricao;

    /**
     * Construtor a ser chamado pelas filhas. Define a descrição
     * @param desc Descrição (sem validação)
     */
    public Figura(String desc){
        this.descricao = desc;
    }

    /**
     * Método abstrato para área da figura
     * @return Área da figura
     */
    public abstract double area();


    /**
     * Método abstrato para perímetro da figura
     * @return perímetro da figura
     */
    public abstract double perimetro();


    @Override
    /**
     * Descrição: 'nome' da figura
     * @return Descrição simples da figura
     */
    public String toString(){
        return this.descricao;
    }
}