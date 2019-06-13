package com.spirit.ihe.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.spirit.ihe.services.IHEGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalIHEParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'ArchitecturalElement'", "'{'", "'JavaPackage'", "':'", "'Name'", "'Version'", "'Status'", "'Objective'", "'HL_Function'", "'Rules:'", "'}'", "'Profile'", "'Description'", "'Features'", "'Function'", "'actors:'", "'transactions:'", "'domains:'", "'quality_attributes:'", "'security_requirements:'", "'Form'", "'Sensitivity'", "'Location'", "'State'", "'Goal'", "'Countermeasure'", "'Category'", "'('", "','", "')'", "'['", "']'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalIHEParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalIHEParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalIHEParser.tokenNames; }
    public String getGrammarFileName() { return "InternalIHE.g"; }



     	private IHEGrammarAccess grammarAccess;

        public InternalIHEParser(TokenStream input, IHEGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "IHE";
       	}

       	@Override
       	protected IHEGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleIHE"
    // InternalIHE.g:64:1: entryRuleIHE returns [EObject current=null] : iv_ruleIHE= ruleIHE EOF ;
    public final EObject entryRuleIHE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIHE = null;


        try {
            // InternalIHE.g:64:44: (iv_ruleIHE= ruleIHE EOF )
            // InternalIHE.g:65:2: iv_ruleIHE= ruleIHE EOF
            {
             newCompositeNode(grammarAccess.getIHERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIHE=ruleIHE();

            state._fsp--;

             current =iv_ruleIHE; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIHE"


    // $ANTLR start "ruleIHE"
    // InternalIHE.g:71:1: ruleIHE returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => ( (lv_importEl_1_0= ruleImport ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_main_2_0= ruleMainTgf ) ) ) ) ) )* ) ) ) ;
    public final EObject ruleIHE() throws RecognitionException {
        EObject current = null;

        EObject lv_importEl_1_0 = null;

        EObject lv_main_2_0 = null;



        	enterRule();

        try {
            // InternalIHE.g:77:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_importEl_1_0= ruleImport ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_main_2_0= ruleMainTgf ) ) ) ) ) )* ) ) ) )
            // InternalIHE.g:78:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_importEl_1_0= ruleImport ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_main_2_0= ruleMainTgf ) ) ) ) ) )* ) ) )
            {
            // InternalIHE.g:78:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_importEl_1_0= ruleImport ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_main_2_0= ruleMainTgf ) ) ) ) ) )* ) ) )
            // InternalIHE.g:79:3: ( ( ( ({...}? => ( ({...}? => ( (lv_importEl_1_0= ruleImport ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_main_2_0= ruleMainTgf ) ) ) ) ) )* ) )
            {
            // InternalIHE.g:79:3: ( ( ( ({...}? => ( ({...}? => ( (lv_importEl_1_0= ruleImport ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_main_2_0= ruleMainTgf ) ) ) ) ) )* ) )
            // InternalIHE.g:80:4: ( ( ({...}? => ( ({...}? => ( (lv_importEl_1_0= ruleImport ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_main_2_0= ruleMainTgf ) ) ) ) ) )* )
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getIHEAccess().getUnorderedGroup());
            			
            // InternalIHE.g:83:4: ( ( ({...}? => ( ({...}? => ( (lv_importEl_1_0= ruleImport ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_main_2_0= ruleMainTgf ) ) ) ) ) )* )
            // InternalIHE.g:84:5: ( ({...}? => ( ({...}? => ( (lv_importEl_1_0= ruleImport ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_main_2_0= ruleMainTgf ) ) ) ) ) )*
            {
            // InternalIHE.g:84:5: ( ({...}? => ( ({...}? => ( (lv_importEl_1_0= ruleImport ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_main_2_0= ruleMainTgf ) ) ) ) ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( LA2_0 == 11 && getUnorderedGroupHelper().canSelect(grammarAccess.getIHEAccess().getUnorderedGroup(), 0) ) {
                    alt2=1;
                }
                else if ( LA2_0 == 12 && getUnorderedGroupHelper().canSelect(grammarAccess.getIHEAccess().getUnorderedGroup(), 1) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalIHE.g:85:3: ({...}? => ( ({...}? => ( (lv_importEl_1_0= ruleImport ) ) )+ ) )
            	    {
            	    // InternalIHE.g:85:3: ({...}? => ( ({...}? => ( (lv_importEl_1_0= ruleImport ) ) )+ ) )
            	    // InternalIHE.g:86:4: {...}? => ( ({...}? => ( (lv_importEl_1_0= ruleImport ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIHEAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleIHE", "getUnorderedGroupHelper().canSelect(grammarAccess.getIHEAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalIHE.g:86:97: ( ({...}? => ( (lv_importEl_1_0= ruleImport ) ) )+ )
            	    // InternalIHE.g:87:5: ({...}? => ( (lv_importEl_1_0= ruleImport ) ) )+
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getIHEAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalIHE.g:90:8: ({...}? => ( (lv_importEl_1_0= ruleImport ) ) )+
            	    int cnt1=0;
            	    loop1:
            	    do {
            	        int alt1=2;
            	        int LA1_0 = input.LA(1);

            	        if ( (LA1_0==11) ) {
            	            int LA1_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt1=1;
            	            }


            	        }


            	        switch (alt1) {
            	    	case 1 :
            	    	    // InternalIHE.g:90:9: {...}? => ( (lv_importEl_1_0= ruleImport ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleIHE", "true");
            	    	    }
            	    	    // InternalIHE.g:90:18: ( (lv_importEl_1_0= ruleImport ) )
            	    	    // InternalIHE.g:90:19: (lv_importEl_1_0= ruleImport )
            	    	    {
            	    	    // InternalIHE.g:90:19: (lv_importEl_1_0= ruleImport )
            	    	    // InternalIHE.g:91:9: lv_importEl_1_0= ruleImport
            	    	    {

            	    	    									newCompositeNode(grammarAccess.getIHEAccess().getImportElImportParserRuleCall_0_0());
            	    	    								
            	    	    pushFollow(FOLLOW_3);
            	    	    lv_importEl_1_0=ruleImport();

            	    	    state._fsp--;


            	    	    									if (current==null) {
            	    	    										current = createModelElementForParent(grammarAccess.getIHERule());
            	    	    									}
            	    	    									add(
            	    	    										current,
            	    	    										"importEl",
            	    	    										lv_importEl_1_0,
            	    	    										"com.spirit.ihe.IHE.Import");
            	    	    									afterParserOrEnumRuleCall();
            	    	    								

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt1 >= 1 ) break loop1;
            	                EarlyExitException eee =
            	                    new EarlyExitException(1, input);
            	                throw eee;
            	        }
            	        cnt1++;
            	    } while (true);

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIHEAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalIHE.g:113:3: ({...}? => ( ({...}? => ( (lv_main_2_0= ruleMainTgf ) ) ) ) )
            	    {
            	    // InternalIHE.g:113:3: ({...}? => ( ({...}? => ( (lv_main_2_0= ruleMainTgf ) ) ) ) )
            	    // InternalIHE.g:114:4: {...}? => ( ({...}? => ( (lv_main_2_0= ruleMainTgf ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIHEAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleIHE", "getUnorderedGroupHelper().canSelect(grammarAccess.getIHEAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalIHE.g:114:97: ( ({...}? => ( (lv_main_2_0= ruleMainTgf ) ) ) )
            	    // InternalIHE.g:115:5: ({...}? => ( (lv_main_2_0= ruleMainTgf ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getIHEAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalIHE.g:118:8: ({...}? => ( (lv_main_2_0= ruleMainTgf ) ) )
            	    // InternalIHE.g:118:9: {...}? => ( (lv_main_2_0= ruleMainTgf ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIHE", "true");
            	    }
            	    // InternalIHE.g:118:18: ( (lv_main_2_0= ruleMainTgf ) )
            	    // InternalIHE.g:118:19: (lv_main_2_0= ruleMainTgf )
            	    {
            	    // InternalIHE.g:118:19: (lv_main_2_0= ruleMainTgf )
            	    // InternalIHE.g:119:9: lv_main_2_0= ruleMainTgf
            	    {

            	    									newCompositeNode(grammarAccess.getIHEAccess().getMainMainTgfParserRuleCall_1_0());
            	    								
            	    pushFollow(FOLLOW_3);
            	    lv_main_2_0=ruleMainTgf();

            	    state._fsp--;


            	    									if (current==null) {
            	    										current = createModelElementForParent(grammarAccess.getIHERule());
            	    									}
            	    									set(
            	    										current,
            	    										"main",
            	    										lv_main_2_0,
            	    										"com.spirit.ihe.IHE.MainTgf");
            	    									afterParserOrEnumRuleCall();
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIHEAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getIHEAccess().getUnorderedGroup());
            			

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIHE"


    // $ANTLR start "entryRuleImport"
    // InternalIHE.g:151:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalIHE.g:151:47: (iv_ruleImport= ruleImport EOF )
            // InternalIHE.g:152:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalIHE.g:158:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;


        	enterRule();

        try {
            // InternalIHE.g:164:2: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // InternalIHE.g:165:2: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // InternalIHE.g:165:2: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            // InternalIHE.g:166:3: otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalIHE.g:170:3: ( (lv_importURI_1_0= RULE_STRING ) )
            // InternalIHE.g:171:4: (lv_importURI_1_0= RULE_STRING )
            {
            // InternalIHE.g:171:4: (lv_importURI_1_0= RULE_STRING )
            // InternalIHE.g:172:5: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_importURI_1_0, grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImportRule());
            					}
            					setWithLastConsumed(
            						current,
            						"importURI",
            						lv_importURI_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleMainTgf"
    // InternalIHE.g:192:1: entryRuleMainTgf returns [EObject current=null] : iv_ruleMainTgf= ruleMainTgf EOF ;
    public final EObject entryRuleMainTgf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMainTgf = null;


        try {
            // InternalIHE.g:192:48: (iv_ruleMainTgf= ruleMainTgf EOF )
            // InternalIHE.g:193:2: iv_ruleMainTgf= ruleMainTgf EOF
            {
             newCompositeNode(grammarAccess.getMainTgfRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMainTgf=ruleMainTgf();

            state._fsp--;

             current =iv_ruleMainTgf; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMainTgf"


    // $ANTLR start "ruleMainTgf"
    // InternalIHE.g:199:1: ruleMainTgf returns [EObject current=null] : (otherlv_0= 'ArchitecturalElement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'JavaPackage' otherlv_4= ':' ( (lv_genPackage_5_0= RULE_STRING ) ) )? (otherlv_6= 'Name' otherlv_7= ':' ( (lv_satName_8_0= RULE_STRING ) ) )? (otherlv_9= 'Version' otherlv_10= ':' ( (lv_versionName_11_0= RULE_STRING ) ) )? (otherlv_12= 'Status' otherlv_13= ':' ( (lv_statusName_14_0= RULE_STRING ) ) )? (otherlv_15= 'Objective' otherlv_16= ':' ( (lv_objectiveName_17_0= RULE_STRING ) ) )? (otherlv_18= 'HL_Function' otherlv_19= ':' ( (lv_hlfunctionName_20_0= RULE_STRING ) ) )? (otherlv_21= 'Rules:' otherlv_22= '{' ( (lv_rules_23_0= ruleRule ) )* otherlv_24= '}' )* ( (lv_prof_25_0= ruleProfile ) )+ otherlv_26= '}' ) ;
    public final EObject ruleMainTgf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_genPackage_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_satName_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_versionName_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_statusName_14_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_objectiveName_17_0=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token lv_hlfunctionName_20_0=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        AntlrDatatypeRuleToken lv_rules_23_0 = null;

        EObject lv_prof_25_0 = null;



        	enterRule();

        try {
            // InternalIHE.g:205:2: ( (otherlv_0= 'ArchitecturalElement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'JavaPackage' otherlv_4= ':' ( (lv_genPackage_5_0= RULE_STRING ) ) )? (otherlv_6= 'Name' otherlv_7= ':' ( (lv_satName_8_0= RULE_STRING ) ) )? (otherlv_9= 'Version' otherlv_10= ':' ( (lv_versionName_11_0= RULE_STRING ) ) )? (otherlv_12= 'Status' otherlv_13= ':' ( (lv_statusName_14_0= RULE_STRING ) ) )? (otherlv_15= 'Objective' otherlv_16= ':' ( (lv_objectiveName_17_0= RULE_STRING ) ) )? (otherlv_18= 'HL_Function' otherlv_19= ':' ( (lv_hlfunctionName_20_0= RULE_STRING ) ) )? (otherlv_21= 'Rules:' otherlv_22= '{' ( (lv_rules_23_0= ruleRule ) )* otherlv_24= '}' )* ( (lv_prof_25_0= ruleProfile ) )+ otherlv_26= '}' ) )
            // InternalIHE.g:206:2: (otherlv_0= 'ArchitecturalElement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'JavaPackage' otherlv_4= ':' ( (lv_genPackage_5_0= RULE_STRING ) ) )? (otherlv_6= 'Name' otherlv_7= ':' ( (lv_satName_8_0= RULE_STRING ) ) )? (otherlv_9= 'Version' otherlv_10= ':' ( (lv_versionName_11_0= RULE_STRING ) ) )? (otherlv_12= 'Status' otherlv_13= ':' ( (lv_statusName_14_0= RULE_STRING ) ) )? (otherlv_15= 'Objective' otherlv_16= ':' ( (lv_objectiveName_17_0= RULE_STRING ) ) )? (otherlv_18= 'HL_Function' otherlv_19= ':' ( (lv_hlfunctionName_20_0= RULE_STRING ) ) )? (otherlv_21= 'Rules:' otherlv_22= '{' ( (lv_rules_23_0= ruleRule ) )* otherlv_24= '}' )* ( (lv_prof_25_0= ruleProfile ) )+ otherlv_26= '}' )
            {
            // InternalIHE.g:206:2: (otherlv_0= 'ArchitecturalElement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'JavaPackage' otherlv_4= ':' ( (lv_genPackage_5_0= RULE_STRING ) ) )? (otherlv_6= 'Name' otherlv_7= ':' ( (lv_satName_8_0= RULE_STRING ) ) )? (otherlv_9= 'Version' otherlv_10= ':' ( (lv_versionName_11_0= RULE_STRING ) ) )? (otherlv_12= 'Status' otherlv_13= ':' ( (lv_statusName_14_0= RULE_STRING ) ) )? (otherlv_15= 'Objective' otherlv_16= ':' ( (lv_objectiveName_17_0= RULE_STRING ) ) )? (otherlv_18= 'HL_Function' otherlv_19= ':' ( (lv_hlfunctionName_20_0= RULE_STRING ) ) )? (otherlv_21= 'Rules:' otherlv_22= '{' ( (lv_rules_23_0= ruleRule ) )* otherlv_24= '}' )* ( (lv_prof_25_0= ruleProfile ) )+ otherlv_26= '}' )
            // InternalIHE.g:207:3: otherlv_0= 'ArchitecturalElement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'JavaPackage' otherlv_4= ':' ( (lv_genPackage_5_0= RULE_STRING ) ) )? (otherlv_6= 'Name' otherlv_7= ':' ( (lv_satName_8_0= RULE_STRING ) ) )? (otherlv_9= 'Version' otherlv_10= ':' ( (lv_versionName_11_0= RULE_STRING ) ) )? (otherlv_12= 'Status' otherlv_13= ':' ( (lv_statusName_14_0= RULE_STRING ) ) )? (otherlv_15= 'Objective' otherlv_16= ':' ( (lv_objectiveName_17_0= RULE_STRING ) ) )? (otherlv_18= 'HL_Function' otherlv_19= ':' ( (lv_hlfunctionName_20_0= RULE_STRING ) ) )? (otherlv_21= 'Rules:' otherlv_22= '{' ( (lv_rules_23_0= ruleRule ) )* otherlv_24= '}' )* ( (lv_prof_25_0= ruleProfile ) )+ otherlv_26= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getMainTgfAccess().getArchitecturalElementKeyword_0());
            		
            // InternalIHE.g:211:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIHE.g:212:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIHE.g:212:4: (lv_name_1_0= RULE_ID )
            // InternalIHE.g:213:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMainTgfAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMainTgfRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getMainTgfAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalIHE.g:233:3: (otherlv_3= 'JavaPackage' otherlv_4= ':' ( (lv_genPackage_5_0= RULE_STRING ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalIHE.g:234:4: otherlv_3= 'JavaPackage' otherlv_4= ':' ( (lv_genPackage_5_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getMainTgfAccess().getJavaPackageKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getMainTgfAccess().getColonKeyword_3_1());
                    			
                    // InternalIHE.g:242:4: ( (lv_genPackage_5_0= RULE_STRING ) )
                    // InternalIHE.g:243:5: (lv_genPackage_5_0= RULE_STRING )
                    {
                    // InternalIHE.g:243:5: (lv_genPackage_5_0= RULE_STRING )
                    // InternalIHE.g:244:6: lv_genPackage_5_0= RULE_STRING
                    {
                    lv_genPackage_5_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

                    						newLeafNode(lv_genPackage_5_0, grammarAccess.getMainTgfAccess().getGenPackageSTRINGTerminalRuleCall_3_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMainTgfRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"genPackage",
                    							lv_genPackage_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalIHE.g:261:3: (otherlv_6= 'Name' otherlv_7= ':' ( (lv_satName_8_0= RULE_STRING ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalIHE.g:262:4: otherlv_6= 'Name' otherlv_7= ':' ( (lv_satName_8_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_6, grammarAccess.getMainTgfAccess().getNameKeyword_4_0());
                    			
                    otherlv_7=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getMainTgfAccess().getColonKeyword_4_1());
                    			
                    // InternalIHE.g:270:4: ( (lv_satName_8_0= RULE_STRING ) )
                    // InternalIHE.g:271:5: (lv_satName_8_0= RULE_STRING )
                    {
                    // InternalIHE.g:271:5: (lv_satName_8_0= RULE_STRING )
                    // InternalIHE.g:272:6: lv_satName_8_0= RULE_STRING
                    {
                    lv_satName_8_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

                    						newLeafNode(lv_satName_8_0, grammarAccess.getMainTgfAccess().getSatNameSTRINGTerminalRuleCall_4_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMainTgfRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"satName",
                    							lv_satName_8_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalIHE.g:289:3: (otherlv_9= 'Version' otherlv_10= ':' ( (lv_versionName_11_0= RULE_STRING ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalIHE.g:290:4: otherlv_9= 'Version' otherlv_10= ':' ( (lv_versionName_11_0= RULE_STRING ) )
                    {
                    otherlv_9=(Token)match(input,17,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getMainTgfAccess().getVersionKeyword_5_0());
                    			
                    otherlv_10=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getMainTgfAccess().getColonKeyword_5_1());
                    			
                    // InternalIHE.g:298:4: ( (lv_versionName_11_0= RULE_STRING ) )
                    // InternalIHE.g:299:5: (lv_versionName_11_0= RULE_STRING )
                    {
                    // InternalIHE.g:299:5: (lv_versionName_11_0= RULE_STRING )
                    // InternalIHE.g:300:6: lv_versionName_11_0= RULE_STRING
                    {
                    lv_versionName_11_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

                    						newLeafNode(lv_versionName_11_0, grammarAccess.getMainTgfAccess().getVersionNameSTRINGTerminalRuleCall_5_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMainTgfRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"versionName",
                    							lv_versionName_11_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalIHE.g:317:3: (otherlv_12= 'Status' otherlv_13= ':' ( (lv_statusName_14_0= RULE_STRING ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalIHE.g:318:4: otherlv_12= 'Status' otherlv_13= ':' ( (lv_statusName_14_0= RULE_STRING ) )
                    {
                    otherlv_12=(Token)match(input,18,FOLLOW_8); 

                    				newLeafNode(otherlv_12, grammarAccess.getMainTgfAccess().getStatusKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_13, grammarAccess.getMainTgfAccess().getColonKeyword_6_1());
                    			
                    // InternalIHE.g:326:4: ( (lv_statusName_14_0= RULE_STRING ) )
                    // InternalIHE.g:327:5: (lv_statusName_14_0= RULE_STRING )
                    {
                    // InternalIHE.g:327:5: (lv_statusName_14_0= RULE_STRING )
                    // InternalIHE.g:328:6: lv_statusName_14_0= RULE_STRING
                    {
                    lv_statusName_14_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

                    						newLeafNode(lv_statusName_14_0, grammarAccess.getMainTgfAccess().getStatusNameSTRINGTerminalRuleCall_6_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMainTgfRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"statusName",
                    							lv_statusName_14_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalIHE.g:345:3: (otherlv_15= 'Objective' otherlv_16= ':' ( (lv_objectiveName_17_0= RULE_STRING ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalIHE.g:346:4: otherlv_15= 'Objective' otherlv_16= ':' ( (lv_objectiveName_17_0= RULE_STRING ) )
                    {
                    otherlv_15=(Token)match(input,19,FOLLOW_8); 

                    				newLeafNode(otherlv_15, grammarAccess.getMainTgfAccess().getObjectiveKeyword_7_0());
                    			
                    otherlv_16=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_16, grammarAccess.getMainTgfAccess().getColonKeyword_7_1());
                    			
                    // InternalIHE.g:354:4: ( (lv_objectiveName_17_0= RULE_STRING ) )
                    // InternalIHE.g:355:5: (lv_objectiveName_17_0= RULE_STRING )
                    {
                    // InternalIHE.g:355:5: (lv_objectiveName_17_0= RULE_STRING )
                    // InternalIHE.g:356:6: lv_objectiveName_17_0= RULE_STRING
                    {
                    lv_objectiveName_17_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

                    						newLeafNode(lv_objectiveName_17_0, grammarAccess.getMainTgfAccess().getObjectiveNameSTRINGTerminalRuleCall_7_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMainTgfRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"objectiveName",
                    							lv_objectiveName_17_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalIHE.g:373:3: (otherlv_18= 'HL_Function' otherlv_19= ':' ( (lv_hlfunctionName_20_0= RULE_STRING ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalIHE.g:374:4: otherlv_18= 'HL_Function' otherlv_19= ':' ( (lv_hlfunctionName_20_0= RULE_STRING ) )
                    {
                    otherlv_18=(Token)match(input,20,FOLLOW_8); 

                    				newLeafNode(otherlv_18, grammarAccess.getMainTgfAccess().getHL_FunctionKeyword_8_0());
                    			
                    otherlv_19=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_19, grammarAccess.getMainTgfAccess().getColonKeyword_8_1());
                    			
                    // InternalIHE.g:382:4: ( (lv_hlfunctionName_20_0= RULE_STRING ) )
                    // InternalIHE.g:383:5: (lv_hlfunctionName_20_0= RULE_STRING )
                    {
                    // InternalIHE.g:383:5: (lv_hlfunctionName_20_0= RULE_STRING )
                    // InternalIHE.g:384:6: lv_hlfunctionName_20_0= RULE_STRING
                    {
                    lv_hlfunctionName_20_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

                    						newLeafNode(lv_hlfunctionName_20_0, grammarAccess.getMainTgfAccess().getHlfunctionNameSTRINGTerminalRuleCall_8_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMainTgfRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"hlfunctionName",
                    							lv_hlfunctionName_20_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalIHE.g:401:3: (otherlv_21= 'Rules:' otherlv_22= '{' ( (lv_rules_23_0= ruleRule ) )* otherlv_24= '}' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==21) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalIHE.g:402:4: otherlv_21= 'Rules:' otherlv_22= '{' ( (lv_rules_23_0= ruleRule ) )* otherlv_24= '}'
            	    {
            	    otherlv_21=(Token)match(input,21,FOLLOW_6); 

            	    				newLeafNode(otherlv_21, grammarAccess.getMainTgfAccess().getRulesKeyword_9_0());
            	    			
            	    otherlv_22=(Token)match(input,13,FOLLOW_9); 

            	    				newLeafNode(otherlv_22, grammarAccess.getMainTgfAccess().getLeftCurlyBracketKeyword_9_1());
            	    			
            	    // InternalIHE.g:410:4: ( (lv_rules_23_0= ruleRule ) )*
            	    loop9:
            	    do {
            	        int alt9=2;
            	        int LA9_0 = input.LA(1);

            	        if ( (LA9_0==RULE_ID) ) {
            	            alt9=1;
            	        }


            	        switch (alt9) {
            	    	case 1 :
            	    	    // InternalIHE.g:411:5: (lv_rules_23_0= ruleRule )
            	    	    {
            	    	    // InternalIHE.g:411:5: (lv_rules_23_0= ruleRule )
            	    	    // InternalIHE.g:412:6: lv_rules_23_0= ruleRule
            	    	    {

            	    	    						newCompositeNode(grammarAccess.getMainTgfAccess().getRulesRuleParserRuleCall_9_2_0());
            	    	    					
            	    	    pushFollow(FOLLOW_9);
            	    	    lv_rules_23_0=ruleRule();

            	    	    state._fsp--;


            	    	    						if (current==null) {
            	    	    							current = createModelElementForParent(grammarAccess.getMainTgfRule());
            	    	    						}
            	    	    						add(
            	    	    							current,
            	    	    							"rules",
            	    	    							lv_rules_23_0,
            	    	    							"com.spirit.ihe.IHE.Rule");
            	    	    						afterParserOrEnumRuleCall();
            	    	    					

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop9;
            	        }
            	    } while (true);

            	    otherlv_24=(Token)match(input,22,FOLLOW_7); 

            	    				newLeafNode(otherlv_24, grammarAccess.getMainTgfAccess().getRightCurlyBracketKeyword_9_3());
            	    			

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalIHE.g:434:3: ( (lv_prof_25_0= ruleProfile ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==23) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalIHE.g:435:4: (lv_prof_25_0= ruleProfile )
            	    {
            	    // InternalIHE.g:435:4: (lv_prof_25_0= ruleProfile )
            	    // InternalIHE.g:436:5: lv_prof_25_0= ruleProfile
            	    {

            	    					newCompositeNode(grammarAccess.getMainTgfAccess().getProfProfileParserRuleCall_10_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_prof_25_0=ruleProfile();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMainTgfRule());
            	    					}
            	    					add(
            	    						current,
            	    						"prof",
            	    						lv_prof_25_0,
            	    						"com.spirit.ihe.IHE.Profile");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            otherlv_26=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_26, grammarAccess.getMainTgfAccess().getRightCurlyBracketKeyword_11());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMainTgf"


    // $ANTLR start "entryRuleProfile"
    // InternalIHE.g:461:1: entryRuleProfile returns [EObject current=null] : iv_ruleProfile= ruleProfile EOF ;
    public final EObject entryRuleProfile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProfile = null;


        try {
            // InternalIHE.g:461:48: (iv_ruleProfile= ruleProfile EOF )
            // InternalIHE.g:462:2: iv_ruleProfile= ruleProfile EOF
            {
             newCompositeNode(grammarAccess.getProfileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProfile=ruleProfile();

            state._fsp--;

             current =iv_ruleProfile; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProfile"


    // $ANTLR start "ruleProfile"
    // InternalIHE.g:468:1: ruleProfile returns [EObject current=null] : (otherlv_0= 'Profile' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' otherlv_4= ':' ( (lv_profName_5_0= RULE_STRING ) ) )? (otherlv_6= 'Description' otherlv_7= ':' ( (lv_descrName_8_0= RULE_STRING ) ) )? (otherlv_9= 'Features' otherlv_10= ':' ( (lv_featName_11_0= RULE_STRING ) ) )? (otherlv_12= 'Function' otherlv_13= ':' ( (lv_functionName_14_0= RULE_STRING ) ) )? otherlv_15= 'actors:' ( (lv_actor_16_0= ruleActor ) )+ otherlv_17= 'transactions:' ( (lv_transaction_18_0= ruleTransaction ) )* otherlv_19= 'domains:' ( (lv_domain_20_0= ruleDomain ) )* otherlv_21= 'quality_attributes:' ( (lv_qualityattr_22_0= ruleQualityAttr ) )* otherlv_23= 'security_requirements:' ( (lv_secre_24_0= ruleSecRequirements ) )* otherlv_25= '}' ) ;
    public final EObject ruleProfile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_profName_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_descrName_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_featName_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_functionName_14_0=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        AntlrDatatypeRuleToken lv_actor_16_0 = null;

        AntlrDatatypeRuleToken lv_transaction_18_0 = null;

        AntlrDatatypeRuleToken lv_domain_20_0 = null;

        AntlrDatatypeRuleToken lv_qualityattr_22_0 = null;

        EObject lv_secre_24_0 = null;



        	enterRule();

        try {
            // InternalIHE.g:474:2: ( (otherlv_0= 'Profile' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' otherlv_4= ':' ( (lv_profName_5_0= RULE_STRING ) ) )? (otherlv_6= 'Description' otherlv_7= ':' ( (lv_descrName_8_0= RULE_STRING ) ) )? (otherlv_9= 'Features' otherlv_10= ':' ( (lv_featName_11_0= RULE_STRING ) ) )? (otherlv_12= 'Function' otherlv_13= ':' ( (lv_functionName_14_0= RULE_STRING ) ) )? otherlv_15= 'actors:' ( (lv_actor_16_0= ruleActor ) )+ otherlv_17= 'transactions:' ( (lv_transaction_18_0= ruleTransaction ) )* otherlv_19= 'domains:' ( (lv_domain_20_0= ruleDomain ) )* otherlv_21= 'quality_attributes:' ( (lv_qualityattr_22_0= ruleQualityAttr ) )* otherlv_23= 'security_requirements:' ( (lv_secre_24_0= ruleSecRequirements ) )* otherlv_25= '}' ) )
            // InternalIHE.g:475:2: (otherlv_0= 'Profile' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' otherlv_4= ':' ( (lv_profName_5_0= RULE_STRING ) ) )? (otherlv_6= 'Description' otherlv_7= ':' ( (lv_descrName_8_0= RULE_STRING ) ) )? (otherlv_9= 'Features' otherlv_10= ':' ( (lv_featName_11_0= RULE_STRING ) ) )? (otherlv_12= 'Function' otherlv_13= ':' ( (lv_functionName_14_0= RULE_STRING ) ) )? otherlv_15= 'actors:' ( (lv_actor_16_0= ruleActor ) )+ otherlv_17= 'transactions:' ( (lv_transaction_18_0= ruleTransaction ) )* otherlv_19= 'domains:' ( (lv_domain_20_0= ruleDomain ) )* otherlv_21= 'quality_attributes:' ( (lv_qualityattr_22_0= ruleQualityAttr ) )* otherlv_23= 'security_requirements:' ( (lv_secre_24_0= ruleSecRequirements ) )* otherlv_25= '}' )
            {
            // InternalIHE.g:475:2: (otherlv_0= 'Profile' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' otherlv_4= ':' ( (lv_profName_5_0= RULE_STRING ) ) )? (otherlv_6= 'Description' otherlv_7= ':' ( (lv_descrName_8_0= RULE_STRING ) ) )? (otherlv_9= 'Features' otherlv_10= ':' ( (lv_featName_11_0= RULE_STRING ) ) )? (otherlv_12= 'Function' otherlv_13= ':' ( (lv_functionName_14_0= RULE_STRING ) ) )? otherlv_15= 'actors:' ( (lv_actor_16_0= ruleActor ) )+ otherlv_17= 'transactions:' ( (lv_transaction_18_0= ruleTransaction ) )* otherlv_19= 'domains:' ( (lv_domain_20_0= ruleDomain ) )* otherlv_21= 'quality_attributes:' ( (lv_qualityattr_22_0= ruleQualityAttr ) )* otherlv_23= 'security_requirements:' ( (lv_secre_24_0= ruleSecRequirements ) )* otherlv_25= '}' )
            // InternalIHE.g:476:3: otherlv_0= 'Profile' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' otherlv_4= ':' ( (lv_profName_5_0= RULE_STRING ) ) )? (otherlv_6= 'Description' otherlv_7= ':' ( (lv_descrName_8_0= RULE_STRING ) ) )? (otherlv_9= 'Features' otherlv_10= ':' ( (lv_featName_11_0= RULE_STRING ) ) )? (otherlv_12= 'Function' otherlv_13= ':' ( (lv_functionName_14_0= RULE_STRING ) ) )? otherlv_15= 'actors:' ( (lv_actor_16_0= ruleActor ) )+ otherlv_17= 'transactions:' ( (lv_transaction_18_0= ruleTransaction ) )* otherlv_19= 'domains:' ( (lv_domain_20_0= ruleDomain ) )* otherlv_21= 'quality_attributes:' ( (lv_qualityattr_22_0= ruleQualityAttr ) )* otherlv_23= 'security_requirements:' ( (lv_secre_24_0= ruleSecRequirements ) )* otherlv_25= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getProfileAccess().getProfileKeyword_0());
            		
            // InternalIHE.g:480:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIHE.g:481:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIHE.g:481:4: (lv_name_1_0= RULE_ID )
            // InternalIHE.g:482:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getProfileAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProfileRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getProfileAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalIHE.g:502:3: (otherlv_3= 'Name' otherlv_4= ':' ( (lv_profName_5_0= RULE_STRING ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==16) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalIHE.g:503:4: otherlv_3= 'Name' otherlv_4= ':' ( (lv_profName_5_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getProfileAccess().getNameKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getProfileAccess().getColonKeyword_3_1());
                    			
                    // InternalIHE.g:511:4: ( (lv_profName_5_0= RULE_STRING ) )
                    // InternalIHE.g:512:5: (lv_profName_5_0= RULE_STRING )
                    {
                    // InternalIHE.g:512:5: (lv_profName_5_0= RULE_STRING )
                    // InternalIHE.g:513:6: lv_profName_5_0= RULE_STRING
                    {
                    lv_profName_5_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

                    						newLeafNode(lv_profName_5_0, grammarAccess.getProfileAccess().getProfNameSTRINGTerminalRuleCall_3_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getProfileRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"profName",
                    							lv_profName_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalIHE.g:530:3: (otherlv_6= 'Description' otherlv_7= ':' ( (lv_descrName_8_0= RULE_STRING ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalIHE.g:531:4: otherlv_6= 'Description' otherlv_7= ':' ( (lv_descrName_8_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,24,FOLLOW_8); 

                    				newLeafNode(otherlv_6, grammarAccess.getProfileAccess().getDescriptionKeyword_4_0());
                    			
                    otherlv_7=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getProfileAccess().getColonKeyword_4_1());
                    			
                    // InternalIHE.g:539:4: ( (lv_descrName_8_0= RULE_STRING ) )
                    // InternalIHE.g:540:5: (lv_descrName_8_0= RULE_STRING )
                    {
                    // InternalIHE.g:540:5: (lv_descrName_8_0= RULE_STRING )
                    // InternalIHE.g:541:6: lv_descrName_8_0= RULE_STRING
                    {
                    lv_descrName_8_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

                    						newLeafNode(lv_descrName_8_0, grammarAccess.getProfileAccess().getDescrNameSTRINGTerminalRuleCall_4_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getProfileRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"descrName",
                    							lv_descrName_8_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalIHE.g:558:3: (otherlv_9= 'Features' otherlv_10= ':' ( (lv_featName_11_0= RULE_STRING ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==25) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalIHE.g:559:4: otherlv_9= 'Features' otherlv_10= ':' ( (lv_featName_11_0= RULE_STRING ) )
                    {
                    otherlv_9=(Token)match(input,25,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getProfileAccess().getFeaturesKeyword_5_0());
                    			
                    otherlv_10=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getProfileAccess().getColonKeyword_5_1());
                    			
                    // InternalIHE.g:567:4: ( (lv_featName_11_0= RULE_STRING ) )
                    // InternalIHE.g:568:5: (lv_featName_11_0= RULE_STRING )
                    {
                    // InternalIHE.g:568:5: (lv_featName_11_0= RULE_STRING )
                    // InternalIHE.g:569:6: lv_featName_11_0= RULE_STRING
                    {
                    lv_featName_11_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

                    						newLeafNode(lv_featName_11_0, grammarAccess.getProfileAccess().getFeatNameSTRINGTerminalRuleCall_5_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getProfileRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"featName",
                    							lv_featName_11_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalIHE.g:586:3: (otherlv_12= 'Function' otherlv_13= ':' ( (lv_functionName_14_0= RULE_STRING ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==26) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalIHE.g:587:4: otherlv_12= 'Function' otherlv_13= ':' ( (lv_functionName_14_0= RULE_STRING ) )
                    {
                    otherlv_12=(Token)match(input,26,FOLLOW_8); 

                    				newLeafNode(otherlv_12, grammarAccess.getProfileAccess().getFunctionKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_13, grammarAccess.getProfileAccess().getColonKeyword_6_1());
                    			
                    // InternalIHE.g:595:4: ( (lv_functionName_14_0= RULE_STRING ) )
                    // InternalIHE.g:596:5: (lv_functionName_14_0= RULE_STRING )
                    {
                    // InternalIHE.g:596:5: (lv_functionName_14_0= RULE_STRING )
                    // InternalIHE.g:597:6: lv_functionName_14_0= RULE_STRING
                    {
                    lv_functionName_14_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

                    						newLeafNode(lv_functionName_14_0, grammarAccess.getProfileAccess().getFunctionNameSTRINGTerminalRuleCall_6_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getProfileRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"functionName",
                    							lv_functionName_14_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_15, grammarAccess.getProfileAccess().getActorsKeyword_7());
            		
            // InternalIHE.g:618:3: ( (lv_actor_16_0= ruleActor ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_STRING) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalIHE.g:619:4: (lv_actor_16_0= ruleActor )
            	    {
            	    // InternalIHE.g:619:4: (lv_actor_16_0= ruleActor )
            	    // InternalIHE.g:620:5: lv_actor_16_0= ruleActor
            	    {

            	    					newCompositeNode(grammarAccess.getProfileAccess().getActorActorParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_actor_16_0=ruleActor();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProfileRule());
            	    					}
            	    					add(
            	    						current,
            	    						"actor",
            	    						lv_actor_16_0,
            	    						"com.spirit.ihe.IHE.Actor");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);

            otherlv_17=(Token)match(input,28,FOLLOW_17); 

            			newLeafNode(otherlv_17, grammarAccess.getProfileAccess().getTransactionsKeyword_9());
            		
            // InternalIHE.g:641:3: ( (lv_transaction_18_0= ruleTransaction ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==39) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalIHE.g:642:4: (lv_transaction_18_0= ruleTransaction )
            	    {
            	    // InternalIHE.g:642:4: (lv_transaction_18_0= ruleTransaction )
            	    // InternalIHE.g:643:5: lv_transaction_18_0= ruleTransaction
            	    {

            	    					newCompositeNode(grammarAccess.getProfileAccess().getTransactionTransactionParserRuleCall_10_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_transaction_18_0=ruleTransaction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProfileRule());
            	    					}
            	    					add(
            	    						current,
            	    						"transaction",
            	    						lv_transaction_18_0,
            	    						"com.spirit.ihe.IHE.Transaction");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_19=(Token)match(input,29,FOLLOW_18); 

            			newLeafNode(otherlv_19, grammarAccess.getProfileAccess().getDomainsKeyword_11());
            		
            // InternalIHE.g:664:3: ( (lv_domain_20_0= ruleDomain ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_STRING) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalIHE.g:665:4: (lv_domain_20_0= ruleDomain )
            	    {
            	    // InternalIHE.g:665:4: (lv_domain_20_0= ruleDomain )
            	    // InternalIHE.g:666:5: lv_domain_20_0= ruleDomain
            	    {

            	    					newCompositeNode(grammarAccess.getProfileAccess().getDomainDomainParserRuleCall_12_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_domain_20_0=ruleDomain();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProfileRule());
            	    					}
            	    					add(
            	    						current,
            	    						"domain",
            	    						lv_domain_20_0,
            	    						"com.spirit.ihe.IHE.Domain");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_21=(Token)match(input,30,FOLLOW_19); 

            			newLeafNode(otherlv_21, grammarAccess.getProfileAccess().getQuality_attributesKeyword_13());
            		
            // InternalIHE.g:687:3: ( (lv_qualityattr_22_0= ruleQualityAttr ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalIHE.g:688:4: (lv_qualityattr_22_0= ruleQualityAttr )
            	    {
            	    // InternalIHE.g:688:4: (lv_qualityattr_22_0= ruleQualityAttr )
            	    // InternalIHE.g:689:5: lv_qualityattr_22_0= ruleQualityAttr
            	    {

            	    					newCompositeNode(grammarAccess.getProfileAccess().getQualityattrQualityAttrParserRuleCall_14_0());
            	    				
            	    pushFollow(FOLLOW_19);
            	    lv_qualityattr_22_0=ruleQualityAttr();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProfileRule());
            	    					}
            	    					add(
            	    						current,
            	    						"qualityattr",
            	    						lv_qualityattr_22_0,
            	    						"com.spirit.ihe.IHE.QualityAttr");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            otherlv_23=(Token)match(input,31,FOLLOW_9); 

            			newLeafNode(otherlv_23, grammarAccess.getProfileAccess().getSecurity_requirementsKeyword_15());
            		
            // InternalIHE.g:710:3: ( (lv_secre_24_0= ruleSecRequirements ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalIHE.g:711:4: (lv_secre_24_0= ruleSecRequirements )
            	    {
            	    // InternalIHE.g:711:4: (lv_secre_24_0= ruleSecRequirements )
            	    // InternalIHE.g:712:5: lv_secre_24_0= ruleSecRequirements
            	    {

            	    					newCompositeNode(grammarAccess.getProfileAccess().getSecreSecRequirementsParserRuleCall_16_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_secre_24_0=ruleSecRequirements();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProfileRule());
            	    					}
            	    					add(
            	    						current,
            	    						"secre",
            	    						lv_secre_24_0,
            	    						"com.spirit.ihe.IHE.SecRequirements");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_25=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_25, grammarAccess.getProfileAccess().getRightCurlyBracketKeyword_17());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProfile"


    // $ANTLR start "entryRuleSecRequirements"
    // InternalIHE.g:737:1: entryRuleSecRequirements returns [EObject current=null] : iv_ruleSecRequirements= ruleSecRequirements EOF ;
    public final EObject entryRuleSecRequirements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSecRequirements = null;


        try {
            // InternalIHE.g:737:56: (iv_ruleSecRequirements= ruleSecRequirements EOF )
            // InternalIHE.g:738:2: iv_ruleSecRequirements= ruleSecRequirements EOF
            {
             newCompositeNode(grammarAccess.getSecRequirementsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSecRequirements=ruleSecRequirements();

            state._fsp--;

             current =iv_ruleSecRequirements; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSecRequirements"


    // $ANTLR start "ruleSecRequirements"
    // InternalIHE.g:744:1: ruleSecRequirements returns [EObject current=null] : ( ( (lv_SecReID_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'Form' otherlv_3= ':' ( (lv_secreForm_4_0= RULE_STRING ) ) )? (otherlv_5= 'Sensitivity' otherlv_6= ':' ( (lv_secreSensitivity_7_0= RULE_STRING ) ) )? (otherlv_8= 'Location' otherlv_9= ':' ( (lv_secreLocation_10_0= RULE_STRING ) ) )? (otherlv_11= 'State' otherlv_12= ':' ( (lv_secreState_13_0= RULE_STRING ) ) )? (otherlv_14= 'Goal' otherlv_15= ':' ( (lv_secreGoal_16_0= RULE_STRING ) ) )? (otherlv_17= 'Countermeasure' otherlv_18= ':' ( (lv_secreCountermeasure_19_0= RULE_STRING ) ) )? (otherlv_20= 'Category' otherlv_21= ':' ( (lv_secreCategory_22_0= RULE_STRING ) ) )? otherlv_23= '}' ) ;
    public final EObject ruleSecRequirements() throws RecognitionException {
        EObject current = null;

        Token lv_SecReID_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_secreForm_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_secreSensitivity_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_secreLocation_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_secreState_13_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_secreGoal_16_0=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token lv_secreCountermeasure_19_0=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token lv_secreCategory_22_0=null;
        Token otherlv_23=null;


        	enterRule();

        try {
            // InternalIHE.g:750:2: ( ( ( (lv_SecReID_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'Form' otherlv_3= ':' ( (lv_secreForm_4_0= RULE_STRING ) ) )? (otherlv_5= 'Sensitivity' otherlv_6= ':' ( (lv_secreSensitivity_7_0= RULE_STRING ) ) )? (otherlv_8= 'Location' otherlv_9= ':' ( (lv_secreLocation_10_0= RULE_STRING ) ) )? (otherlv_11= 'State' otherlv_12= ':' ( (lv_secreState_13_0= RULE_STRING ) ) )? (otherlv_14= 'Goal' otherlv_15= ':' ( (lv_secreGoal_16_0= RULE_STRING ) ) )? (otherlv_17= 'Countermeasure' otherlv_18= ':' ( (lv_secreCountermeasure_19_0= RULE_STRING ) ) )? (otherlv_20= 'Category' otherlv_21= ':' ( (lv_secreCategory_22_0= RULE_STRING ) ) )? otherlv_23= '}' ) )
            // InternalIHE.g:751:2: ( ( (lv_SecReID_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'Form' otherlv_3= ':' ( (lv_secreForm_4_0= RULE_STRING ) ) )? (otherlv_5= 'Sensitivity' otherlv_6= ':' ( (lv_secreSensitivity_7_0= RULE_STRING ) ) )? (otherlv_8= 'Location' otherlv_9= ':' ( (lv_secreLocation_10_0= RULE_STRING ) ) )? (otherlv_11= 'State' otherlv_12= ':' ( (lv_secreState_13_0= RULE_STRING ) ) )? (otherlv_14= 'Goal' otherlv_15= ':' ( (lv_secreGoal_16_0= RULE_STRING ) ) )? (otherlv_17= 'Countermeasure' otherlv_18= ':' ( (lv_secreCountermeasure_19_0= RULE_STRING ) ) )? (otherlv_20= 'Category' otherlv_21= ':' ( (lv_secreCategory_22_0= RULE_STRING ) ) )? otherlv_23= '}' )
            {
            // InternalIHE.g:751:2: ( ( (lv_SecReID_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'Form' otherlv_3= ':' ( (lv_secreForm_4_0= RULE_STRING ) ) )? (otherlv_5= 'Sensitivity' otherlv_6= ':' ( (lv_secreSensitivity_7_0= RULE_STRING ) ) )? (otherlv_8= 'Location' otherlv_9= ':' ( (lv_secreLocation_10_0= RULE_STRING ) ) )? (otherlv_11= 'State' otherlv_12= ':' ( (lv_secreState_13_0= RULE_STRING ) ) )? (otherlv_14= 'Goal' otherlv_15= ':' ( (lv_secreGoal_16_0= RULE_STRING ) ) )? (otherlv_17= 'Countermeasure' otherlv_18= ':' ( (lv_secreCountermeasure_19_0= RULE_STRING ) ) )? (otherlv_20= 'Category' otherlv_21= ':' ( (lv_secreCategory_22_0= RULE_STRING ) ) )? otherlv_23= '}' )
            // InternalIHE.g:752:3: ( (lv_SecReID_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'Form' otherlv_3= ':' ( (lv_secreForm_4_0= RULE_STRING ) ) )? (otherlv_5= 'Sensitivity' otherlv_6= ':' ( (lv_secreSensitivity_7_0= RULE_STRING ) ) )? (otherlv_8= 'Location' otherlv_9= ':' ( (lv_secreLocation_10_0= RULE_STRING ) ) )? (otherlv_11= 'State' otherlv_12= ':' ( (lv_secreState_13_0= RULE_STRING ) ) )? (otherlv_14= 'Goal' otherlv_15= ':' ( (lv_secreGoal_16_0= RULE_STRING ) ) )? (otherlv_17= 'Countermeasure' otherlv_18= ':' ( (lv_secreCountermeasure_19_0= RULE_STRING ) ) )? (otherlv_20= 'Category' otherlv_21= ':' ( (lv_secreCategory_22_0= RULE_STRING ) ) )? otherlv_23= '}'
            {
            // InternalIHE.g:752:3: ( (lv_SecReID_0_0= RULE_ID ) )
            // InternalIHE.g:753:4: (lv_SecReID_0_0= RULE_ID )
            {
            // InternalIHE.g:753:4: (lv_SecReID_0_0= RULE_ID )
            // InternalIHE.g:754:5: lv_SecReID_0_0= RULE_ID
            {
            lv_SecReID_0_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_SecReID_0_0, grammarAccess.getSecRequirementsAccess().getSecReIDIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSecRequirementsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"SecReID",
            						lv_SecReID_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getSecRequirementsAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalIHE.g:774:3: (otherlv_2= 'Form' otherlv_3= ':' ( (lv_secreForm_4_0= RULE_STRING ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==32) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalIHE.g:775:4: otherlv_2= 'Form' otherlv_3= ':' ( (lv_secreForm_4_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,32,FOLLOW_8); 

                    				newLeafNode(otherlv_2, grammarAccess.getSecRequirementsAccess().getFormKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getSecRequirementsAccess().getColonKeyword_2_1());
                    			
                    // InternalIHE.g:783:4: ( (lv_secreForm_4_0= RULE_STRING ) )
                    // InternalIHE.g:784:5: (lv_secreForm_4_0= RULE_STRING )
                    {
                    // InternalIHE.g:784:5: (lv_secreForm_4_0= RULE_STRING )
                    // InternalIHE.g:785:6: lv_secreForm_4_0= RULE_STRING
                    {
                    lv_secreForm_4_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

                    						newLeafNode(lv_secreForm_4_0, grammarAccess.getSecRequirementsAccess().getSecreFormSTRINGTerminalRuleCall_2_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSecRequirementsRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"secreForm",
                    							lv_secreForm_4_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalIHE.g:802:3: (otherlv_5= 'Sensitivity' otherlv_6= ':' ( (lv_secreSensitivity_7_0= RULE_STRING ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==33) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalIHE.g:803:4: otherlv_5= 'Sensitivity' otherlv_6= ':' ( (lv_secreSensitivity_7_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,33,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getSecRequirementsAccess().getSensitivityKeyword_3_0());
                    			
                    otherlv_6=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getSecRequirementsAccess().getColonKeyword_3_1());
                    			
                    // InternalIHE.g:811:4: ( (lv_secreSensitivity_7_0= RULE_STRING ) )
                    // InternalIHE.g:812:5: (lv_secreSensitivity_7_0= RULE_STRING )
                    {
                    // InternalIHE.g:812:5: (lv_secreSensitivity_7_0= RULE_STRING )
                    // InternalIHE.g:813:6: lv_secreSensitivity_7_0= RULE_STRING
                    {
                    lv_secreSensitivity_7_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

                    						newLeafNode(lv_secreSensitivity_7_0, grammarAccess.getSecRequirementsAccess().getSecreSensitivitySTRINGTerminalRuleCall_3_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSecRequirementsRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"secreSensitivity",
                    							lv_secreSensitivity_7_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalIHE.g:830:3: (otherlv_8= 'Location' otherlv_9= ':' ( (lv_secreLocation_10_0= RULE_STRING ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==34) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalIHE.g:831:4: otherlv_8= 'Location' otherlv_9= ':' ( (lv_secreLocation_10_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,34,FOLLOW_8); 

                    				newLeafNode(otherlv_8, grammarAccess.getSecRequirementsAccess().getLocationKeyword_4_0());
                    			
                    otherlv_9=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_9, grammarAccess.getSecRequirementsAccess().getColonKeyword_4_1());
                    			
                    // InternalIHE.g:839:4: ( (lv_secreLocation_10_0= RULE_STRING ) )
                    // InternalIHE.g:840:5: (lv_secreLocation_10_0= RULE_STRING )
                    {
                    // InternalIHE.g:840:5: (lv_secreLocation_10_0= RULE_STRING )
                    // InternalIHE.g:841:6: lv_secreLocation_10_0= RULE_STRING
                    {
                    lv_secreLocation_10_0=(Token)match(input,RULE_STRING,FOLLOW_23); 

                    						newLeafNode(lv_secreLocation_10_0, grammarAccess.getSecRequirementsAccess().getSecreLocationSTRINGTerminalRuleCall_4_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSecRequirementsRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"secreLocation",
                    							lv_secreLocation_10_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalIHE.g:858:3: (otherlv_11= 'State' otherlv_12= ':' ( (lv_secreState_13_0= RULE_STRING ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==35) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalIHE.g:859:4: otherlv_11= 'State' otherlv_12= ':' ( (lv_secreState_13_0= RULE_STRING ) )
                    {
                    otherlv_11=(Token)match(input,35,FOLLOW_8); 

                    				newLeafNode(otherlv_11, grammarAccess.getSecRequirementsAccess().getStateKeyword_5_0());
                    			
                    otherlv_12=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_12, grammarAccess.getSecRequirementsAccess().getColonKeyword_5_1());
                    			
                    // InternalIHE.g:867:4: ( (lv_secreState_13_0= RULE_STRING ) )
                    // InternalIHE.g:868:5: (lv_secreState_13_0= RULE_STRING )
                    {
                    // InternalIHE.g:868:5: (lv_secreState_13_0= RULE_STRING )
                    // InternalIHE.g:869:6: lv_secreState_13_0= RULE_STRING
                    {
                    lv_secreState_13_0=(Token)match(input,RULE_STRING,FOLLOW_24); 

                    						newLeafNode(lv_secreState_13_0, grammarAccess.getSecRequirementsAccess().getSecreStateSTRINGTerminalRuleCall_5_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSecRequirementsRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"secreState",
                    							lv_secreState_13_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalIHE.g:886:3: (otherlv_14= 'Goal' otherlv_15= ':' ( (lv_secreGoal_16_0= RULE_STRING ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==36) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalIHE.g:887:4: otherlv_14= 'Goal' otherlv_15= ':' ( (lv_secreGoal_16_0= RULE_STRING ) )
                    {
                    otherlv_14=(Token)match(input,36,FOLLOW_8); 

                    				newLeafNode(otherlv_14, grammarAccess.getSecRequirementsAccess().getGoalKeyword_6_0());
                    			
                    otherlv_15=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_15, grammarAccess.getSecRequirementsAccess().getColonKeyword_6_1());
                    			
                    // InternalIHE.g:895:4: ( (lv_secreGoal_16_0= RULE_STRING ) )
                    // InternalIHE.g:896:5: (lv_secreGoal_16_0= RULE_STRING )
                    {
                    // InternalIHE.g:896:5: (lv_secreGoal_16_0= RULE_STRING )
                    // InternalIHE.g:897:6: lv_secreGoal_16_0= RULE_STRING
                    {
                    lv_secreGoal_16_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

                    						newLeafNode(lv_secreGoal_16_0, grammarAccess.getSecRequirementsAccess().getSecreGoalSTRINGTerminalRuleCall_6_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSecRequirementsRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"secreGoal",
                    							lv_secreGoal_16_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalIHE.g:914:3: (otherlv_17= 'Countermeasure' otherlv_18= ':' ( (lv_secreCountermeasure_19_0= RULE_STRING ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==37) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalIHE.g:915:4: otherlv_17= 'Countermeasure' otherlv_18= ':' ( (lv_secreCountermeasure_19_0= RULE_STRING ) )
                    {
                    otherlv_17=(Token)match(input,37,FOLLOW_8); 

                    				newLeafNode(otherlv_17, grammarAccess.getSecRequirementsAccess().getCountermeasureKeyword_7_0());
                    			
                    otherlv_18=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_18, grammarAccess.getSecRequirementsAccess().getColonKeyword_7_1());
                    			
                    // InternalIHE.g:923:4: ( (lv_secreCountermeasure_19_0= RULE_STRING ) )
                    // InternalIHE.g:924:5: (lv_secreCountermeasure_19_0= RULE_STRING )
                    {
                    // InternalIHE.g:924:5: (lv_secreCountermeasure_19_0= RULE_STRING )
                    // InternalIHE.g:925:6: lv_secreCountermeasure_19_0= RULE_STRING
                    {
                    lv_secreCountermeasure_19_0=(Token)match(input,RULE_STRING,FOLLOW_26); 

                    						newLeafNode(lv_secreCountermeasure_19_0, grammarAccess.getSecRequirementsAccess().getSecreCountermeasureSTRINGTerminalRuleCall_7_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSecRequirementsRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"secreCountermeasure",
                    							lv_secreCountermeasure_19_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalIHE.g:942:3: (otherlv_20= 'Category' otherlv_21= ':' ( (lv_secreCategory_22_0= RULE_STRING ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==38) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalIHE.g:943:4: otherlv_20= 'Category' otherlv_21= ':' ( (lv_secreCategory_22_0= RULE_STRING ) )
                    {
                    otherlv_20=(Token)match(input,38,FOLLOW_8); 

                    				newLeafNode(otherlv_20, grammarAccess.getSecRequirementsAccess().getCategoryKeyword_8_0());
                    			
                    otherlv_21=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_21, grammarAccess.getSecRequirementsAccess().getColonKeyword_8_1());
                    			
                    // InternalIHE.g:951:4: ( (lv_secreCategory_22_0= RULE_STRING ) )
                    // InternalIHE.g:952:5: (lv_secreCategory_22_0= RULE_STRING )
                    {
                    // InternalIHE.g:952:5: (lv_secreCategory_22_0= RULE_STRING )
                    // InternalIHE.g:953:6: lv_secreCategory_22_0= RULE_STRING
                    {
                    lv_secreCategory_22_0=(Token)match(input,RULE_STRING,FOLLOW_27); 

                    						newLeafNode(lv_secreCategory_22_0, grammarAccess.getSecRequirementsAccess().getSecreCategorySTRINGTerminalRuleCall_8_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSecRequirementsRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"secreCategory",
                    							lv_secreCategory_22_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_23=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_23, grammarAccess.getSecRequirementsAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSecRequirements"


    // $ANTLR start "entryRuleActor"
    // InternalIHE.g:978:1: entryRuleActor returns [String current=null] : iv_ruleActor= ruleActor EOF ;
    public final String entryRuleActor() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleActor = null;


        try {
            // InternalIHE.g:978:45: (iv_ruleActor= ruleActor EOF )
            // InternalIHE.g:979:2: iv_ruleActor= ruleActor EOF
            {
             newCompositeNode(grammarAccess.getActorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActor=ruleActor();

            state._fsp--;

             current =iv_ruleActor.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActor"


    // $ANTLR start "ruleActor"
    // InternalIHE.g:985:1: ruleActor returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleActor() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalIHE.g:991:2: (this_STRING_0= RULE_STRING )
            // InternalIHE.g:992:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            		current.merge(this_STRING_0);
            	

            		newLeafNode(this_STRING_0, grammarAccess.getActorAccess().getSTRINGTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActor"


    // $ANTLR start "entryRuleTransaction"
    // InternalIHE.g:1002:1: entryRuleTransaction returns [String current=null] : iv_ruleTransaction= ruleTransaction EOF ;
    public final String entryRuleTransaction() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTransaction = null;


        try {
            // InternalIHE.g:1002:51: (iv_ruleTransaction= ruleTransaction EOF )
            // InternalIHE.g:1003:2: iv_ruleTransaction= ruleTransaction EOF
            {
             newCompositeNode(grammarAccess.getTransactionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransaction=ruleTransaction();

            state._fsp--;

             current =iv_ruleTransaction.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransaction"


    // $ANTLR start "ruleTransaction"
    // InternalIHE.g:1009:1: ruleTransaction returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '(' this_Actor_1= ruleActor kw= ',' this_STRING_3= RULE_STRING kw= ',' this_Actor_5= ruleActor kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleTransaction() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_STRING_3=null;
        AntlrDatatypeRuleToken this_Actor_1 = null;

        AntlrDatatypeRuleToken this_Actor_5 = null;



        	enterRule();

        try {
            // InternalIHE.g:1015:2: ( (kw= '(' this_Actor_1= ruleActor kw= ',' this_STRING_3= RULE_STRING kw= ',' this_Actor_5= ruleActor kw= ')' ) )
            // InternalIHE.g:1016:2: (kw= '(' this_Actor_1= ruleActor kw= ',' this_STRING_3= RULE_STRING kw= ',' this_Actor_5= ruleActor kw= ')' )
            {
            // InternalIHE.g:1016:2: (kw= '(' this_Actor_1= ruleActor kw= ',' this_STRING_3= RULE_STRING kw= ',' this_Actor_5= ruleActor kw= ')' )
            // InternalIHE.g:1017:3: kw= '(' this_Actor_1= ruleActor kw= ',' this_STRING_3= RULE_STRING kw= ',' this_Actor_5= ruleActor kw= ')'
            {
            kw=(Token)match(input,39,FOLLOW_4); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getTransactionAccess().getLeftParenthesisKeyword_0());
            		

            			newCompositeNode(grammarAccess.getTransactionAccess().getActorParserRuleCall_1());
            		
            pushFollow(FOLLOW_28);
            this_Actor_1=ruleActor();

            state._fsp--;


            			current.merge(this_Actor_1);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,40,FOLLOW_4); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getTransactionAccess().getCommaKeyword_2());
            		
            this_STRING_3=(Token)match(input,RULE_STRING,FOLLOW_28); 

            			current.merge(this_STRING_3);
            		

            			newLeafNode(this_STRING_3, grammarAccess.getTransactionAccess().getSTRINGTerminalRuleCall_3());
            		
            kw=(Token)match(input,40,FOLLOW_4); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getTransactionAccess().getCommaKeyword_4());
            		

            			newCompositeNode(grammarAccess.getTransactionAccess().getActorParserRuleCall_5());
            		
            pushFollow(FOLLOW_29);
            this_Actor_5=ruleActor();

            state._fsp--;


            			current.merge(this_Actor_5);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,41,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getTransactionAccess().getRightParenthesisKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransaction"


    // $ANTLR start "entryRuleDomain"
    // InternalIHE.g:1068:1: entryRuleDomain returns [String current=null] : iv_ruleDomain= ruleDomain EOF ;
    public final String entryRuleDomain() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDomain = null;


        try {
            // InternalIHE.g:1068:46: (iv_ruleDomain= ruleDomain EOF )
            // InternalIHE.g:1069:2: iv_ruleDomain= ruleDomain EOF
            {
             newCompositeNode(grammarAccess.getDomainRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDomain=ruleDomain();

            state._fsp--;

             current =iv_ruleDomain.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDomain"


    // $ANTLR start "ruleDomain"
    // InternalIHE.g:1075:1: ruleDomain returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleDomain() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalIHE.g:1081:2: (this_STRING_0= RULE_STRING )
            // InternalIHE.g:1082:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            		current.merge(this_STRING_0);
            	

            		newLeafNode(this_STRING_0, grammarAccess.getDomainAccess().getSTRINGTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDomain"


    // $ANTLR start "entryRuleQualityAttr"
    // InternalIHE.g:1092:1: entryRuleQualityAttr returns [String current=null] : iv_ruleQualityAttr= ruleQualityAttr EOF ;
    public final String entryRuleQualityAttr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualityAttr = null;


        try {
            // InternalIHE.g:1092:51: (iv_ruleQualityAttr= ruleQualityAttr EOF )
            // InternalIHE.g:1093:2: iv_ruleQualityAttr= ruleQualityAttr EOF
            {
             newCompositeNode(grammarAccess.getQualityAttrRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualityAttr=ruleQualityAttr();

            state._fsp--;

             current =iv_ruleQualityAttr.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualityAttr"


    // $ANTLR start "ruleQualityAttr"
    // InternalIHE.g:1099:1: ruleQualityAttr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualityAttrID_0= ruleQualityAttrID kw= '[' this_STRING_2= RULE_STRING kw= ']' ) ;
    public final AntlrDatatypeRuleToken ruleQualityAttr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_STRING_2=null;
        AntlrDatatypeRuleToken this_QualityAttrID_0 = null;



        	enterRule();

        try {
            // InternalIHE.g:1105:2: ( (this_QualityAttrID_0= ruleQualityAttrID kw= '[' this_STRING_2= RULE_STRING kw= ']' ) )
            // InternalIHE.g:1106:2: (this_QualityAttrID_0= ruleQualityAttrID kw= '[' this_STRING_2= RULE_STRING kw= ']' )
            {
            // InternalIHE.g:1106:2: (this_QualityAttrID_0= ruleQualityAttrID kw= '[' this_STRING_2= RULE_STRING kw= ']' )
            // InternalIHE.g:1107:3: this_QualityAttrID_0= ruleQualityAttrID kw= '[' this_STRING_2= RULE_STRING kw= ']'
            {

            			newCompositeNode(grammarAccess.getQualityAttrAccess().getQualityAttrIDParserRuleCall_0());
            		
            pushFollow(FOLLOW_30);
            this_QualityAttrID_0=ruleQualityAttrID();

            state._fsp--;


            			current.merge(this_QualityAttrID_0);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,42,FOLLOW_4); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getQualityAttrAccess().getLeftSquareBracketKeyword_1());
            		
            this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_31); 

            			current.merge(this_STRING_2);
            		

            			newLeafNode(this_STRING_2, grammarAccess.getQualityAttrAccess().getSTRINGTerminalRuleCall_2());
            		
            kw=(Token)match(input,43,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getQualityAttrAccess().getRightSquareBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualityAttr"


    // $ANTLR start "entryRuleQualityAttrID"
    // InternalIHE.g:1138:1: entryRuleQualityAttrID returns [String current=null] : iv_ruleQualityAttrID= ruleQualityAttrID EOF ;
    public final String entryRuleQualityAttrID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualityAttrID = null;


        try {
            // InternalIHE.g:1138:53: (iv_ruleQualityAttrID= ruleQualityAttrID EOF )
            // InternalIHE.g:1139:2: iv_ruleQualityAttrID= ruleQualityAttrID EOF
            {
             newCompositeNode(grammarAccess.getQualityAttrIDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualityAttrID=ruleQualityAttrID();

            state._fsp--;

             current =iv_ruleQualityAttrID.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualityAttrID"


    // $ANTLR start "ruleQualityAttrID"
    // InternalIHE.g:1145:1: ruleQualityAttrID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleQualityAttrID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalIHE.g:1151:2: (this_ID_0= RULE_ID )
            // InternalIHE.g:1152:2: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            		current.merge(this_ID_0);
            	

            		newLeafNode(this_ID_0, grammarAccess.getQualityAttrIDAccess().getIDTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualityAttrID"


    // $ANTLR start "entryRuleRule"
    // InternalIHE.g:1162:1: entryRuleRule returns [String current=null] : iv_ruleRule= ruleRule EOF ;
    public final String entryRuleRule() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRule = null;


        try {
            // InternalIHE.g:1162:44: (iv_ruleRule= ruleRule EOF )
            // InternalIHE.g:1163:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalIHE.g:1169:1: ruleRule returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_RuleId_0= ruleRuleId kw= ':' this_STRING_2= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleRule() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_STRING_2=null;
        AntlrDatatypeRuleToken this_RuleId_0 = null;



        	enterRule();

        try {
            // InternalIHE.g:1175:2: ( (this_RuleId_0= ruleRuleId kw= ':' this_STRING_2= RULE_STRING ) )
            // InternalIHE.g:1176:2: (this_RuleId_0= ruleRuleId kw= ':' this_STRING_2= RULE_STRING )
            {
            // InternalIHE.g:1176:2: (this_RuleId_0= ruleRuleId kw= ':' this_STRING_2= RULE_STRING )
            // InternalIHE.g:1177:3: this_RuleId_0= ruleRuleId kw= ':' this_STRING_2= RULE_STRING
            {

            			newCompositeNode(grammarAccess.getRuleAccess().getRuleIdParserRuleCall_0());
            		
            pushFollow(FOLLOW_8);
            this_RuleId_0=ruleRuleId();

            state._fsp--;


            			current.merge(this_RuleId_0);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,15,FOLLOW_4); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getRuleAccess().getColonKeyword_1());
            		
            this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_2); 

            			current.merge(this_STRING_2);
            		

            			newLeafNode(this_STRING_2, grammarAccess.getRuleAccess().getSTRINGTerminalRuleCall_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleRuleId"
    // InternalIHE.g:1203:1: entryRuleRuleId returns [String current=null] : iv_ruleRuleId= ruleRuleId EOF ;
    public final String entryRuleRuleId() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRuleId = null;


        try {
            // InternalIHE.g:1203:46: (iv_ruleRuleId= ruleRuleId EOF )
            // InternalIHE.g:1204:2: iv_ruleRuleId= ruleRuleId EOF
            {
             newCompositeNode(grammarAccess.getRuleIdRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRuleId=ruleRuleId();

            state._fsp--;

             current =iv_ruleRuleId.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRuleId"


    // $ANTLR start "ruleRuleId"
    // InternalIHE.g:1210:1: ruleRuleId returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleRuleId() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalIHE.g:1216:2: (this_ID_0= RULE_ID )
            // InternalIHE.g:1217:2: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            		current.merge(this_ID_0);
            	

            		newLeafNode(this_ID_0, grammarAccess.getRuleIdAccess().getIDTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRuleId"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000BF4000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000FF4000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000000F010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000000F000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000008020000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000080000020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000007F00400000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000007E00400000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000007C00400000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000007800400000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000007000400000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000006000400000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000004000400000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000080000000000L});

}
