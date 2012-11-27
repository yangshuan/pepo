/* Generated By:JavaCC: Do not edit this line. SasParser.java */
package com.olol.utils.jj;

import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import org.springframework.core.io.ClassPathResource;

public class SasParser implements SasParserConstants {
  public static int count = 0;
  public static List<String> variables = new ArrayList<String>();

  static class IfStatement
  {
    String varName;
    String woeName;
    String statement;
  }

  public static String charTrim(String str)
  {
    return str.substring(1, str.length() - 1);
  }

  public static void main(String args [])
  {
    InputStream input;
    try
    {
      File woeFile = new ClassPathResource("variables.woe").getFile();
      input = new java.io.FileInputStream(woeFile);
    }
    catch (IOException e)
    {
      System.out.println("File not found.");
      return;
    }

    try
    {
      SasParser parser = new SasParser(input);
      parser.translation_unit();
    }
    catch (ParseException e)
    {
      e.printStackTrace();
    }
  }

  static final public void translation_unit() throws ParseException {
    label_1:
    while (true) {
      if (jj_2_1(2)) {
        ;
      } else {
        break label_1;
      }
      external_declaration();
    }
    jj_consume_token(0);
  }

  static final public void external_declaration() throws ParseException {
  StringBuilder sb = new StringBuilder();
  String str;
  IfStatement ifstatement = new IfStatement();
    ifstatement = if_statement();
    sb.append(ifstatement.statement + "\u005cn");
    label_2:
    while (true) {
      if (jj_2_2(2)) {
        ;
      } else {
        break label_2;
      }
      str = elseif_statement();
       sb.append(str + "\u005cn");
    }
    str = else_statement();
       sb.append(str);
    label_3:
    while (true) {
      if (jj_2_3(2)) {
        ;
      } else {
        break label_3;
      }
      label_statement();
    }
    count++;
    variables.add(ifstatement.varName.toUpperCase());
    if (count ==1)
      System.out.println("if(" + ifstatement.varName.toUpperCase() + ".getName().equals(varName)){");
    else
      System.out.println("else if(" + ifstatement.varName.toUpperCase() + ".getName().equals(varName)){");
    System.out.println(sb);
    System.out.println("woeMap.put(\u005c"" + ifstatement.woeName +"\u005c", woeValue);");
    System.out.println("}");
  }

  static final public IfStatement if_statement() throws ParseException {
  Token flag = new Token();
  Token t;
  Token value;
  StringBuilder sb = new StringBuilder();
  String str ;
  IfStatement ifstatement = new IfStatement();
    jj_consume_token(IF);
    str = var_indentifier();
        sb.append("if ");
        ifstatement.varName = str;
    if (jj_2_6(2)) {
      jj_consume_token(42);
      if (jj_2_4(2)) {
        t = jj_consume_token(CHARACTER_LITERAL);
            sb.append("(value.equals(\u005c""+charTrim(t.toString()).trim()+"\u005c"))");
      } else if (jj_2_5(2)) {
        t = jj_consume_token(43);
            sb.append("(value == null)");
      } else {
        jj_consume_token(-1);
        throw new ParseException();
      }
    } else if (jj_2_7(2)) {
      str = stringvalue_desc();
      sb.append("(" + str +")");
    } else {
      jj_consume_token(-1);
      throw new ParseException();
    }
    jj_consume_token(THEN);
    str = var_indentifier();
    jj_consume_token(42);
    sb.append(" woeValue").append(" = ");
    ifstatement.woeName = str;
    if (jj_2_8(2)) {
      flag = jj_consume_token(MINUS);
    } else {
      ;
    }
    value = jj_consume_token(FLOATING_POINT_LITERAL);
    jj_consume_token(44);
    if (flag.toString() != null && flag.toString().trim().equals("-"))
    {
      sb.append( flag.toString() + value.toString() );
    } else
    {
          sb.append( value.toString() );
    }
    {
      sb.append(";");
      ifstatement.statement = sb.toString();
    }

        {if (true) return ifstatement;}
    throw new Error("Missing return statement in function");
  }

