<%@page session="true"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="cabecalho.jsp"/>
 <div class="jumbotron">
  <h2>Ol&aacute; <b>${usuario}</b>, o c&acirc;mbio de hoje &eacute;:</h2>
<br/><br/>
<!-- FXEXCHANGERATE.COM EXCHANGE RATE CONVERTER START -->
<div style="width:196px;border:1px solid #2D6AB4;background-color:#F0F0F0;">
 <div style="text-align:left;background-color:#2D6AB4;border-bottom:0px;height:18px; font-size:12px;font-weight:bold;padding-top:2px; padding-left:5px">
 <span  style="background-image:url(http://ww.fxexchangerate.com/flag.png); background-position: 0 -2064px; width:100%; height:15px; background-repeat:no-repeat;padding-left:2px;">
 <a href="http://usd.fxexchangerate.com/" target="_blank" style="color:#FFFFFF; text-decoration:none;padding-left:22px;">Dólar dos Estados Unidos</a></span></div>
 <script type="text/javascript">var fm="USD";var ft="BRL,EUR,GBP,JPY,";var hb="2D6AB4";var hc="FFFFFF";var bb = "F0F0F0";var bo = "2D6AB4";var tz="-3s";var wh="196x140";var lg="pt";</script>
 <script type="text/javascript" src="http://www.fxexchangerate.com/converter.php"></script>
<br/><br/>
 </div><!-- FXEXCHANGERATE.COM  EXCHANGE RATE CONVERTER END -->
  <a href="http://pt.fxexchangerate.com/exchange-rates-widget.html">Taxas de C&acirc;mbio Widget</a>
 </div>
<jsp:include page="rodape.jsp"/>