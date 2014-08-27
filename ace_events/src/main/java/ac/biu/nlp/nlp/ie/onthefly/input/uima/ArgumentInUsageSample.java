

/* First created by JCasGen Fri Jun 27 12:02:31 IDT 2014 */
package ac.biu.nlp.nlp.ie.onthefly.input.uima;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Mon Aug 25 18:56:30 IDT 2014
 * XML source: C:/Java/Git/breep/ace_events/src/main/resources/desc/OdieInputTypes.xml
 * @generated */
public class ArgumentInUsageSample extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(ArgumentInUsageSample.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected ArgumentInUsageSample() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public ArgumentInUsageSample(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public ArgumentInUsageSample(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public ArgumentInUsageSample(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: argumentExample

  /** getter for argumentExample - gets 
   * @generated */
  public ArgumentExample getArgumentExample() {
    if (ArgumentInUsageSample_Type.featOkTst && ((ArgumentInUsageSample_Type)jcasType).casFeat_argumentExample == null)
      jcasType.jcas.throwFeatMissing("argumentExample", "ac.biu.nlp.nlp.ie.onthefly.input.uima.ArgumentInUsageSample");
    return (ArgumentExample)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((ArgumentInUsageSample_Type)jcasType).casFeatCode_argumentExample)));}
    
  /** setter for argumentExample - sets  
   * @generated */
  public void setArgumentExample(ArgumentExample v) {
    if (ArgumentInUsageSample_Type.featOkTst && ((ArgumentInUsageSample_Type)jcasType).casFeat_argumentExample == null)
      jcasType.jcas.throwFeatMissing("argumentExample", "ac.biu.nlp.nlp.ie.onthefly.input.uima.ArgumentInUsageSample");
    jcasType.ll_cas.ll_setRefValue(addr, ((ArgumentInUsageSample_Type)jcasType).casFeatCode_argumentExample, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: pius

  /** getter for pius - gets 
   * @generated */
  public PredicateInUsageSample getPius() {
    if (ArgumentInUsageSample_Type.featOkTst && ((ArgumentInUsageSample_Type)jcasType).casFeat_pius == null)
      jcasType.jcas.throwFeatMissing("pius", "ac.biu.nlp.nlp.ie.onthefly.input.uima.ArgumentInUsageSample");
    return (PredicateInUsageSample)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((ArgumentInUsageSample_Type)jcasType).casFeatCode_pius)));}
    
  /** setter for pius - sets  
   * @generated */
  public void setPius(PredicateInUsageSample v) {
    if (ArgumentInUsageSample_Type.featOkTst && ((ArgumentInUsageSample_Type)jcasType).casFeat_pius == null)
      jcasType.jcas.throwFeatMissing("pius", "ac.biu.nlp.nlp.ie.onthefly.input.uima.ArgumentInUsageSample");
    jcasType.ll_cas.ll_setRefValue(addr, ((ArgumentInUsageSample_Type)jcasType).casFeatCode_pius, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: sample

  /** getter for sample - gets 
   * @generated */
  public UsageSample getSample() {
    if (ArgumentInUsageSample_Type.featOkTst && ((ArgumentInUsageSample_Type)jcasType).casFeat_sample == null)
      jcasType.jcas.throwFeatMissing("sample", "ac.biu.nlp.nlp.ie.onthefly.input.uima.ArgumentInUsageSample");
    return (UsageSample)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((ArgumentInUsageSample_Type)jcasType).casFeatCode_sample)));}
    
  /** setter for sample - sets  
   * @generated */
  public void setSample(UsageSample v) {
    if (ArgumentInUsageSample_Type.featOkTst && ((ArgumentInUsageSample_Type)jcasType).casFeat_sample == null)
      jcasType.jcas.throwFeatMissing("sample", "ac.biu.nlp.nlp.ie.onthefly.input.uima.ArgumentInUsageSample");
    jcasType.ll_cas.ll_setRefValue(addr, ((ArgumentInUsageSample_Type)jcasType).casFeatCode_sample, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: treeoutDepNoContext

  /** getter for treeoutDepNoContext - gets 
   * @generated */
  public String getTreeoutDepNoContext() {
    if (ArgumentInUsageSample_Type.featOkTst && ((ArgumentInUsageSample_Type)jcasType).casFeat_treeoutDepNoContext == null)
      jcasType.jcas.throwFeatMissing("treeoutDepNoContext", "ac.biu.nlp.nlp.ie.onthefly.input.uima.ArgumentInUsageSample");
    return jcasType.ll_cas.ll_getStringValue(addr, ((ArgumentInUsageSample_Type)jcasType).casFeatCode_treeoutDepNoContext);}
    
  /** setter for treeoutDepNoContext - sets  
   * @generated */
  public void setTreeoutDepNoContext(String v) {
    if (ArgumentInUsageSample_Type.featOkTst && ((ArgumentInUsageSample_Type)jcasType).casFeat_treeoutDepNoContext == null)
      jcasType.jcas.throwFeatMissing("treeoutDepNoContext", "ac.biu.nlp.nlp.ie.onthefly.input.uima.ArgumentInUsageSample");
    jcasType.ll_cas.ll_setStringValue(addr, ((ArgumentInUsageSample_Type)jcasType).casFeatCode_treeoutDepNoContext, v);}    
   
    
  //*--------------*
  //* Feature: treeoutDepGenPosNoContext

  /** getter for treeoutDepGenPosNoContext - gets 
   * @generated */
  public String getTreeoutDepGenPosNoContext() {
    if (ArgumentInUsageSample_Type.featOkTst && ((ArgumentInUsageSample_Type)jcasType).casFeat_treeoutDepGenPosNoContext == null)
      jcasType.jcas.throwFeatMissing("treeoutDepGenPosNoContext", "ac.biu.nlp.nlp.ie.onthefly.input.uima.ArgumentInUsageSample");
    return jcasType.ll_cas.ll_getStringValue(addr, ((ArgumentInUsageSample_Type)jcasType).casFeatCode_treeoutDepGenPosNoContext);}
    
  /** setter for treeoutDepGenPosNoContext - sets  
   * @generated */
  public void setTreeoutDepGenPosNoContext(String v) {
    if (ArgumentInUsageSample_Type.featOkTst && ((ArgumentInUsageSample_Type)jcasType).casFeat_treeoutDepGenPosNoContext == null)
      jcasType.jcas.throwFeatMissing("treeoutDepGenPosNoContext", "ac.biu.nlp.nlp.ie.onthefly.input.uima.ArgumentInUsageSample");
    jcasType.ll_cas.ll_setStringValue(addr, ((ArgumentInUsageSample_Type)jcasType).casFeatCode_treeoutDepGenPosNoContext, v);}    
   
    
  //*--------------*
  //* Feature: treeoutDepSpecPosNoContext

  /** getter for treeoutDepSpecPosNoContext - gets 
   * @generated */
  public String getTreeoutDepSpecPosNoContext() {
    if (ArgumentInUsageSample_Type.featOkTst && ((ArgumentInUsageSample_Type)jcasType).casFeat_treeoutDepSpecPosNoContext == null)
      jcasType.jcas.throwFeatMissing("treeoutDepSpecPosNoContext", "ac.biu.nlp.nlp.ie.onthefly.input.uima.ArgumentInUsageSample");
    return jcasType.ll_cas.ll_getStringValue(addr, ((ArgumentInUsageSample_Type)jcasType).casFeatCode_treeoutDepSpecPosNoContext);}
    
  /** setter for treeoutDepSpecPosNoContext - sets  
   * @generated */
  public void setTreeoutDepSpecPosNoContext(String v) {
    if (ArgumentInUsageSample_Type.featOkTst && ((ArgumentInUsageSample_Type)jcasType).casFeat_treeoutDepSpecPosNoContext == null)
      jcasType.jcas.throwFeatMissing("treeoutDepSpecPosNoContext", "ac.biu.nlp.nlp.ie.onthefly.input.uima.ArgumentInUsageSample");
    jcasType.ll_cas.ll_setStringValue(addr, ((ArgumentInUsageSample_Type)jcasType).casFeatCode_treeoutDepSpecPosNoContext, v);}    
   
    
  //*--------------*
  //* Feature: treeoutDepWithContext

  /** getter for treeoutDepWithContext - gets 
   * @generated */
  public String getTreeoutDepWithContext() {
    if (ArgumentInUsageSample_Type.featOkTst && ((ArgumentInUsageSample_Type)jcasType).casFeat_treeoutDepWithContext == null)
      jcasType.jcas.throwFeatMissing("treeoutDepWithContext", "ac.biu.nlp.nlp.ie.onthefly.input.uima.ArgumentInUsageSample");
    return jcasType.ll_cas.ll_getStringValue(addr, ((ArgumentInUsageSample_Type)jcasType).casFeatCode_treeoutDepWithContext);}
    
  /** setter for treeoutDepWithContext - sets  
   * @generated */
  public void setTreeoutDepWithContext(String v) {
    if (ArgumentInUsageSample_Type.featOkTst && ((ArgumentInUsageSample_Type)jcasType).casFeat_treeoutDepWithContext == null)
      jcasType.jcas.throwFeatMissing("treeoutDepWithContext", "ac.biu.nlp.nlp.ie.onthefly.input.uima.ArgumentInUsageSample");
    jcasType.ll_cas.ll_setStringValue(addr, ((ArgumentInUsageSample_Type)jcasType).casFeatCode_treeoutDepWithContext, v);}    
   
    
  //*--------------*
  //* Feature: treeoutDepGenPosWithContext

  /** getter for treeoutDepGenPosWithContext - gets 
   * @generated */
  public String getTreeoutDepGenPosWithContext() {
    if (ArgumentInUsageSample_Type.featOkTst && ((ArgumentInUsageSample_Type)jcasType).casFeat_treeoutDepGenPosWithContext == null)
      jcasType.jcas.throwFeatMissing("treeoutDepGenPosWithContext", "ac.biu.nlp.nlp.ie.onthefly.input.uima.ArgumentInUsageSample");
    return jcasType.ll_cas.ll_getStringValue(addr, ((ArgumentInUsageSample_Type)jcasType).casFeatCode_treeoutDepGenPosWithContext);}
    
  /** setter for treeoutDepGenPosWithContext - sets  
   * @generated */
  public void setTreeoutDepGenPosWithContext(String v) {
    if (ArgumentInUsageSample_Type.featOkTst && ((ArgumentInUsageSample_Type)jcasType).casFeat_treeoutDepGenPosWithContext == null)
      jcasType.jcas.throwFeatMissing("treeoutDepGenPosWithContext", "ac.biu.nlp.nlp.ie.onthefly.input.uima.ArgumentInUsageSample");
    jcasType.ll_cas.ll_setStringValue(addr, ((ArgumentInUsageSample_Type)jcasType).casFeatCode_treeoutDepGenPosWithContext, v);}    
   
    
  //*--------------*
  //* Feature: treeoutDepSpecPosWithContext

  /** getter for treeoutDepSpecPosWithContext - gets 
   * @generated */
  public String getTreeoutDepSpecPosWithContext() {
    if (ArgumentInUsageSample_Type.featOkTst && ((ArgumentInUsageSample_Type)jcasType).casFeat_treeoutDepSpecPosWithContext == null)
      jcasType.jcas.throwFeatMissing("treeoutDepSpecPosWithContext", "ac.biu.nlp.nlp.ie.onthefly.input.uima.ArgumentInUsageSample");
    return jcasType.ll_cas.ll_getStringValue(addr, ((ArgumentInUsageSample_Type)jcasType).casFeatCode_treeoutDepSpecPosWithContext);}
    
  /** setter for treeoutDepSpecPosWithContext - sets  
   * @generated */
  public void setTreeoutDepSpecPosWithContext(String v) {
    if (ArgumentInUsageSample_Type.featOkTst && ((ArgumentInUsageSample_Type)jcasType).casFeat_treeoutDepSpecPosWithContext == null)
      jcasType.jcas.throwFeatMissing("treeoutDepSpecPosWithContext", "ac.biu.nlp.nlp.ie.onthefly.input.uima.ArgumentInUsageSample");
    jcasType.ll_cas.ll_setStringValue(addr, ((ArgumentInUsageSample_Type)jcasType).casFeatCode_treeoutDepSpecPosWithContext, v);}    
  }

    