  static final public String elseif_statement() throws ParseException {
  StringBuilder sb = new StringBuilder();
  String str;
  Token t;
    jj_consume_token(ELSE);
    jj_consume_token(IF);
    sb.append("else if ");
    if (jj_2_11(2)) {
      str = var_indentifier();
      if (jj_2_9(2)) {
        str = digitvalue_desc();
              sb.append("(" + str +")");
      } else if (jj_2_10(2)) {
        str = stringvalue_desc();
            sb.append("(" + str +")");
      } else {
        jj_consume_token(-1);
        throw new ParseException();
      }
    } else if (jj_2_12(2)) {
      jj_consume_token(LPARENTHESIS);
      str = digitvalue_desc();
      jj_consume_token(RPARENTHESIS);
    sb.append("(" + str +")");
    } else {
      jj_consume_token(-1);
      throw new ParseException();
    }
    jj_consume_token(THEN);
    str = var_indentifier();
    jj_consume_token(42);
    sb.append(" woeValue = ");
    if (jj_2_13(2)) {
      jj_consume_token(MINUS);
          sb.append("-");
    } else {
      ;
    }
    t = jj_consume_token(FLOATING_POINT_LITERAL);
    sb.append(t.toString());
    jj_consume_token(44);
    sb.append(";");
  {if (true) return sb.toString();}
    throw new Error("Missing return statement in function");
  }

  static final public String else_statement() throws ParseException {
  String str;
  Token t;
  StringBuilder sb = new StringBuilder();
    jj_consume_token(ELSE);
    str = var_indentifier();
    jj_consume_token(42);
    sb.append("else woeValue = ");
    if (jj_2_14(2)) {
      jj_consume_token(MINUS);
          sb.append("-");
    } else {
      ;
    }
    if (jj_2_15(2)) {
      t = jj_consume_token(FLOATING_POINT_LITERAL);
    } else if (jj_2_16(2)) {
      t = jj_consume_token(INTEGER_LITERAL);
    } else {
      jj_consume_token(-1);
      throw new ParseException();
    }
    sb.append(t.toString());
    jj_consume_token(44);
    sb.append(";");
  {if (true) return sb.toString();}
    throw new Error("Missing return statement in function");
  }

  static final public void label_statement() throws ParseException {
    jj_consume_token(LABEL);
    var_indentifier();
    jj_consume_token(42);
    jj_consume_token(CHARACTER_LITERAL);
    jj_consume_token(44);
  }

  static final public String var_indentifier() throws ParseException {
  Token t;
    t = jj_consume_token(IDENTIFIER);
        {if (true) return t.toString();}
    throw new Error("Missing return statement in function");
  }

  static final public String digitvalue_desc() throws ParseException {
  StringBuilder sb = new StringBuilder();
  String str;
  Token t;
    if (jj_2_28(2)) {
      jj_consume_token(42);
      jj_consume_token(43);
     sb.append(" = . ");
    } else if (jj_2_29(2)) {
      str = var_indentifier();
      jj_consume_token(GREATERTHAN);
   sb.append(" valueDouble > ");
      if (jj_2_17(2)) {
        jj_consume_token(MINUS);
         sb.append("-");
      } else {
        ;
      }
      if (jj_2_18(2)) {
        t = jj_consume_token(INTEGER_LITERAL);
    sb.append(t.toString());
      } else if (jj_2_19(2)) {
        t = jj_consume_token(FLOATING_POINT_LITERAL);
    sb.append(t.toString());
      } else {
        jj_consume_token(-1);
        throw new ParseException();
      }
    } else if (jj_2_30(2)) {
      if (jj_2_23(2)) {
        jj_consume_token(43);
          sb.append("");
      } else if (jj_2_24(2)) {
        if (jj_2_20(2)) {
          t = jj_consume_token(MINUS);
                  sb.append("-");
        } else {
          ;
        }
        if (jj_2_21(2)) {
          t = jj_consume_token(INTEGER_LITERAL);
        } else if (jj_2_22(2)) {
          t = jj_consume_token(FLOATING_POINT_LITERAL);
        } else {
          jj_consume_token(-1);
          throw new ParseException();
        }
       sb.append(t.toString() + " < valueDouble &&");
      } else {
        jj_consume_token(-1);
        throw new ParseException();
      }
      jj_consume_token(LESSTHAN);
      str = var_indentifier();
      jj_consume_token(LESSTHANOREQUALTO);
       sb.append(" valueDouble <= ");
      if (jj_2_25(2)) {
        jj_consume_token(MINUS);
           sb.append("-");
      } else {
        ;
      }
      if (jj_2_26(2)) {
        t = jj_consume_token(INTEGER_LITERAL);
      sb.append(t.toString());
      } else if (jj_2_27(2)) {
        t = jj_consume_token(FLOATING_POINT_LITERAL);
      sb.append(t.toString());
      } else {
        jj_consume_token(-1);
        throw new ParseException();
      }
    } else {
      jj_consume_token(-1);
      throw new ParseException();
    }
    {if (true) return sb.toString();}
    throw new Error("Missing return statement in function");
  }

