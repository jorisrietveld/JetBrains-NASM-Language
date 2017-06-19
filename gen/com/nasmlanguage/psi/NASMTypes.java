// This is a generated file. Not intended for manual editing.
package com.nasmlanguage.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.nasmlanguage.psi.impl.*;

public interface NASMTypes {

  IElementType ADDRESS = new NASMElementType("ADDRESS");
  IElementType ASSIGN = new NASMElementType("ASSIGN");
  IElementType CODE_SECTION = new NASMElementType("CODE_SECTION");
  IElementType CONDITIONAL = new NASMElementType("CONDITIONAL");
  IElementType DATA = new NASMElementType("DATA");
  IElementType DATA_SECTION = new NASMElementType("DATA_SECTION");
  IElementType DATA_VALUE = new NASMElementType("DATA_VALUE");
  IElementType DEFINE = new NASMElementType("DEFINE");
  IElementType DIRECTIVE = new NASMElementType("DIRECTIVE");
  IElementType DIRECTIVE_ARG = new NASMElementType("DIRECTIVE_ARG");
  IElementType DIV_EXPR = new NASMElementType("DIV_EXPR");
  IElementType ERROR = new NASMElementType("ERROR");
  IElementType EXPR = new NASMElementType("EXPR");
  IElementType IDENTIFIER = new NASMElementType("IDENTIFIER");
  IElementType INCLUDE = new NASMElementType("INCLUDE");
  IElementType INSTRUCTION = new NASMElementType("INSTRUCTION");
  IElementType I_STRUC = new NASMElementType("I_STRUC");
  IElementType LABEL = new NASMElementType("LABEL");
  IElementType MACRO = new NASMElementType("MACRO");
  IElementType MACRO_CALL = new NASMElementType("MACRO_CALL");
  IElementType MAP_OPTION = new NASMElementType("MAP_OPTION");
  IElementType MINUS_EXPR = new NASMElementType("MINUS_EXPR");
  IElementType MUL_EXPR = new NASMElementType("MUL_EXPR");
  IElementType NUMERIC_EXPR = new NASMElementType("NUMERIC_EXPR");
  IElementType NUMERIC_LITERAL = new NASMElementType("NUMERIC_LITERAL");
  IElementType PARENTHESIS_EXPR = new NASMElementType("PARENTHESIS_EXPR");
  IElementType PARENTHESIS_NUMERIC_EXPR = new NASMElementType("PARENTHESIS_NUMERIC_EXPR");
  IElementType PLUS_EXPR = new NASMElementType("PLUS_EXPR");
  IElementType PREPROCESSOR = new NASMElementType("PREPROCESSOR");
  IElementType REG = new NASMElementType("REG");
  IElementType SEG = new NASMElementType("SEG");
  IElementType STR = new NASMElementType("STR");
  IElementType STRLEN = new NASMElementType("STRLEN");
  IElementType STRUC = new NASMElementType("STRUC");

