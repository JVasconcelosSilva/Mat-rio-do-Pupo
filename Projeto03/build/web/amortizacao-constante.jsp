<%-- 
    Document   : amortizacao-constante
    Created on : 15/03/2019, 20:45:20
    Author     : Jefferson Vasconcelos, Lucas Venancio
--%>

<%@page import="java.text.DecimalFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
              integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <title>Amortização Constante</title>
    </head>

    <body>
        <div id="corpo">
            <%@include file = "WEB-INF/jspf/menu.jspf"%>
            <%@include file = "WEB-INF/jspf/header.jspf"%>
            <h1>Amortização Constante</h1>
            <form>
                <p>Valor Financiamento<br><input class="form-control" type="text" name="financiamento" required>
                <p>Tempo (Meses)<br><input class="form-control" type="number" name="tempo" required>
                <p>Taxa de Juros (%)<br><input class="form-control" type="text" name="taxa" required>
                    <br><button type="submit" class="btn btn-primary btn-lg btn-block" name="enviar">Enviar</button>

            </form>
            <br><a href="home.jsp" class="btn btn-secondary btn-lg active" role="button" aria-pressed="true" style="width: 10%">Voltar</a><br>
            <%if (request.getParameter("enviar") != null) {%>
            <%try { %> 
            <hr>
            <%DecimalFormat df = new DecimalFormat("#,##0.00");%> 

            <% double financiamento = Double.parseDouble(request.getParameter("financiamento"));%>
            <% int tempo = Integer.parseInt(request.getParameter("tempo"));%>
            <% double taxa = Double.parseDouble(request.getParameter("taxa"));%>

            <%double devedor = financiamento;%>
            <%double amortizacao = financiamento / tempo;%>
            <%double juros = (taxa * devedor) / 100;%>
            <%double parcela = amortizacao + juros;%>

            <%double totParcela = 0;%>
            <%double totAmortizacao = 0;%>
            <%double totJuros = 0;%>


            <table border = "1">
                <th>Mês</th>
                <th>Parcela</th> 
                <th>Amortização</th>
                <th>Juros</th>
                <th>Saldo Devedor</th>
                    <%for (int i = 1; i <= tempo; i++) {%>

                <%parcela = amortizacao + juros;%>
                <%devedor -= amortizacao;%>

                <tr>
                    <td><%=i%></td>
                    <td>R$  <%=df.format(parcela)%></td>
                    <td>R$  <%=df.format(amortizacao)%></td>
                    <td>R$  <%=df.format(juros)%></td>
                    <td>R$  <%=df.format(devedor)%></td>
                </tr>

                <%totParcela += parcela;%>
                <%totAmortizacao += amortizacao;%>
                <%totJuros += juros;%>
                <%juros = (taxa * devedor) / 100;%>
                <%}%>
                <tr id="fim">
                    <td>Total: </td>
                    <td>R$  <%=df.format(totParcela)%></td>
                    <td>R$  <%=df.format(totAmortizacao)%></td>
                    <td>R$  <%=df.format(totJuros)%></td>
                    <td>R$  <%=df.format(devedor)%></td>
                </tr>
            </table>
            <%} catch (Exception ex) {%>
            <h3 style="color: red">Erro: <%=ex.getMessage()%></h3>
            <%}%>
            <%}%>
        </div>
        <div id="rodape">
            <%@include file = "WEB-INF/jspf/footer.jspf"%>
        </div>
    </body>


</html>