  static final public String stringvalue_desc() throws ParseException {
  StringBuilder sb = new StringBuilder();
  Token t;
    if (jj_2_34(2)) {
      jj_consume_token(42);
      t = jj_consume_token(CHARACTER_LITERAL);
    sb.append(" (value.equals("+"\u005c"" + charTrim(t.toString()).trim() + "\u005c""+")) ");
    } else if (jj_2_35(2)) {
      jj_consume_token(IN);
      jj_consume_token(LPARENTHESIS);
    sb.append("Arrays.asList( ");
      t = jj_consume_token(CHARACTER_LITERAL);
    sb.append("\u005c"" + charTrim(t.toString()).trim() + "\u005c"");
      label_4:
      while (true) {
        if (jj_2_31(2)) {
          ;
        } else {
          break label_4;
        }
        jj_consume_token(45);
       sb.append(",");
        if (jj_2_32(2)) {
          t = jj_consume_token(CHARACTER_LITERAL);
                                 sb.append("\u005c"" + charTrim(t.toString()).trim() + "\u005c"");
        } else if (jj_2_33(2)) {
          t = jj_consume_token(STRING_LITERAL);
                                sb.append("\u005c"" + charTrim(t.toString()).trim() + "\u005c"");
        } else {
          jj_consume_token(-1);
          throw new ParseException();
        }
      }
      jj_consume_token(RPARENTHESIS);
           sb.append(")" + ".contains(value) ");
    } else {
      jj_consume_token(-1);
      throw new ParseException();
    }
   {if (true) return sb.toString().trim();}
    throw new Error("Missing return statement in function");
  }

  static private boolean jj_2_1(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_1(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(0, xla); }
  }

  static private boolean jj_2_2(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_2(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(1, xla); }
  }

  static private boolean jj_2_3(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_3(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(2, xla); }
  }

  static private boolean jj_2_4(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_4(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(3, xla); }
  }

  static private boolean jj_2_5(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_5(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(4, xla); }
  }

  static private boolean jj_2_6(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_6(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(5, xla); }
  }

  static private boolean jj_2_7(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_7(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(6, xla); }
  }

  static private boolean jj_2_8(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_8(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(7, xla); }
  }

  static private boolean jj_2_9(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_9(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(8, xla); }
  }

  static private boolean jj_2_10(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_10(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(9, xla); }
  }

  static private boolean jj_2_11(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_11(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(10, xla); }
  }

  static private boolean jj_2_12(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_12(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(11, xla); }
  }

  static private boolean jj_2_13(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_13(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(12, xla); }
  }

  static private boolean jj_2_14(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_14(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(13, xla); }
  }

  static private boolean jj_2_15(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_15(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(14, xla); }
  }

  static private boolean jj_2_16(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_16(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(15, xla); }
  }

  static private boolean jj_2_17(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_17(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(16, xla); }
  }

  static private boolean jj_2_18(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_18(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(17, xla); }
  }

  static private boolean jj_2_19(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_19(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(18, xla); }
  }

  static private boolean jj_2_20(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_20(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(19, xla); }
  }

  static private boolean jj_2_21(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_21(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(20, xla); }
  }

  static private boolean jj_2_22(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_22(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(21, xla); }
  }

  static private boolean jj_2_23(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_23(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(22, xla); }
  }

  static private boolean jj_2_24(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_24(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(23, xla); }
  }

  static private boolean jj_2_25(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_25(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(24, xla); }
  }

