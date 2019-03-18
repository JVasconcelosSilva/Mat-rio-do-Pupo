package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.DecimalFormat;

public final class tabela_002dprice_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/WEB-INF/jspf/menu.jspf");
    _jspx_dependants.add("/WEB-INF/jspf/header.jspf");
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\"\n");
      out.write("              integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">\n");
      out.write("        <title>Tabela Price</title>\n");
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
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<header>\n");
      out.write("\n");
      out.write("</header>\n");
      out.write("<style>\n");
      out.write("    #fim td{\n");
      out.write("       font-weight: bold;  \n");
      out.write("    }\n");
      out.write("    h1{\n");
      out.write("        position: relative;\n");
      out.write("        left: 4%;\n");
      out.write("    }\n");
      out.write("    a{\n");
      out.write("        position: relative;\n");
      out.write("        left: 5%;\n");
      out.write("    }\n");
      out.write("    form{\n");
      out.write("        \n");
      out.write("        position: relative;\n");
      out.write("        left: 5%;\n");
      out.write("        align-content: center;\n");
      out.write("    }\n");
      out.write("    table {\n");
      out.write("        position: relative;\n");
      out.write("        font-family: arial, sans-serif;\n");
      out.write("        border-collapse: collapse;\n");
      out.write("        width: 60%;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    td, th {\n");
      out.write("        border: 1px solid #dddddd;\n");
      out.write("        text-align: left;\n");
      out.write("        padding: 8px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    tr:nth-child(even) {\n");
      out.write("        background-color: #dddddd;\n");
      out.write("    }\n");
      out.write("    form{\n");
      out.write("        width: 10%;\n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <h1>Tabela Price</h1>\n");
      out.write("        <form>\n");
      out.write("            <p>Valor Financiamento<br><input class=\"form-control\" type=\"text\" name=\"financiamento\" required>\n");
      out.write("            <p>Tempo (Meses)<br><input class=\"form-control\" type=\"number\" name=\"tempo\" required>\n");
      out.write("            <p>Taxa de Juros (%)<br><input class=\"form-control\" type=\"text\" name=\"taxa\" required>\n");
      out.write("                <br><button type=\"submit\" class=\"btn btn-primary btn-lg btn-block\" name=\"enviar\">Enviar</button>\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        <br><a href=\"home.jsp\" class=\"btn btn-secondary btn-lg active\" role=\"button\" aria-pressed=\"true\" style=\"width: 10%\">Voltar</a><br>\n");
      out.write("        ");
if (request.getParameter("enviar") != null) {
      out.write("\n");
      out.write("        ");
try { 
      out.write(" \n");
      out.write("        <hr>\n");
      out.write("        ");
DecimalFormat df = new DecimalFormat("#,##0.00");
      out.write(" \n");
      out.write("\n");
      out.write("        ");
 double financiamento = Double.parseDouble(request.getParameter("financiamento"));
      out.write("\n");
      out.write("        ");
 int tempo = Integer.parseInt(request.getParameter("tempo"));
      out.write("\n");
      out.write("        ");
 double taxa = Double.parseDouble(request.getParameter("taxa"));
      out.write("\n");
      out.write("\n");
      out.write("        ");
double parcela = financiamento * (Math.pow((1 + taxa), tempo) * taxa) / (Math.pow((1 + taxa), tempo) - 1);
      out.write("\n");
      out.write("        ");
double juros = 0;
      out.write("\n");
      out.write("        ");
double amortizacao = parcela / juros;
      out.write("\n");
      out.write("\n");
      out.write("        ");
double devedor = financiamento;
      out.write("\n");
      out.write("        ");
double totParcela = 0;
      out.write("\n");
      out.write("        ");
double totAmortizacao = 0;
      out.write("\n");
      out.write("        ");
double totJuros = 0;
      out.write("\n");
      out.write("\n");
      out.write("        <table border = \"1\">\n");
      out.write("            <th>Mês</th>\n");
      out.write("            <th>Parcela</th> \n");
      out.write("            <th>Amortização</th>\n");
      out.write("            <th>Juros</th>\n");
      out.write("            <th>Saldo Devedor</th>\n");
      out.write("                ");
for (int i = 1; i <= tempo; i++) {
      out.write("\n");
      out.write("\n");
      out.write("            ");
juros = (devedor * (taxa / 100)) * 100;
      out.write("\n");
      out.write("            ");
amortizacao = parcela - juros;
      out.write("\n");
      out.write("            ");
devedor = devedor - parcela + juros;
      out.write("\n");
      out.write("            ");
financiamento -= parcela;
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print(i);
      out.write("</td>\n");
      out.write("                <td>R$  ");
      out.print(df.format(parcela));
      out.write("</td>\n");
      out.write("                <td>R$  ");
      out.print(df.format(amortizacao));
      out.write("</td>\n");
      out.write("                <td>R$  ");
      out.print(df.format(juros));
      out.write("</td>\n");
      out.write("                <td>R$  ");
      out.print(df.format(devedor));
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("            ");
totParcela += parcela;
      out.write("\n");
      out.write("            ");
totAmortizacao += amortizacao;
      out.write("\n");
      out.write("            ");
totJuros += juros;
      out.write("\n");
      out.write("            ");
juros = (taxa * devedor) / 100;
      out.write("\n");
      out.write("            ");
}
      out.write("\n");
      out.write("            <tr id=\"fim\">\n");
      out.write("                <td>Total: </td>\n");
      out.write("                <td>R$  ");
      out.print(df.format(totParcela));
      out.write("</td>\n");
      out.write("                <td>R$  ");
      out.print(df.format(totAmortizacao));
      out.write("</td>\n");
      out.write("                <td>R$  ");
      out.print(df.format(totJuros));
      out.write("</td>\n");
      out.write("                <td>R$  ");
      out.print(df.format(devedor));
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        ");
} catch (Exception ex) {
      out.write("\n");
      out.write("        <h3 style=\"color: red\">Erro: ");
      out.print(ex.getMessage());
      out.write("</h3>\n");
      out.write("        ");
}
      out.write("\n");
      out.write("        ");
}
      out.write("\n");
      out.write("    </body>\n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("    footer{\n");
      out.write("        background-color: #696969;\n");
      out.write("        position: absolute;\n");
      out.write("        bottom: auto;\n");
      out.write("        width: 100%;\n");
      out.write("    }\n");
      out.write("    #foot {\n");
      out.write("        text-align: center;\n");
      out.write("        color: #ffffff;\n");
      out.write("        position: relative;\n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("<br>\n");
      out.write("<footer>\n");
      out.write("<hr><div id=\"foot\"><p text-align=\"center\">Praia Grande 2019<br>Jefferson Vasconcelos - Lucas Venâncio</p></div>\n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("</html>\n");
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