  IElementType ASSIGN_TAG = new NASMTokenType("ASSIGN_TAG");
  IElementType AT_TAG = new NASMTokenType("AT_TAG");
  IElementType BINARY = new NASMTokenType("BINARY");
  IElementType BSS_SECTION_NAME = new NASMTokenType("BSS_SECTION_NAME");
  IElementType CHARACTER = new NASMTokenType("CHARACTER");
  IElementType CODE_SECTION_NAME = new NASMTokenType("CODE_SECTION_NAME");
  IElementType COLON = new NASMTokenType(":");
  IElementType COMMENT = new NASMTokenType("COMMENT");
  IElementType CRLF = new NASMTokenType("CRLF");
  IElementType DATA_OP = new NASMTokenType("DATA_OP");
  IElementType DATA_SECTION_NAME = new NASMTokenType("DATA_SECTION_NAME");
  IElementType DECIMAL = new NASMTokenType("DECIMAL");
  IElementType DEFINE_TAG = new NASMTokenType("DEFINE_TAG");
  IElementType DIRECTIVE_OP = new NASMTokenType("DIRECTIVE_OP");
  IElementType DIVIDE = new NASMTokenType("/");
  IElementType DOLLARSIGN = new NASMTokenType("$");
  IElementType DOLLARSIGN2 = new NASMTokenType("$$");
  IElementType DOT = new NASMTokenType(".");
  IElementType ELIF_TAG = new NASMTokenType("ELIF_TAG");
  IElementType ELSE_TAG = new NASMTokenType("ELSE_TAG");
  IElementType ENDIF_TAG = new NASMTokenType("ENDIF_TAG");
  IElementType ENDSTRUC_TAG = new NASMTokenType("ENDSTRUC_TAG");
  IElementType EQU = new NASMTokenType("EQU");
  IElementType EQUAL = new NASMTokenType("=");
  IElementType EQUALEQUAL = new NASMTokenType("==");
  IElementType ERROR_TAG = new NASMTokenType("ERROR_TAG");
  IElementType FPU_OP = new NASMTokenType("FPU_OP");
  IElementType GENERAL_OP = new NASMTokenType("GENERAL_OP");
  IElementType HEXADECIMAL = new NASMTokenType("HEXADECIMAL");
  IElementType ID = new NASMTokenType("ID");
  IElementType IEND_TAG = new NASMTokenType("IEND_TAG");
  IElementType IFCTX_TAG = new NASMTokenType("IFCTX_TAG");
  IElementType IFMACRO_TAG = new NASMTokenType("IFMACRO_TAG");
  IElementType IF_TAG = new NASMTokenType("IF_TAG");
  IElementType INCLUDE_TAG = new NASMTokenType("INCLUDE_TAG");
  IElementType INS_64_BIT = new NASMTokenType("INS_64_BIT");
  IElementType INS_BINARY_ARITH = new NASMTokenType("INS_BINARY_ARITH");
  IElementType INS_BINARY_LOGICAL = new NASMTokenType("INS_BINARY_LOGICAL");
  IElementType INS_BINARY_OTHER = new NASMTokenType("INS_BINARY_OTHER");
  IElementType INS_BINARY_ROTATE = new NASMTokenType("INS_BINARY_ROTATE");
  IElementType INS_BINARY_SET = new NASMTokenType("INS_BINARY_SET");
  IElementType INS_BIT_MANIPULATION = new NASMTokenType("INS_BIT_MANIPULATION");
  IElementType INS_CONTROL_TRANS = new NASMTokenType("INS_CONTROL_TRANS");
  IElementType INS_DATA_TRANS_MOV = new NASMTokenType("INS_DATA_TRANS_MOV");
  IElementType INS_DATA_TRANS_OTHER = new NASMTokenType("INS_DATA_TRANS_OTHER");
  IElementType INS_DATA_TRANS_XCHG = new NASMTokenType("INS_DATA_TRANS_XCHG");
  IElementType INS_DECIMAL_ARITH = new NASMTokenType("INS_DECIMAL_ARITH");
  IElementType INS_FLAG_CONTROL = new NASMTokenType("INS_FLAG_CONTROL");
  IElementType INS_FPU_BASIC_ARITH = new NASMTokenType("INS_FPU_BASIC_ARITH");
  IElementType INS_FPU_COMPARISON = new NASMTokenType("INS_FPU_COMPARISON");
  IElementType INS_FPU_CONTROL = new NASMTokenType("INS_FPU_CONTROL");
  IElementType INS_FPU_DATA_TRANS = new NASMTokenType("INS_FPU_DATA_TRANS");
  IElementType INS_FPU_LOAD = new NASMTokenType("INS_FPU_LOAD");
  IElementType INS_FPU_STATE = new NASMTokenType("INS_FPU_STATE");
  IElementType INS_FPU_TRANSCEND = new NASMTokenType("INS_FPU_TRANSCEND");
  IElementType INS_INPUT_OUTPUT = new NASMTokenType("INS_INPUT_OUTPUT");
  IElementType INS_MISC_OTHER = new NASMTokenType("INS_MISC_OTHER");
  IElementType INS_MMX_ARITH = new NASMTokenType("INS_MMX_ARITH");
  IElementType INS_MMX_COMPARISON = new NASMTokenType("INS_MMX_COMPARISON");
  IElementType INS_MMX_CONVERSION = new NASMTokenType("INS_MMX_CONVERSION");
  IElementType INS_MMX_DATA_TRANS = new NASMTokenType("INS_MMX_DATA_TRANS");
  IElementType INS_MMX_LOGICAL = new NASMTokenType("INS_MMX_LOGICAL");
  IElementType INS_MMX_ROTATE = new NASMTokenType("INS_MMX_ROTATE");
  IElementType INS_MMX_STATE = new NASMTokenType("INS_MMX_STATE");
  IElementType INS_RNG_RAND = new NASMTokenType("INS_RNG_RAND");
  IElementType INS_SEG_REGS = new NASMTokenType("INS_SEG_REGS");
  IElementType INS_SSE2_ARITH = new NASMTokenType("INS_SSE2_ARITH");
  IElementType INS_SSE2_CACHE_CTRL = new NASMTokenType("INS_SSE2_CACHE_CTRL");
  IElementType INS_SSE2_COMPARISON = new NASMTokenType("INS_SSE2_COMPARISON");
  IElementType INS_SSE2_CONVERSION = new NASMTokenType("INS_SSE2_CONVERSION");
  IElementType INS_SSE2_DATA_TRANS = new NASMTokenType("INS_SSE2_DATA_TRANS");
  IElementType INS_SSE2_LOGICAL = new NASMTokenType("INS_SSE2_LOGICAL");
  IElementType INS_SSE2_OTHER = new NASMTokenType("INS_SSE2_OTHER");
  IElementType INS_SSE2_SIMD_INT = new NASMTokenType("INS_SSE2_SIMD_INT");
  IElementType INS_SSE3_ARITH = new NASMTokenType("INS_SSE3_ARITH");
  IElementType INS_SSE3_GENERAL = new NASMTokenType("INS_SSE3_GENERAL");
  IElementType INS_SSE3_OTHER = new NASMTokenType("INS_SSE3_OTHER");
  IElementType INS_SSE4_ARITH = new NASMTokenType("INS_SSE4_ARITH");
  IElementType INS_SSE4_BLEND = new NASMTokenType("INS_SSE4_BLEND");
  IElementType INS_SSE4_CONVERSION = new NASMTokenType("INS_SSE4_CONVERSION");
  IElementType INS_SSE4_DATA_TRANS = new NASMTokenType("INS_SSE4_DATA_TRANS");
  IElementType INS_SSE4_INS_EXT = new NASMTokenType("INS_SSE4_INS_EXT");
  IElementType INS_SSE4_OTHER = new NASMTokenType("INS_SSE4_OTHER");
  IElementType INS_SSE4_PACKED_FP = new NASMTokenType("INS_SSE4_PACKED_FP");
  IElementType INS_SSE4_PACKED_INT = new NASMTokenType("INS_SSE4_PACKED_INT");
  IElementType INS_SSE_ARITH = new NASMTokenType("INS_SSE_ARITH");
  IElementType INS_SSE_CACHE_CTRL = new NASMTokenType("INS_SSE_CACHE_CTRL");
  IElementType INS_SSE_COMPARISON = new NASMTokenType("INS_SSE_COMPARISON");
  IElementType INS_SSE_CONVERSION = new NASMTokenType("INS_SSE_CONVERSION");
  IElementType INS_SSE_DATA_TRANS = new NASMTokenType("INS_SSE_DATA_TRANS");
  IElementType INS_SSE_LOGICAL = new NASMTokenType("INS_SSE_LOGICAL");
  IElementType INS_SSE_OTHER = new NASMTokenType("INS_SSE_OTHER");
  IElementType INS_SSE_PREFETCH = new NASMTokenType("INS_SSE_PREFETCH");
  IElementType INS_SSE_SIMD_INT = new NASMTokenType("INS_SSE_SIMD_INT");
  IElementType INS_SSE_STATE = new NASMTokenType("INS_SSE_STATE");
  IElementType INS_STRING_DATA = new NASMTokenType("INS_STRING_DATA");
  IElementType ISTRUC_TAG = new NASMTokenType("ISTRUC_TAG");
  IElementType LBL = new NASMTokenType("LBL");
  IElementType LBL_DEF = new NASMTokenType("LBL_DEF");
  IElementType MACRO_END_TAG = new NASMTokenType("MACRO_END_TAG");
  IElementType MACRO_TAG = new NASMTokenType("MACRO_TAG");
  IElementType MAP_FILE = new NASMTokenType("MAP_FILE");
  IElementType MAP_OPTIONS = new NASMTokenType("MAP_OPTIONS");
  IElementType MINUS = new NASMTokenType("-");
  IElementType MMX_OP = new NASMTokenType("MMX_OP");
  IElementType OP_PREFIX = new NASMTokenType("OP_PREFIX");
  IElementType PERCENT = new NASMTokenType("%");
  IElementType PLUS = new NASMTokenType("+");
  IElementType PREPROCESSOR_OP = new NASMTokenType("PREPROCESSOR_OP");
  IElementType QUESTION = new NASMTokenType("?");
  IElementType REGISTER = new NASMTokenType("REGISTER");
  IElementType ROUND_L = new NASMTokenType("(");
  IElementType ROUND_R = new NASMTokenType(")");
  IElementType SECTION_TAG = new NASMTokenType("SECTION_TAG");
  IElementType SEGMENT = new NASMTokenType("SEGMENT");
  IElementType SEMICOLON = new NASMTokenType(";");
  IElementType SEPARATOR = new NASMTokenType(",");
  IElementType SIZE_TYPE = new NASMTokenType("SIZE_TYPE");
  IElementType SQUARE_L = new NASMTokenType("[");
  IElementType SQUARE_R = new NASMTokenType("]");
  IElementType SSE2_OP = new NASMTokenType("SSE2_OP");
  IElementType SSE3_OP = new NASMTokenType("SSE3_OP");
  IElementType SSE4_OP = new NASMTokenType("SSE4_OP");
  IElementType SSE_OP = new NASMTokenType("SSE_OP");
  IElementType STRING = new NASMTokenType("STRING");
  IElementType STRLEN_TAG = new NASMTokenType("STRLEN_TAG");
  IElementType STRUC_TAG = new NASMTokenType("STRUC_TAG");
  IElementType TIMES = new NASMTokenType("*");
  IElementType X64_OP = new NASMTokenType("X64_OP");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == ADDRESS) {
        return new NASMAddressImpl(node);
      }
      else if (type == ASSIGN) {
        return new NASMAssignImpl(node);
      }
      else if (type == CODE_SECTION) {
        return new NASMCodeSectionImpl(node);
      }
      else if (type == CONDITIONAL) {
        return new NASMConditionalImpl(node);
      }
      else if (type == DATA) {
        return new NASMDataImpl(node);
      }
      else if (type == DATA_SECTION) {
        return new NASMDataSectionImpl(node);
      }
      else if (type == DATA_VALUE) {
        return new NASMDataValueImpl(node);
      }
      else if (type == DEFINE) {
        return new NASMDefineImpl(node);
      }
      else if (type == DIRECTIVE) {
        return new NASMDirectiveImpl(node);
      }
      else if (type == DIRECTIVE_ARG) {
        return new NASMDirectiveArgImpl(node);
      }
      else if (type == DIV_EXPR) {
        return new NASMDivExprImpl(node);
      }
      else if (type == ERROR) {
        return new NASMErrorImpl(node);
      }
      else if (type == IDENTIFIER) {
        return new NASMIdentifierImpl(node);
      }
      else if (type == INCLUDE) {
        return new NASMIncludeImpl(node);
      }
      else if (type == INSTRUCTION) {
        return new NASMInstructionImpl(node);
      }
      else if (type == I_STRUC) {
        return new NASMIStrucImpl(node);
      }
      else if (type == LABEL) {
        return new NASMLabelImpl(node);
      }
      else if (type == MACRO) {
        return new NASMMacroImpl(node);
      }
      else if (type == MACRO_CALL) {
        return new NASMMacroCallImpl(node);
      }
      else if (type == MAP_OPTION) {
        return new NASMMapOptionImpl(node);
      }
      else if (type == MINUS_EXPR) {
        return new NASMMinusExprImpl(node);
      }
      else if (type == MUL_EXPR) {
        return new NASMMulExprImpl(node);
      }
      else if (type == NUMERIC_EXPR) {
        return new NASMNumericExprImpl(node);
      }
      else if (type == NUMERIC_LITERAL) {
        return new NASMNumericLiteralImpl(node);
      }
      else if (type == PARENTHESIS_EXPR) {
        return new NASMParenthesisExprImpl(node);
      }
      else if (type == PARENTHESIS_NUMERIC_EXPR) {
        return new NASMParenthesisNumericExprImpl(node);
      }
      else if (type == PLUS_EXPR) {
        return new NASMPlusExprImpl(node);
      }
      else if (type == PREPROCESSOR) {
        return new NASMPreprocessorImpl(node);
      }
      else if (type == REG) {
        return new NASMRegImpl(node);
      }
      else if (type == SEG) {
        return new NASMSegImpl(node);
      }
      else if (type == STR) {
        return new NASMStrImpl(node);
      }
      else if (type == STRLEN) {
        return new NASMStrlenImpl(node);
      }
      else if (type == STRUC) {
        return new NASMStrucImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