  static private boolean jj_2_26(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_26(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(25, xla); }
  }

  static private boolean jj_2_27(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_27(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(26, xla); }
  }

  static private boolean jj_2_28(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_28(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(27, xla); }
  }

  static private boolean jj_2_29(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_29(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(28, xla); }
  }

  static private boolean jj_2_30(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_30(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(29, xla); }
  }

  static private boolean jj_2_31(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_31(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(30, xla); }
  }

  static private boolean jj_2_32(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_32(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(31, xla); }
  }

  static private boolean jj_2_33(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_33(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(32, xla); }
  }

  static private boolean jj_2_34(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_34(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(33, xla); }
  }

  static private boolean jj_2_35(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_35(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(34, xla); }
  }

  static private boolean jj_3R_6() {
    if (jj_scan_token(ELSE)) return true;
    if (jj_scan_token(IF)) return true;
    return false;
  }

  static private boolean jj_3_1() {
    if (jj_3R_5()) return true;
    return false;
  }

  static private boolean jj_3_23() {
    if (jj_scan_token(43)) return true;
    return false;
  }

  static private boolean jj_3_30() {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3_23()) {
    jj_scanpos = xsp;
    if (jj_3_24()) return true;
    }
    if (jj_scan_token(LESSTHAN)) return true;
    return false;
  }

  static private boolean jj_3_19() {
    if (jj_scan_token(FLOATING_POINT_LITERAL)) return true;
    return false;
  }

  static private boolean jj_3_18() {
    if (jj_scan_token(INTEGER_LITERAL)) return true;
    return false;
  }

  static private boolean jj_3_17() {
    if (jj_scan_token(MINUS)) return true;
    return false;
  }

  static private boolean jj_3_29() {
    if (jj_3R_10()) return true;
    if (jj_scan_token(GREATERTHAN)) return true;
    return false;
  }

  static private boolean jj_3_28() {
    if (jj_scan_token(42)) return true;
    if (jj_scan_token(43)) return true;
    return false;
  }

  static private boolean jj_3R_9() {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3_28()) {
    jj_scanpos = xsp;
    if (jj_3_29()) {
    jj_scanpos = xsp;
    if (jj_3_30()) return true;
    }
    }
    return false;
  }

  static private boolean jj_3_8() {
    if (jj_scan_token(MINUS)) return true;
    return false;
  }

  static private boolean jj_3_5() {
    if (jj_scan_token(43)) return true;
    return false;
  }

  static private boolean jj_3_4() {
    if (jj_scan_token(CHARACTER_LITERAL)) return true;
    return false;
  }

  static private boolean jj_3_7() {
    if (jj_3R_8()) return true;
    return false;
  }

  static private boolean jj_3R_10() {
    if (jj_scan_token(IDENTIFIER)) return true;
    return false;
  }

  static private boolean jj_3_6() {
    if (jj_scan_token(42)) return true;
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3_4()) {
    jj_scanpos = xsp;
    if (jj_3_5()) return true;
    }
    return false;
  }

  static private boolean jj_3R_7() {
    if (jj_scan_token(LABEL)) return true;
    if (jj_3R_10()) return true;
    return false;
  }

  static private boolean jj_3R_11() {
    if (jj_scan_token(IF)) return true;
    if (jj_3R_10()) return true;
    return false;
  }

  static private boolean jj_3_16() {
    if (jj_scan_token(INTEGER_LITERAL)) return true;
    return false;
  }

  static private boolean jj_3_15() {
    if (jj_scan_token(FLOATING_POINT_LITERAL)) return true;
    return false;
  }

  static private boolean jj_3_14() {
    if (jj_scan_token(MINUS)) return true;
    return false;
  }

  static private boolean jj_3_33() {
    if (jj_scan_token(STRING_LITERAL)) return true;
    return false;
  }

  static private boolean jj_3_32() {
    if (jj_scan_token(CHARACTER_LITERAL)) return true;
    return false;
  }

  static private boolean jj_3_31() {
    if (jj_scan_token(45)) return true;
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3_32()) {
    jj_scanpos = xsp;
    if (jj_3_33()) return true;
    }
    return false;
  }

  static private boolean jj_3_35() {
    if (jj_scan_token(IN)) return true;
    if (jj_scan_token(LPARENTHESIS)) return true;
    return false;
  }

  static private boolean jj_3_3() {
    if (jj_3R_7()) return true;
    return false;
  }

  static private boolean jj_3_34() {
    if (jj_scan_token(42)) return true;
    if (jj_scan_token(CHARACTER_LITERAL)) return true;
    return false;
  }

  static private boolean jj_3R_8() {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3_34()) {
    jj_scanpos = xsp;
    if (jj_3_35()) return true;
    }
    return false;
  }

  static private boolean jj_3_13() {
    if (jj_scan_token(MINUS)) return true;
    return false;
  }

  static private boolean jj_3_10() {
    if (jj_3R_8()) return true;
    return false;
  }

  static private boolean jj_3_2() {
    if (jj_3R_6()) return true;
    return false;
  }

  static private boolean jj_3_9() {
    if (jj_3R_9()) return true;
    return false;
  }

  static private boolean jj_3_27() {
    if (jj_scan_token(FLOATING_POINT_LITERAL)) return true;
    return false;
  }

  static private boolean jj_3_12() {
    if (jj_scan_token(LPARENTHESIS)) return true;
    if (jj_3R_9()) return true;
    return false;
  }

  static private boolean jj_3_26() {
    if (jj_scan_token(INTEGER_LITERAL)) return true;
    return false;
  }

  static private boolean jj_3_25() {
    if (jj_scan_token(MINUS)) return true;
    return false;
  }

  static private boolean jj_3R_5() {
    if (jj_3R_11()) return true;
    return false;
  }

  static private boolean jj_3_11() {
    if (jj_3R_10()) return true;
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3_9()) {
    jj_scanpos = xsp;
    if (jj_3_10()) return true;
    }
    return false;
  }

  static private boolean jj_3_22() {
    if (jj_scan_token(FLOATING_POINT_LITERAL)) return true;
    return false;
  }

  static private boolean jj_3_20() {
    if (jj_scan_token(MINUS)) return true;
    return false;
  }

  static private boolean jj_3_21() {
    if (jj_scan_token(INTEGER_LITERAL)) return true;
    return false;
  }

  static private boolean jj_3_24() {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3_20()) jj_scanpos = xsp;
    xsp = jj_scanpos;
    if (jj_3_21()) {
    jj_scanpos = xsp;
    if (jj_3_22()) return true;
    }
    return false;
  }

  static private boolean jj_initialized_once = false;
  /** Generated Token Manager. */
  static public SasParserTokenManager token_source;
  static SimpleCharStream jj_input_stream;
  /** Current token. */
  static public Token token;
  /** Next token. */
  static public Token jj_nt;
  static private int jj_ntk;
  static private Token jj_scanpos, jj_lastpos;
  static private int jj_la;
  static private int jj_gen;
  static final private int[] jj_la1 = new int[0];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {};
   }
  static final private JJCalls[] jj_2_rtns = new JJCalls[35];
  static private boolean jj_rescan = false;
  static private int jj_gc = 0;

  /** Constructor with InputStream. */
  public SasParser(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public SasParser(java.io.InputStream stream, String encoding) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser.  ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new SasParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 0; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 0; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Constructor. */
  public SasParser(java.io.Reader stream) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new SasParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 0; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  static public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 0; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Constructor with generated Token Manager. */
  public SasParser(SasParserTokenManager tm) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 0; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(SasParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 0; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  static private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      if (++jj_gc > 100) {
        jj_gc = 0;
        for (int i = 0; i < jj_2_rtns.length; i++) {
          JJCalls c = jj_2_rtns[i];
          while (c != null) {
            if (c.gen < jj_gen) c.first = null;
            c = c.next;
          }
        }
      }
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }

  static private final class LookaheadSuccess extends java.lang.Error { }
  static final private LookaheadSuccess jj_ls = new LookaheadSuccess();
  static private boolean jj_scan_token(int kind) {
    if (jj_scanpos == jj_lastpos) {
      jj_la--;
      if (jj_scanpos.next == null) {
        jj_lastpos = jj_scanpos = jj_scanpos.next = token_source.getNextToken();
      } else {
        jj_lastpos = jj_scanpos = jj_scanpos.next;
      }
    } else {
      jj_scanpos = jj_scanpos.next;
    }
    if (jj_rescan) {
      int i = 0; Token tok = token;
      while (tok != null && tok != jj_scanpos) { i++; tok = tok.next; }
      if (tok != null) jj_add_error_token(kind, i);
    }
    if (jj_scanpos.kind != kind) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) throw jj_ls;
    return false;
  }


