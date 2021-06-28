package definicaoPassos;

import triangulo.Triangulo;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

import static org.junit.Assert.assertEquals;

public class DefPassos {

      Triangulo triangulo;
      String tipo;

      public void VerifaTipoTriangulo(int a, int b, int c) {
          tipo = triangulo.verificaTriangulo(a, b, c);
      }

      @Dado("que um triangulo foi inicializado")
      public void que_um_triangulo_foi_inicializado() {
          triangulo = new Triangulo();
      }

      @Quando("os numeros 2, 6, 8 sao informados")
      public void os_numeros_sao_informados() {
    	  VerifaTipoTriangulo(2, 6, 8);
      }

      @Entao("a verificacao nao e valida")
      public void a_verificacao_nao_e_valida() {
          assertEquals(tipo, "Nao eh um triangulo");
      }

      @Quando("os numeros 40, 40, 40 sao informados")
      public void os_numeros_sao_informados_equilatero() {
    	  VerifaTipoTriangulo(40, 40, 40);
      }

      @Entao("eles formam um triangulo do tipo equilatero")
      public void eles_formam_um_triangulo_do_tipo_equilatero() {
          assertEquals("O triangulo eh equilatero", tipo);
      }

      @Quando("os numeros 40, 30, 40 sao informados")
      public void os_numeros_sao_informados_isosceles() {
    	  VerifaTipoTriangulo(40, 30, 40);
      }

      @Entao("eles formam um triangulo do tipo isosceles")
      public void eles_formam_um_triangulo_do_tipo_isosceles() {
          assertEquals("O triangulo eh isosceles", tipo);
      }

      @Quando("os numeros 16, 20, 30 sao informados")
      public void os_numeros_sao_informados_escaleno() {
    	  VerifaTipoTriangulo(16, 20, 30);
      }

      @Entao("eles formam um triangulo do tipo escaleno")
      public void eles_formam_um_triangulo_do_tipo_escaleno() {
          assertEquals("O triangulo eh escaleno", tipo);
      }
}


