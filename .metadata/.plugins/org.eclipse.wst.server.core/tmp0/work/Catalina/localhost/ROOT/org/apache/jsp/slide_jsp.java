/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.37
 * Generated at: 2022-12-17 04:52:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class slide_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>모람모람</title>\r\n");
      out.write("\r\n");
      out.write("<meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\">\r\n");
      out.write("<meta content=\"\" name=\"keywords\">\r\n");
      out.write("<meta content=\"\" name=\"description\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/swiper/swiper-bundle.min.css\"/>\r\n");
      out.write("\r\n");
      out.write("<!-- 링크 끝 -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" <style>\r\n");
      out.write("html,\r\n");
      out.write("body {\r\n");
      out.write("  position: relative;\r\n");
      out.write("  height: 100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(".swiper {\r\n");
      out.write("  width: 100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".swiper-slide {\r\n");
      out.write("  text-align: center;\r\n");
      out.write("  font-size: 18px;\r\n");
      out.write("  background: #fff;\r\n");
      out.write("\r\n");
      out.write("  /* Center slide text vertically */\r\n");
      out.write("  display: -webkit-box;\r\n");
      out.write("  display: -ms-flexbox;\r\n");
      out.write("  display: -webkit-flex;\r\n");
      out.write("  display: flex;\r\n");
      out.write("  -webkit-box-pack: center;\r\n");
      out.write("  -ms-flex-pack: center;\r\n");
      out.write("  -webkit-justify-content: center;\r\n");
      out.write("  justify-content: center;\r\n");
      out.write("  -webkit-box-align: center;\r\n");
      out.write("  -ms-flex-align: center;\r\n");
      out.write("  -webkit-align-items: center;\r\n");
      out.write("  align-items: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".swiper-slide img {\r\n");
      out.write("  display: block;\r\n");
      out.write("  width: 100%;\r\n");
      out.write("  height: 100%;\r\n");
      out.write("  object-fit: cover;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".append-buttons {\r\n");
      out.write("  text-align: center;\r\n");
      out.write("  margin-top: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".append-buttons button {\r\n");
      out.write("  display: inline-block;\r\n");
      out.write("  cursor: pointer;\r\n");
      out.write("  border: 1px solid #007aff;\r\n");
      out.write("  color: #007aff;\r\n");
      out.write("  text-decoration: none;\r\n");
      out.write("  padding: 4px 10px;\r\n");
      out.write("  border-radius: 4px;\r\n");
      out.write("  margin: 0 10px;\r\n");
      out.write("  font-size: 13px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<h3 style=\"text-align: center;margin-top: 100px;\">지금 바로 원하는 서비스를 받아보세요!</h3>\r\n");
      out.write("    <div #swiperRef=\"\" class=\"swiper mySwiper\">\r\n");
      out.write("      <div class=\"swiper-wrapper\">\r\n");
      out.write("        <div class=\"swiper-slide\"><img src=\"./img/배너 (1).png\"></div>\r\n");
      out.write("        <div class=\"swiper-slide\"><img src=\"./img/배너 (2).png\"></div>\r\n");
      out.write("        <div class=\"swiper-slide\"><img src=\"./img/배너 (3).png\"></div>\r\n");
      out.write("        <div class=\"swiper-slide\"><img src=\"./img/배너 (4).png\"></div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"swiper-button-next\"></div>\r\n");
      out.write("      <div class=\"swiper-button-prev\"></div>\r\n");
      out.write("      <div class=\"swiper-pagination\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- Swiper JS -->\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/swiper/swiper-bundle.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Initialize Swiper -->\r\n");
      out.write("<script>\r\n");
      out.write("  var swiper = new Swiper(\".mySwiper\", {\r\n");
      out.write("    slidesPerView: 3,\r\n");
      out.write("    centeredSlides: true,\r\n");
      out.write("    spaceBetween: 30,\r\n");
      out.write("    pagination: {\r\n");
      out.write("      el: \".swiper-pagination\",\r\n");
      out.write("      type: \"fraction\",\r\n");
      out.write("    },\r\n");
      out.write("    navigation: {\r\n");
      out.write("      nextEl: \".swiper-button-next\",\r\n");
      out.write("      prevEl: \".swiper-button-prev\",\r\n");
      out.write("    },\r\n");
      out.write("  });\r\n");
      out.write("\r\n");
      out.write("  var appendNumber = 4;\r\n");
      out.write("  var prependNumber = 1;\r\n");
      out.write("  document\r\n");
      out.write("    .querySelector(\".prepend-2-slides\")\r\n");
      out.write("    .addEventListener(\"click\", function (e) {\r\n");
      out.write("      e.preventDefault();\r\n");
      out.write("      swiper.prependSlide([\r\n");
      out.write("        '<div class=\"swiper-slide\">Slide ' + --prependNumber + \"</div>\",\r\n");
      out.write("        '<div class=\"swiper-slide\">Slide ' + --prependNumber + \"</div>\",\r\n");
      out.write("      ]);\r\n");
      out.write("    });\r\n");
      out.write("  document\r\n");
      out.write("    .querySelector(\".prepend-slide\")\r\n");
      out.write("    .addEventListener(\"click\", function (e) {\r\n");
      out.write("      e.preventDefault();\r\n");
      out.write("      swiper.prependSlide(\r\n");
      out.write("        '<div class=\"swiper-slide\">Slide ' + --prependNumber + \"</div>\"\r\n");
      out.write("      );\r\n");
      out.write("    });\r\n");
      out.write("  document\r\n");
      out.write("    .querySelector(\".append-slide\")\r\n");
      out.write("    .addEventListener(\"click\", function (e) {\r\n");
      out.write("      e.preventDefault();\r\n");
      out.write("      swiper.appendSlide(\r\n");
      out.write("        '<div class=\"swiper-slide\">Slide ' + ++appendNumber + \"</div>\"\r\n");
      out.write("      );\r\n");
      out.write("    });\r\n");
      out.write("  document\r\n");
      out.write("    .querySelector(\".append-2-slides\")\r\n");
      out.write("    .addEventListener(\"click\", function (e) {\r\n");
      out.write("      e.preventDefault();\r\n");
      out.write("      swiper.appendSlide([\r\n");
      out.write("        '<div class=\"swiper-slide\">Slide ' + ++appendNumber + \"</div>\",\r\n");
      out.write("        '<div class=\"swiper-slide\">Slide ' + ++appendNumber + \"</div>\",\r\n");
      out.write("      ]);\r\n");
      out.write("    });\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}