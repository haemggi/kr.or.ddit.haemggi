/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.37
 * Generated at: 2022-12-28 13:31:46 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Map;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1672060374356L));
    _jspx_dependants.put("jar:file:/C:/Users/seolah/Documents/Java/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/MYBOARD/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.Map");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <header class=\"main-header\">\r\n");
      out.write("    <!-- Logo -->\r\n");
      out.write("    <a href=\"index.jsp\" class=\"logo\">\r\n");
      out.write("      <!-- mini logo for sidebar mini 50x50 pixels -->\r\n");
      out.write("      <span class=\"logo-mini\"><b>A</b>LT</span>\r\n");
      out.write("      <!-- logo for regular state and mobile devices -->\r\n");
      out.write("      <span class=\"logo-lg\"><b>Admin</b>LTE</span>\r\n");
      out.write("    </a>\r\n");
      out.write("    <!-- Header Navbar: style can be found in header.less -->\r\n");
      out.write("    <nav class=\"navbar navbar-static-top\">\r\n");
      out.write("      <!-- Sidebar toggle button-->\r\n");
      out.write("      <a href=\"#\" class=\"sidebar-toggle\" data-toggle=\"push-menu\" role=\"button\">\r\n");
      out.write("        <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("      </a>\r\n");
      out.write("\r\n");
      out.write("      <div class=\"navbar-custom-menu\">\r\n");
      out.write("        <ul class=\"nav navbar-nav\">\r\n");
      out.write("          <!-- User Account: style can be found in dropdown.less -->\r\n");
      out.write("          <li class=\"dropdown user user-menu\">\r\n");
      out.write("            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
      out.write("              <img src=\"dist/img/user2-160x160.jpg\" class=\"user-image\" alt=\"User Image\">\r\n");
      out.write("              <span class=\"hidden-xs\">Alexander Pierce</span>\r\n");
      out.write("            </a>\r\n");
      out.write("            <ul class=\"dropdown-menu\">\r\n");
      out.write("              <!-- User image -->\r\n");
      out.write("              <li class=\"user-header\">\r\n");
      out.write("                <img src=\"dist/img/user2-160x160.jpg\" class=\"img-circle\" alt=\"User Image\">\r\n");
      out.write("\r\n");
      out.write("                <p>Alexander Pierce - Web Developer<small>Member since Nov. 2012</small>\r\n");
      out.write("                </p>\r\n");
      out.write("              </li>\r\n");
      out.write("              <!-- Menu Body -->\r\n");
      out.write("              <li class=\"user-body\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                  <div class=\"col-xs-4 text-center\">\r\n");
      out.write("                    <a href=\"#\">Followers</a>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"col-xs-4 text-center\">\r\n");
      out.write("                    <a href=\"#\">Sales</a>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"col-xs-4 text-center\">\r\n");
      out.write("                    <a href=\"#\">Friends</a>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- /.row -->\r\n");
      out.write("              </li>\r\n");
      out.write("              <!-- Menu Footer-->\r\n");
      out.write("              <li class=\"user-footer\">\r\n");
      out.write("                <div class=\"pull-left\">\r\n");
      out.write("                  <a href=\"#\" class=\"btn btn-default btn-flat\">Profile</a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"pull-right\">\r\n");
      out.write("                  <a href=\"#\" class=\"btn btn-default btn-flat\">Sign out</a>\r\n");
      out.write("                </div>\r\n");
      out.write("              </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("          </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("  </header>");
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