/** Get the next Token. */
  static final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  static final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  static private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  static private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  static private int[] jj_expentry;
  static private int jj_kind = -1;
  static private int[] jj_lasttokens = new int[100];
  static private int jj_endpos;

  static private void jj_add_error_token(int kind, int pos) {
    if (pos >= 100) return;
    if (pos == jj_endpos + 1) {
      jj_lasttokens[jj_endpos++] = kind;
    } else if (jj_endpos != 0) {
      jj_expentry = new int[jj_endpos];
      for (int i = 0; i < jj_endpos; i++) {
        jj_expentry[i] = jj_lasttokens[i];
      }
      jj_entries_loop: for (java.util.Iterator<?> it = jj_expentries.iterator(); it.hasNext();) {
        int[] oldentry = (int[])(it.next());
        if (oldentry.length == jj_expentry.length) {
          for (int i = 0; i < jj_expentry.length; i++) {
            if (oldentry[i] != jj_expentry[i]) {
              continue jj_entries_loop;
            }
          }
          jj_expentries.add(jj_expentry);
          break jj_entries_loop;
        }
      }
      if (pos != 0) jj_lasttokens[(jj_endpos = pos) - 1] = kind;
    }
  }

  /** Generate ParseException. */
  static public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[46];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 0; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 46; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    jj_endpos = 0;
    jj_rescan_token();
    jj_add_error_token(0, 0);
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  static final public void enable_tracing() {
  }

  /** Disable tracing. */
  static final public void disable_tracing() {
  }

  static private void jj_rescan_token() {
    jj_rescan = true;
    for (int i = 0; i < 35; i++) {
    try {
      JJCalls p = jj_2_rtns[i];
      do {
        if (p.gen > jj_gen) {
          jj_la = p.arg; jj_lastpos = jj_scanpos = p.first;
          switch (i) {
            case 0: jj_3_1(); break;
            case 1: jj_3_2(); break;
            case 2: jj_3_3(); break;
            case 3: jj_3_4(); break;
            case 4: jj_3_5(); break;
            case 5: jj_3_6(); break;
            case 6: jj_3_7(); break;
            case 7: jj_3_8(); break;
            case 8: jj_3_9(); break;
            case 9: jj_3_10(); break;
            case 10: jj_3_11(); break;
            case 11: jj_3_12(); break;
            case 12: jj_3_13(); break;
            case 13: jj_3_14(); break;
            case 14: jj_3_15(); break;
            case 15: jj_3_16(); break;
            case 16: jj_3_17(); break;
            case 17: jj_3_18(); break;
            case 18: jj_3_19(); break;
            case 19: jj_3_20(); break;
            case 20: jj_3_21(); break;
            case 21: jj_3_22(); break;
            case 22: jj_3_23(); break;
            case 23: jj_3_24(); break;
            case 24: jj_3_25(); break;
            case 25: jj_3_26(); break;
            case 26: jj_3_27(); break;
            case 27: jj_3_28(); break;
            case 28: jj_3_29(); break;
            case 29: jj_3_30(); break;
            case 30: jj_3_31(); break;
            case 31: jj_3_32(); break;
            case 32: jj_3_33(); break;
            case 33: jj_3_34(); break;
            case 34: jj_3_35(); break;
          }
        }
        p = p.next;
      } while (p != null);
      } catch(LookaheadSuccess ls) { }
    }
    jj_rescan = false;
  }

  static private void jj_save(int index, int xla) {
    JJCalls p = jj_2_rtns[index];
    while (p.gen > jj_gen) {
      if (p.next == null) { p = p.next = new JJCalls(); break; }
      p = p.next;
    }
    p.gen = jj_gen + xla - jj_la; p.first = token; p.arg = xla;
  }

  static final class JJCalls {
    int gen;
    Token first;
    int arg;
    JJCalls next;
  }

}
