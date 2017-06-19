// This is a generated file. Not intended for manual editing.
package com.nasmlanguage.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;

public class NASMVisitor extends PsiElementVisitor {

  public void visitAddress(@NotNull NASMAddress o) {
    visitExpr(o);
  }

  public void visitAssign(@NotNull NASMAssign o) {
    visitPsiElement(o);
  }

  public void visitCodeSection(@NotNull NASMCodeSection o) {
    visitPsiElement(o);
  }

  public void visitConditional(@NotNull NASMConditional o) {
    visitPsiElement(o);
  }

  public void visitData(@NotNull NASMData o) {
    visitPsiElement(o);
  }

  public void visitDataSection(@NotNull NASMDataSection o) {
    visitPsiElement(o);
  }

  public void visitDataValue(@NotNull NASMDataValue o) {
    visitPsiElement(o);
  }

  public void visitDefine(@NotNull NASMDefine o) {
    visitPsiElement(o);
  }

  public void visitDirective(@NotNull NASMDirective o) {
    visitPsiElement(o);
  }

  public void visitDirectiveArg(@NotNull NASMDirectiveArg o) {
    visitPsiElement(o);
  }

  public void visitDivExpr(@NotNull NASMDivExpr o) {
    visitExpr(o);
  }

  public void visitError(@NotNull NASMError o) {
    visitPsiElement(o);
  }

  public void visitExpr(@NotNull NASMExpr o) {
    visitPsiElement(o);
  }

  public void visitIStruc(@NotNull NASMIStruc o) {
    visitPsiElement(o);
  }

  public void visitIdentifier(@NotNull NASMIdentifier o) {
    visitExpr(o);
  }

  public void visitInclude(@NotNull NASMInclude o) {
    visitPsiElement(o);
  }

  public void visitInstruction(@NotNull NASMInstruction o) {
    visitPsiElement(o);
  }

  public void visitLabel(@NotNull NASMLabel o) {
    visitPsiElement(o);
  }

  public void visitMacro(@NotNull NASMMacro o) {
    visitPsiElement(o);
  }

  public void visitMacroCall(@NotNull NASMMacroCall o) {
    visitExpr(o);
  }

  public void visitMapOption(@NotNull NASMMapOption o) {
    visitPsiElement(o);
  }

  public void visitMinusExpr(@NotNull NASMMinusExpr o) {
    visitExpr(o);
  }

  public void visitMulExpr(@NotNull NASMMulExpr o) {
    visitExpr(o);
  }

  public void visitNumericExpr(@NotNull NASMNumericExpr o) {
    visitPsiElement(o);
  }

  public void visitNumericLiteral(@NotNull NASMNumericLiteral o) {
    visitExpr(o);
  }

  public void visitParenthesisExpr(@NotNull NASMParenthesisExpr o) {
    visitExpr(o);
  }

  public void visitParenthesisNumericExpr(@NotNull NASMParenthesisNumericExpr o) {
    visitNumericExpr(o);
  }

  public void visitPlusExpr(@NotNull NASMPlusExpr o) {
    visitExpr(o);
  }

  public void visitPreprocessor(@NotNull NASMPreprocessor o) {
    visitPsiElement(o);
  }

  public void visitReg(@NotNull NASMReg o) {
    visitExpr(o);
  }

  public void visitSeg(@NotNull NASMSeg o) {
    visitExpr(o);
  }

  public void visitStr(@NotNull NASMStr o) {
    visitExpr(o);
  }

  public void visitStrlen(@NotNull NASMStrlen o) {
    visitPsiElement(o);
  }

  public void visitStruc(@NotNull NASMStruc o) {
    visitPsiElement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
