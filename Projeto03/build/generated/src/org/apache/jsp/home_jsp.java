package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/WEB-INF/jspf/menu.jspf");
    _jspx_dependants.add("/WEB-INF/jspf/footer.jspf");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\"\n");
      out.write("              integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("        <title>Home</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("\n");
      out.write("    .topo {\n");
      out.write("        overflow: hidden;\n");
      out.write("        background-color: #696969;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .topo a {\n");
      out.write("        position: relative;\n");
      out.write("        text-align: center;\n");
      out.write("        float: left;\n");
      out.write("        color: #f2f2f2;\n");
      out.write("        text-align: center;\n");
      out.write("        padding: 14px 36px;\n");
      out.write("        text-decoration: none;\n");
      out.write("        font-size: 17px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .topo a:hover {\n");
      out.write("        background-color: #d3d3d3;\n");
      out.write("        color: #000000;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<div class=\"topo\">\n");
      out.write("    <a href = \"home.jsp\">Home</a>\n");
      out.write("    <a href = \"amortizacao-constante.jsp\">Amortização Constante</a>\n");
      out.write("    <a href = \"amortizacao-americana.jsp\">Amortização Americana</a> \n");
      out.write("    <a href = \"tabela-price.jsp\">Tabela Price</a>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        \n");
      out.write("        <h1>PROJETO 03 - Home</h1>\n");
      out.write("        <hr>\n");
      out.write("        <div class=\"texto\">\n");
      out.write("        <p><a href = \"amortizacao-constante.jsp\">Amortização Constante (Tabela SAC)<a> - Também conhecido como \n");
      out.write("                    Sistema de Amortização Constante, ou Método Hamburguês, é caracterizado por pagamentos mensais \n");
      out.write("                    decrescentes, que embutem uma amortização constante;</p>\n");
      out.write("                    <p><a href = \"tabela-price.jsp\">Tabela Price<a> - Também chamado de Sistema de Parcelas Fixas, \n");
      out.write("                                ou Sistema Francês, é caracterizado por pagamentos mensais iguais, embutindo uma \n");
      out.write("                                amortização crescente;</p>\n");
      out.write("                                <p><a href = \"amortizacao-americana.jsp\">Amortização Americana<a> - É caracterizado \n");
      out.write("                                            por pagamentos mensais equivalentes aos juros, não havendo amortizações \n");
      out.write("                                            mensais e prevendo a amortização total da dívida inicial em um único pagamento \n");
      out.write("                                            ao final de um período estipulado (em meses ou anos);</p>\n");
      out.write("                                            <h2>Integrantes:</h2>\n");
      out.write("                                            <p>Jefferson Vasconcelos da Silva</p>\n");
      out.write("                                            <p>Lucas Venâncio Lima Ramos</p>\n");
      out.write("                                            </div>\n");
      out.write("                                            </body>\n");
      out.write("                                            ");
      out.write("\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("    footer{\n");
      out.write("        background-color: #696969;\n");
      out.write("        padding: 10px 20px;\n");
      out.write("    }\n");
      out.write("    #foot {\n");
      out.write("        text-align: center;\n");
      out.write("        color: #ffffff;\n");
      out.write("        position: relative;\n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("<br>\n");
      out.write("<footer>\n");
      out.write("<hr><div id=\"foot\"><p text-align=\"center\">Praia Grande - 2019<br>Jefferson Vasconcelos - Lucas Venâncio</p></div>\n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                            </html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
