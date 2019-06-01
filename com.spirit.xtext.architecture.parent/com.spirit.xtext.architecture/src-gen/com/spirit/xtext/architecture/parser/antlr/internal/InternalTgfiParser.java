package com.spirit.xtext.architecture.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.spirit.xtext.architecture.services.TgfiGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTgfiParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'ArchitecturalElement'", "'{'", "'JavaPackage'", "':'", "'Name'", "'Version'", "'Status'", "'Objective'", "'HL_Function'", "'Rules:'", "'}'", "'Profile'", "'Description'", "'Features'", "'Function'", "'actors:'", "'transactions:'", "'domains:'", "'quality_attributes:'", "'quality_securityrequirements:'", "'Goal'", "'Level'", "'Location'", "'State'", "'Descr'", "'Category'", "'('", "','", "')'", "'['", "']'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__42=42;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalTgfiParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTgfiParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTgfiParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTgfi.g"; }



     	private TgfiGrammarAccess grammarAccess;

        public InternalTgfiParser(TokenStream input, TgfiGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Tgfi";
       	}

       	@Override
       	protected TgfiGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleTgfi"
    // InternalTgfi.g:64:1: entryRuleTgfi returns [EObject current=null] : iv_ruleTgfi= ruleTgfi EOF ;
    public final EObject entryRuleTgfi() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTgfi = null;


        try {
            // InternalTgfi.g:64:45: (iv_ruleTgfi= ruleTgfi EOF )
            // InternalTgfi.g:65:2: iv_ruleTgfi= ruleTgfi EOF
            {
             newCompositeNode(grammarAccess.getTgfiRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTgfi=ruleTgfi();

            state._fsp--;

             current =iv_ruleTgfi; 
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
    // $ANTLR end "entryRuleTgfi"


    // $ANTLR start "ruleTgfi"
    // InternalTgfi.g:71:1: ruleTgfi returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => ( (lv_importEl_1_0= ruleImport ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_main_2_0= ruleMainTgf ) ) ) ) ) )* ) ) ) ;
    public final EObject ruleTgfi() throws RecognitionException {
        EObject current = null;

        EObject lv_importEl_1_0 = null;

        EObject lv_main_2_0 = null;



        	enterRule();

        try {
            // InternalTgfi.g:77:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_importEl_1_0= ruleImport ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_main_2_0= ruleMainTgf ) ) ) ) ) )* ) ) ) )
            // InternalTgfi.g:78:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_importEl_1_0= ruleImport ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_main_2_0= ruleMainTgf ) ) ) ) ) )* ) ) )
            {
            // InternalTgfi.g:78:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_importEl_1_0= ruleImport ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_main_2_0= ruleMainTgf ) ) ) ) ) )* ) ) )
            // InternalTgfi.g:79:3: ( ( ( ({...}? => ( ({...}? => ( (lv_importEl_1_0= ruleImport ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_main_2_0= ruleMainTgf ) ) ) ) ) )* ) )
            {
            // InternalTgfi.g:79:3: ( ( ( ({...}? => ( ({...}? => ( (lv_importEl_1_0= ruleImport ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_main_2_0= ruleMainTgf ) ) ) ) ) )* ) )
            // InternalTgfi.g:80:4: ( ( ({...}? => ( ({...}? => ( (lv_importEl_1_0= ruleImport ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_main_2_0= ruleMainTgf ) ) ) ) ) )* )
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getTgfiAccess().getUnorderedGroup());
            			
            // InternalTgfi.g:83:4: ( ( ({...}? => ( ({...}? => ( (lv_importEl_1_0= ruleImport ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_main_2_0= ruleMainTgf ) ) ) ) ) )* )
            // InternalTgfi.g:84:5: ( ({...}? => ( ({...}? => ( (lv_importEl_1_0= ruleImport ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_main_2_0= ruleMainTgf ) ) ) ) ) )*
            {
            // InternalTgfi.g:84:5: ( ({...}? => ( ({...}? => ( (lv_importEl_1_0= ruleImport ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_main_2_0= ruleMainTgf ) ) ) ) ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( LA2_0 == 11 && getUnorderedGroupHelper().canSelect(grammarAccess.getTgfiAccess().getUnorderedGroup(), 0) ) {
                    alt2=1;
                }
                else if ( LA2_0 == 12 && getUnorderedGroupHelper().canSelect(grammarAccess.getTgfiAccess().getUnorderedGroup(), 1) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalTgfi.g:85:3: ({...}? => ( ({...}? => ( (lv_importEl_1_0= ruleImport ) ) )+ ) )
            	    {
            	    // InternalTgfi.g:85:3: ({...}? => ( ({...}? => ( (lv_importEl_1_0= ruleImport ) ) )+ ) )
            	    // InternalTgfi.g:86:4: {...}? => ( ({...}? => ( (lv_importEl_1_0= ruleImport ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTgfiAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleTgfi", "getUnorderedGroupHelper().canSelect(grammarAccess.getTgfiAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalTgfi.g:86:98: ( ({...}? => ( (lv_importEl_1_0= ruleImport ) ) )+ )
            	    // InternalTgfi.g:87:5: ({...}? => ( (lv_importEl_1_0= ruleImport ) ) )+
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getTgfiAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalTgfi.g:90:8: ({...}? => ( (lv_importEl_1_0= ruleImport ) ) )+
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
            	    	    // InternalTgfi.g:90:9: {...}? => ( (lv_importEl_1_0= ruleImport ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleTgfi", "true");
            	    	    }
            	    	    // InternalTgfi.g:90:18: ( (lv_importEl_1_0= ruleImport ) )
            	    	    // InternalTgfi.g:90:19: (lv_importEl_1_0= ruleImport )
            	    	    {
            	    	    // InternalTgfi.g:90:19: (lv_importEl_1_0= ruleImport )
            	    	    // InternalTgfi.g:91:9: lv_importEl_1_0= ruleImport
            	    	    {

            	    	    									newCompositeNode(grammarAccess.getTgfiAccess().getImportElImportParserRuleCall_0_0());
            	    	    								
            	    	    pushFollow(FOLLOW_3);
            	    	    lv_importEl_1_0=ruleImport();

            	    	    state._fsp--;


            	    	    									if (current==null) {
            	    	    										current = createModelElementForParent(grammarAccess.getTgfiRule());
            	    	    									}
            	    	    									add(
            	    	    										current,
            	    	    										"importEl",
            	    	    										lv_importEl_1_0,
            	    	    										"com.spirit.xtext.architecture.Tgfi.Import");
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

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTgfiAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalTgfi.g:113:3: ({...}? => ( ({...}? => ( (lv_main_2_0= ruleMainTgf ) ) ) ) )
            	    {
            	    // InternalTgfi.g:113:3: ({...}? => ( ({...}? => ( (lv_main_2_0= ruleMainTgf ) ) ) ) )
            	    // InternalTgfi.g:114:4: {...}? => ( ({...}? => ( (lv_main_2_0= ruleMainTgf ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTgfiAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleTgfi", "getUnorderedGroupHelper().canSelect(grammarAccess.getTgfiAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalTgfi.g:114:98: ( ({...}? => ( (lv_main_2_0= ruleMainTgf ) ) ) )
            	    // InternalTgfi.g:115:5: ({...}? => ( (lv_main_2_0= ruleMainTgf ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getTgfiAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalTgfi.g:118:8: ({...}? => ( (lv_main_2_0= ruleMainTgf ) ) )
            	    // InternalTgfi.g:118:9: {...}? => ( (lv_main_2_0= ruleMainTgf ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTgfi", "true");
            	    }
            	    // InternalTgfi.g:118:18: ( (lv_main_2_0= ruleMainTgf ) )
            	    // InternalTgfi.g:118:19: (lv_main_2_0= ruleMainTgf )
            	    {
            	    // InternalTgfi.g:118:19: (lv_main_2_0= ruleMainTgf )
            	    // InternalTgfi.g:119:9: lv_main_2_0= ruleMainTgf
            	    {

            	    									newCompositeNode(grammarAccess.getTgfiAccess().getMainMainTgfParserRuleCall_1_0());
            	    								
            	    pushFollow(FOLLOW_3);
            	    lv_main_2_0=ruleMainTgf();

            	    state._fsp--;


            	    									if (current==null) {
            	    										current = createModelElementForParent(grammarAccess.getTgfiRule());
            	    									}
            	    									set(
            	    										current,
            	    										"main",
            	    										lv_main_2_0,
            	    										"com.spirit.xtext.architecture.Tgfi.MainTgf");
            	    									afterParserOrEnumRuleCall();
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTgfiAccess().getUnorderedGroup());
            	    				

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

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getTgfiAccess().getUnorderedGroup());
            			

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
    // $ANTLR end "ruleTgfi"


    // $ANTLR start "entryRuleImport"
    // InternalTgfi.g:151:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalTgfi.g:151:47: (iv_ruleImport= ruleImport EOF )
            // InternalTgfi.g:152:2: iv_ruleImport= ruleImport EOF
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
    // InternalTgfi.g:158:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;


        	enterRule();

        try {
            // InternalTgfi.g:164:2: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // InternalTgfi.g:165:2: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // InternalTgfi.g:165:2: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            // InternalTgfi.g:166:3: otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalTgfi.g:170:3: ( (lv_importURI_1_0= RULE_STRING ) )
            // InternalTgfi.g:171:4: (lv_importURI_1_0= RULE_STRING )
            {
            // InternalTgfi.g:171:4: (lv_importURI_1_0= RULE_STRING )
            // InternalTgfi.g:172:5: lv_importURI_1_0= RULE_STRING
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
    // InternalTgfi.g:192:1: entryRuleMainTgf returns [EObject current=null] : iv_ruleMainTgf= ruleMainTgf EOF ;
    public final EObject entryRuleMainTgf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMainTgf = null;


        try {
            // InternalTgfi.g:192:48: (iv_ruleMainTgf= ruleMainTgf EOF )
            // InternalTgfi.g:193:2: iv_ruleMainTgf= ruleMainTgf EOF
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
    // InternalTgfi.g:199:1: ruleMainTgf returns [EObject current=null] : (otherlv_0= 'ArchitecturalElement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'JavaPackage' otherlv_4= ':' ( (lv_genPackage_5_0= RULE_STRING ) ) )? (otherlv_6= 'Name' otherlv_7= ':' ( (lv_satName_8_0= RULE_STRING ) ) )? (otherlv_9= 'Version' otherlv_10= ':' ( (lv_versionName_11_0= RULE_STRING ) ) )? (otherlv_12= 'Status' otherlv_13= ':' ( (lv_statusName_14_0= RULE_STRING ) ) )? (otherlv_15= 'Objective' otherlv_16= ':' ( (lv_objectiveName_17_0= RULE_STRING ) ) )? (otherlv_18= 'HL_Function' otherlv_19= ':' ( (lv_hlfunctionName_20_0= RULE_STRING ) ) )? (otherlv_21= 'Rules:' otherlv_22= '{' ( (lv_rules_23_0= ruleRule ) )* otherlv_24= '}' )* ( (lv_prof_25_0= ruleProfile ) )+ otherlv_26= '}' ) ;
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
            // InternalTgfi.g:205:2: ( (otherlv_0= 'ArchitecturalElement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'JavaPackage' otherlv_4= ':' ( (lv_genPackage_5_0= RULE_STRING ) ) )? (otherlv_6= 'Name' otherlv_7= ':' ( (lv_satName_8_0= RULE_STRING ) ) )? (otherlv_9= 'Version' otherlv_10= ':' ( (lv_versionName_11_0= RULE_STRING ) ) )? (otherlv_12= 'Status' otherlv_13= ':' ( (lv_statusName_14_0= RULE_STRING ) ) )? (otherlv_15= 'Objective' otherlv_16= ':' ( (lv_objectiveName_17_0= RULE_STRING ) ) )? (otherlv_18= 'HL_Function' otherlv_19= ':' ( (lv_hlfunctionName_20_0= RULE_STRING ) ) )? (otherlv_21= 'Rules:' otherlv_22= '{' ( (lv_rules_23_0= ruleRule ) )* otherlv_24= '}' )* ( (lv_prof_25_0= ruleProfile ) )+ otherlv_26= '}' ) )
            // InternalTgfi.g:206:2: (otherlv_0= 'ArchitecturalElement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'JavaPackage' otherlv_4= ':' ( (lv_genPackage_5_0= RULE_STRING ) ) )? (otherlv_6= 'Name' otherlv_7= ':' ( (lv_satName_8_0= RULE_STRING ) ) )? (otherlv_9= 'Version' otherlv_10= ':' ( (lv_versionName_11_0= RULE_STRING ) ) )? (otherlv_12= 'Status' otherlv_13= ':' ( (lv_statusName_14_0= RULE_STRING ) ) )? (otherlv_15= 'Objective' otherlv_16= ':' ( (lv_objectiveName_17_0= RULE_STRING ) ) )? (otherlv_18= 'HL_Function' otherlv_19= ':' ( (lv_hlfunctionName_20_0= RULE_STRING ) ) )? (otherlv_21= 'Rules:' otherlv_22= '{' ( (lv_rules_23_0= ruleRule ) )* otherlv_24= '}' )* ( (lv_prof_25_0= ruleProfile ) )+ otherlv_26= '}' )
            {
            // InternalTgfi.g:206:2: (otherlv_0= 'ArchitecturalElement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'JavaPackage' otherlv_4= ':' ( (lv_genPackage_5_0= RULE_STRING ) ) )? (otherlv_6= 'Name' otherlv_7= ':' ( (lv_satName_8_0= RULE_STRING ) ) )? (otherlv_9= 'Version' otherlv_10= ':' ( (lv_versionName_11_0= RULE_STRING ) ) )? (otherlv_12= 'Status' otherlv_13= ':' ( (lv_statusName_14_0= RULE_STRING ) ) )? (otherlv_15= 'Objective' otherlv_16= ':' ( (lv_objectiveName_17_0= RULE_STRING ) ) )? (otherlv_18= 'HL_Function' otherlv_19= ':' ( (lv_hlfunctionName_20_0= RULE_STRING ) ) )? (otherlv_21= 'Rules:' otherlv_22= '{' ( (lv_rules_23_0= ruleRule ) )* otherlv_24= '}' )* ( (lv_prof_25_0= ruleProfile ) )+ otherlv_26= '}' )
            // InternalTgfi.g:207:3: otherlv_0= 'ArchitecturalElement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'JavaPackage' otherlv_4= ':' ( (lv_genPackage_5_0= RULE_STRING ) ) )? (otherlv_6= 'Name' otherlv_7= ':' ( (lv_satName_8_0= RULE_STRING ) ) )? (otherlv_9= 'Version' otherlv_10= ':' ( (lv_versionName_11_0= RULE_STRING ) ) )? (otherlv_12= 'Status' otherlv_13= ':' ( (lv_statusName_14_0= RULE_STRING ) ) )? (otherlv_15= 'Objective' otherlv_16= ':' ( (lv_objectiveName_17_0= RULE_STRING ) ) )? (otherlv_18= 'HL_Function' otherlv_19= ':' ( (lv_hlfunctionName_20_0= RULE_STRING ) ) )? (otherlv_21= 'Rules:' otherlv_22= '{' ( (lv_rules_23_0= ruleRule ) )* otherlv_24= '}' )* ( (lv_prof_25_0= ruleProfile ) )+ otherlv_26= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getMainTgfAccess().getArchitecturalElementKeyword_0());
            		
            // InternalTgfi.g:211:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTgfi.g:212:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTgfi.g:212:4: (lv_name_1_0= RULE_ID )
            // InternalTgfi.g:213:5: lv_name_1_0= RULE_ID
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
            		
            // InternalTgfi.g:233:3: (otherlv_3= 'JavaPackage' otherlv_4= ':' ( (lv_genPackage_5_0= RULE_STRING ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalTgfi.g:234:4: otherlv_3= 'JavaPackage' otherlv_4= ':' ( (lv_genPackage_5_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getMainTgfAccess().getJavaPackageKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getMainTgfAccess().getColonKeyword_3_1());
                    			
                    // InternalTgfi.g:242:4: ( (lv_genPackage_5_0= RULE_STRING ) )
                    // InternalTgfi.g:243:5: (lv_genPackage_5_0= RULE_STRING )
                    {
                    // InternalTgfi.g:243:5: (lv_genPackage_5_0= RULE_STRING )
                    // InternalTgfi.g:244:6: lv_genPackage_5_0= RULE_STRING
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

            // InternalTgfi.g:261:3: (otherlv_6= 'Name' otherlv_7= ':' ( (lv_satName_8_0= RULE_STRING ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalTgfi.g:262:4: otherlv_6= 'Name' otherlv_7= ':' ( (lv_satName_8_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_6, grammarAccess.getMainTgfAccess().getNameKeyword_4_0());
                    			
                    otherlv_7=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getMainTgfAccess().getColonKeyword_4_1());
                    			
                    // InternalTgfi.g:270:4: ( (lv_satName_8_0= RULE_STRING ) )
                    // InternalTgfi.g:271:5: (lv_satName_8_0= RULE_STRING )
                    {
                    // InternalTgfi.g:271:5: (lv_satName_8_0= RULE_STRING )
                    // InternalTgfi.g:272:6: lv_satName_8_0= RULE_STRING
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

            // InternalTgfi.g:289:3: (otherlv_9= 'Version' otherlv_10= ':' ( (lv_versionName_11_0= RULE_STRING ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalTgfi.g:290:4: otherlv_9= 'Version' otherlv_10= ':' ( (lv_versionName_11_0= RULE_STRING ) )
                    {
                    otherlv_9=(Token)match(input,17,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getMainTgfAccess().getVersionKeyword_5_0());
                    			
                    otherlv_10=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getMainTgfAccess().getColonKeyword_5_1());
                    			
                    // InternalTgfi.g:298:4: ( (lv_versionName_11_0= RULE_STRING ) )
                    // InternalTgfi.g:299:5: (lv_versionName_11_0= RULE_STRING )
                    {
                    // InternalTgfi.g:299:5: (lv_versionName_11_0= RULE_STRING )
                    // InternalTgfi.g:300:6: lv_versionName_11_0= RULE_STRING
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

            // InternalTgfi.g:317:3: (otherlv_12= 'Status' otherlv_13= ':' ( (lv_statusName_14_0= RULE_STRING ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalTgfi.g:318:4: otherlv_12= 'Status' otherlv_13= ':' ( (lv_statusName_14_0= RULE_STRING ) )
                    {
                    otherlv_12=(Token)match(input,18,FOLLOW_8); 

                    				newLeafNode(otherlv_12, grammarAccess.getMainTgfAccess().getStatusKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_13, grammarAccess.getMainTgfAccess().getColonKeyword_6_1());
                    			
                    // InternalTgfi.g:326:4: ( (lv_statusName_14_0= RULE_STRING ) )
                    // InternalTgfi.g:327:5: (lv_statusName_14_0= RULE_STRING )
                    {
                    // InternalTgfi.g:327:5: (lv_statusName_14_0= RULE_STRING )
                    // InternalTgfi.g:328:6: lv_statusName_14_0= RULE_STRING
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

            // InternalTgfi.g:345:3: (otherlv_15= 'Objective' otherlv_16= ':' ( (lv_objectiveName_17_0= RULE_STRING ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalTgfi.g:346:4: otherlv_15= 'Objective' otherlv_16= ':' ( (lv_objectiveName_17_0= RULE_STRING ) )
                    {
                    otherlv_15=(Token)match(input,19,FOLLOW_8); 

                    				newLeafNode(otherlv_15, grammarAccess.getMainTgfAccess().getObjectiveKeyword_7_0());
                    			
                    otherlv_16=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_16, grammarAccess.getMainTgfAccess().getColonKeyword_7_1());
                    			
                    // InternalTgfi.g:354:4: ( (lv_objectiveName_17_0= RULE_STRING ) )
                    // InternalTgfi.g:355:5: (lv_objectiveName_17_0= RULE_STRING )
                    {
                    // InternalTgfi.g:355:5: (lv_objectiveName_17_0= RULE_STRING )
                    // InternalTgfi.g:356:6: lv_objectiveName_17_0= RULE_STRING
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

            // InternalTgfi.g:373:3: (otherlv_18= 'HL_Function' otherlv_19= ':' ( (lv_hlfunctionName_20_0= RULE_STRING ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalTgfi.g:374:4: otherlv_18= 'HL_Function' otherlv_19= ':' ( (lv_hlfunctionName_20_0= RULE_STRING ) )
                    {
                    otherlv_18=(Token)match(input,20,FOLLOW_8); 

                    				newLeafNode(otherlv_18, grammarAccess.getMainTgfAccess().getHL_FunctionKeyword_8_0());
                    			
                    otherlv_19=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_19, grammarAccess.getMainTgfAccess().getColonKeyword_8_1());
                    			
                    // InternalTgfi.g:382:4: ( (lv_hlfunctionName_20_0= RULE_STRING ) )
                    // InternalTgfi.g:383:5: (lv_hlfunctionName_20_0= RULE_STRING )
                    {
                    // InternalTgfi.g:383:5: (lv_hlfunctionName_20_0= RULE_STRING )
                    // InternalTgfi.g:384:6: lv_hlfunctionName_20_0= RULE_STRING
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

            // InternalTgfi.g:401:3: (otherlv_21= 'Rules:' otherlv_22= '{' ( (lv_rules_23_0= ruleRule ) )* otherlv_24= '}' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==21) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalTgfi.g:402:4: otherlv_21= 'Rules:' otherlv_22= '{' ( (lv_rules_23_0= ruleRule ) )* otherlv_24= '}'
            	    {
            	    otherlv_21=(Token)match(input,21,FOLLOW_6); 

            	    				newLeafNode(otherlv_21, grammarAccess.getMainTgfAccess().getRulesKeyword_9_0());
            	    			
            	    otherlv_22=(Token)match(input,13,FOLLOW_9); 

            	    				newLeafNode(otherlv_22, grammarAccess.getMainTgfAccess().getLeftCurlyBracketKeyword_9_1());
            	    			
            	    // InternalTgfi.g:410:4: ( (lv_rules_23_0= ruleRule ) )*
            	    loop9:
            	    do {
            	        int alt9=2;
            	        int LA9_0 = input.LA(1);

            	        if ( (LA9_0==RULE_ID) ) {
            	            alt9=1;
            	        }


            	        switch (alt9) {
            	    	case 1 :
            	    	    // InternalTgfi.g:411:5: (lv_rules_23_0= ruleRule )
            	    	    {
            	    	    // InternalTgfi.g:411:5: (lv_rules_23_0= ruleRule )
            	    	    // InternalTgfi.g:412:6: lv_rules_23_0= ruleRule
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
            	    	    							"com.spirit.xtext.architecture.Tgfi.Rule");
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

            // InternalTgfi.g:434:3: ( (lv_prof_25_0= ruleProfile ) )+
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
            	    // InternalTgfi.g:435:4: (lv_prof_25_0= ruleProfile )
            	    {
            	    // InternalTgfi.g:435:4: (lv_prof_25_0= ruleProfile )
            	    // InternalTgfi.g:436:5: lv_prof_25_0= ruleProfile
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
            	    						"com.spirit.xtext.architecture.Tgfi.Profile");
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
    // InternalTgfi.g:461:1: entryRuleProfile returns [EObject current=null] : iv_ruleProfile= ruleProfile EOF ;
    public final EObject entryRuleProfile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProfile = null;


        try {
            // InternalTgfi.g:461:48: (iv_ruleProfile= ruleProfile EOF )
            // InternalTgfi.g:462:2: iv_ruleProfile= ruleProfile EOF
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
    // InternalTgfi.g:468:1: ruleProfile returns [EObject current=null] : (otherlv_0= 'Profile' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' otherlv_4= ':' ( (lv_profName_5_0= RULE_STRING ) ) )? (otherlv_6= 'Description' otherlv_7= ':' ( (lv_descrName_8_0= RULE_STRING ) ) )? (otherlv_9= 'Features' otherlv_10= ':' ( (lv_featName_11_0= RULE_STRING ) ) )? (otherlv_12= 'Function' otherlv_13= ':' ( (lv_functionName_14_0= RULE_STRING ) ) )? otherlv_15= 'actors:' ( (lv_actor_16_0= ruleActor ) )+ otherlv_17= 'transactions:' ( (lv_transaction_18_0= ruleTransaction ) )* otherlv_19= 'domains:' ( (lv_domain_20_0= ruleDomain ) )* otherlv_21= 'quality_attributes:' ( (lv_qualityattr_22_0= ruleQualityAttr ) )* otherlv_23= 'quality_securityrequirements:' ( (lv_secre_24_0= ruleSecRequirements ) )* otherlv_25= '}' ) ;
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
            // InternalTgfi.g:474:2: ( (otherlv_0= 'Profile' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' otherlv_4= ':' ( (lv_profName_5_0= RULE_STRING ) ) )? (otherlv_6= 'Description' otherlv_7= ':' ( (lv_descrName_8_0= RULE_STRING ) ) )? (otherlv_9= 'Features' otherlv_10= ':' ( (lv_featName_11_0= RULE_STRING ) ) )? (otherlv_12= 'Function' otherlv_13= ':' ( (lv_functionName_14_0= RULE_STRING ) ) )? otherlv_15= 'actors:' ( (lv_actor_16_0= ruleActor ) )+ otherlv_17= 'transactions:' ( (lv_transaction_18_0= ruleTransaction ) )* otherlv_19= 'domains:' ( (lv_domain_20_0= ruleDomain ) )* otherlv_21= 'quality_attributes:' ( (lv_qualityattr_22_0= ruleQualityAttr ) )* otherlv_23= 'quality_securityrequirements:' ( (lv_secre_24_0= ruleSecRequirements ) )* otherlv_25= '}' ) )
            // InternalTgfi.g:475:2: (otherlv_0= 'Profile' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' otherlv_4= ':' ( (lv_profName_5_0= RULE_STRING ) ) )? (otherlv_6= 'Description' otherlv_7= ':' ( (lv_descrName_8_0= RULE_STRING ) ) )? (otherlv_9= 'Features' otherlv_10= ':' ( (lv_featName_11_0= RULE_STRING ) ) )? (otherlv_12= 'Function' otherlv_13= ':' ( (lv_functionName_14_0= RULE_STRING ) ) )? otherlv_15= 'actors:' ( (lv_actor_16_0= ruleActor ) )+ otherlv_17= 'transactions:' ( (lv_transaction_18_0= ruleTransaction ) )* otherlv_19= 'domains:' ( (lv_domain_20_0= ruleDomain ) )* otherlv_21= 'quality_attributes:' ( (lv_qualityattr_22_0= ruleQualityAttr ) )* otherlv_23= 'quality_securityrequirements:' ( (lv_secre_24_0= ruleSecRequirements ) )* otherlv_25= '}' )
            {
            // InternalTgfi.g:475:2: (otherlv_0= 'Profile' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' otherlv_4= ':' ( (lv_profName_5_0= RULE_STRING ) ) )? (otherlv_6= 'Description' otherlv_7= ':' ( (lv_descrName_8_0= RULE_STRING ) ) )? (otherlv_9= 'Features' otherlv_10= ':' ( (lv_featName_11_0= RULE_STRING ) ) )? (otherlv_12= 'Function' otherlv_13= ':' ( (lv_functionName_14_0= RULE_STRING ) ) )? otherlv_15= 'actors:' ( (lv_actor_16_0= ruleActor ) )+ otherlv_17= 'transactions:' ( (lv_transaction_18_0= ruleTransaction ) )* otherlv_19= 'domains:' ( (lv_domain_20_0= ruleDomain ) )* otherlv_21= 'quality_attributes:' ( (lv_qualityattr_22_0= ruleQualityAttr ) )* otherlv_23= 'quality_securityrequirements:' ( (lv_secre_24_0= ruleSecRequirements ) )* otherlv_25= '}' )
            // InternalTgfi.g:476:3: otherlv_0= 'Profile' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' otherlv_4= ':' ( (lv_profName_5_0= RULE_STRING ) ) )? (otherlv_6= 'Description' otherlv_7= ':' ( (lv_descrName_8_0= RULE_STRING ) ) )? (otherlv_9= 'Features' otherlv_10= ':' ( (lv_featName_11_0= RULE_STRING ) ) )? (otherlv_12= 'Function' otherlv_13= ':' ( (lv_functionName_14_0= RULE_STRING ) ) )? otherlv_15= 'actors:' ( (lv_actor_16_0= ruleActor ) )+ otherlv_17= 'transactions:' ( (lv_transaction_18_0= ruleTransaction ) )* otherlv_19= 'domains:' ( (lv_domain_20_0= ruleDomain ) )* otherlv_21= 'quality_attributes:' ( (lv_qualityattr_22_0= ruleQualityAttr ) )* otherlv_23= 'quality_securityrequirements:' ( (lv_secre_24_0= ruleSecRequirements ) )* otherlv_25= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getProfileAccess().getProfileKeyword_0());
            		
            // InternalTgfi.g:480:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTgfi.g:481:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTgfi.g:481:4: (lv_name_1_0= RULE_ID )
            // InternalTgfi.g:482:5: lv_name_1_0= RULE_ID
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
            		
            // InternalTgfi.g:502:3: (otherlv_3= 'Name' otherlv_4= ':' ( (lv_profName_5_0= RULE_STRING ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==16) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalTgfi.g:503:4: otherlv_3= 'Name' otherlv_4= ':' ( (lv_profName_5_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getProfileAccess().getNameKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getProfileAccess().getColonKeyword_3_1());
                    			
                    // InternalTgfi.g:511:4: ( (lv_profName_5_0= RULE_STRING ) )
                    // InternalTgfi.g:512:5: (lv_profName_5_0= RULE_STRING )
                    {
                    // InternalTgfi.g:512:5: (lv_profName_5_0= RULE_STRING )
                    // InternalTgfi.g:513:6: lv_profName_5_0= RULE_STRING
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

            // InternalTgfi.g:530:3: (otherlv_6= 'Description' otherlv_7= ':' ( (lv_descrName_8_0= RULE_STRING ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalTgfi.g:531:4: otherlv_6= 'Description' otherlv_7= ':' ( (lv_descrName_8_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,24,FOLLOW_8); 

                    				newLeafNode(otherlv_6, grammarAccess.getProfileAccess().getDescriptionKeyword_4_0());
                    			
                    otherlv_7=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getProfileAccess().getColonKeyword_4_1());
                    			
                    // InternalTgfi.g:539:4: ( (lv_descrName_8_0= RULE_STRING ) )
                    // InternalTgfi.g:540:5: (lv_descrName_8_0= RULE_STRING )
                    {
                    // InternalTgfi.g:540:5: (lv_descrName_8_0= RULE_STRING )
                    // InternalTgfi.g:541:6: lv_descrName_8_0= RULE_STRING
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

            // InternalTgfi.g:558:3: (otherlv_9= 'Features' otherlv_10= ':' ( (lv_featName_11_0= RULE_STRING ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==25) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalTgfi.g:559:4: otherlv_9= 'Features' otherlv_10= ':' ( (lv_featName_11_0= RULE_STRING ) )
                    {
                    otherlv_9=(Token)match(input,25,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getProfileAccess().getFeaturesKeyword_5_0());
                    			
                    otherlv_10=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getProfileAccess().getColonKeyword_5_1());
                    			
                    // InternalTgfi.g:567:4: ( (lv_featName_11_0= RULE_STRING ) )
                    // InternalTgfi.g:568:5: (lv_featName_11_0= RULE_STRING )
                    {
                    // InternalTgfi.g:568:5: (lv_featName_11_0= RULE_STRING )
                    // InternalTgfi.g:569:6: lv_featName_11_0= RULE_STRING
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

            // InternalTgfi.g:586:3: (otherlv_12= 'Function' otherlv_13= ':' ( (lv_functionName_14_0= RULE_STRING ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==26) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalTgfi.g:587:4: otherlv_12= 'Function' otherlv_13= ':' ( (lv_functionName_14_0= RULE_STRING ) )
                    {
                    otherlv_12=(Token)match(input,26,FOLLOW_8); 

                    				newLeafNode(otherlv_12, grammarAccess.getProfileAccess().getFunctionKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_13, grammarAccess.getProfileAccess().getColonKeyword_6_1());
                    			
                    // InternalTgfi.g:595:4: ( (lv_functionName_14_0= RULE_STRING ) )
                    // InternalTgfi.g:596:5: (lv_functionName_14_0= RULE_STRING )
                    {
                    // InternalTgfi.g:596:5: (lv_functionName_14_0= RULE_STRING )
                    // InternalTgfi.g:597:6: lv_functionName_14_0= RULE_STRING
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
            		
            // InternalTgfi.g:618:3: ( (lv_actor_16_0= ruleActor ) )+
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
            	    // InternalTgfi.g:619:4: (lv_actor_16_0= ruleActor )
            	    {
            	    // InternalTgfi.g:619:4: (lv_actor_16_0= ruleActor )
            	    // InternalTgfi.g:620:5: lv_actor_16_0= ruleActor
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
            	    						"com.spirit.xtext.architecture.Tgfi.Actor");
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
            		
            // InternalTgfi.g:641:3: ( (lv_transaction_18_0= ruleTransaction ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==38) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalTgfi.g:642:4: (lv_transaction_18_0= ruleTransaction )
            	    {
            	    // InternalTgfi.g:642:4: (lv_transaction_18_0= ruleTransaction )
            	    // InternalTgfi.g:643:5: lv_transaction_18_0= ruleTransaction
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
            	    						"com.spirit.xtext.architecture.Tgfi.Transaction");
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
            		
            // InternalTgfi.g:664:3: ( (lv_domain_20_0= ruleDomain ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_STRING) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalTgfi.g:665:4: (lv_domain_20_0= ruleDomain )
            	    {
            	    // InternalTgfi.g:665:4: (lv_domain_20_0= ruleDomain )
            	    // InternalTgfi.g:666:5: lv_domain_20_0= ruleDomain
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
            	    						"com.spirit.xtext.architecture.Tgfi.Domain");
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
            		
            // InternalTgfi.g:687:3: ( (lv_qualityattr_22_0= ruleQualityAttr ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalTgfi.g:688:4: (lv_qualityattr_22_0= ruleQualityAttr )
            	    {
            	    // InternalTgfi.g:688:4: (lv_qualityattr_22_0= ruleQualityAttr )
            	    // InternalTgfi.g:689:5: lv_qualityattr_22_0= ruleQualityAttr
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
            	    						"com.spirit.xtext.architecture.Tgfi.QualityAttr");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            otherlv_23=(Token)match(input,31,FOLLOW_20); 

            			newLeafNode(otherlv_23, grammarAccess.getProfileAccess().getQuality_securityrequirementsKeyword_15());
            		
            // InternalTgfi.g:710:3: ( (lv_secre_24_0= ruleSecRequirements ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==13) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalTgfi.g:711:4: (lv_secre_24_0= ruleSecRequirements )
            	    {
            	    // InternalTgfi.g:711:4: (lv_secre_24_0= ruleSecRequirements )
            	    // InternalTgfi.g:712:5: lv_secre_24_0= ruleSecRequirements
            	    {

            	    					newCompositeNode(grammarAccess.getProfileAccess().getSecreSecRequirementsParserRuleCall_16_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_secre_24_0=ruleSecRequirements();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProfileRule());
            	    					}
            	    					add(
            	    						current,
            	    						"secre",
            	    						lv_secre_24_0,
            	    						"com.spirit.xtext.architecture.Tgfi.SecRequirements");
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
    // InternalTgfi.g:737:1: entryRuleSecRequirements returns [EObject current=null] : iv_ruleSecRequirements= ruleSecRequirements EOF ;
    public final EObject entryRuleSecRequirements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSecRequirements = null;


        try {
            // InternalTgfi.g:737:56: (iv_ruleSecRequirements= ruleSecRequirements EOF )
            // InternalTgfi.g:738:2: iv_ruleSecRequirements= ruleSecRequirements EOF
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
    // InternalTgfi.g:744:1: ruleSecRequirements returns [EObject current=null] : (otherlv_0= '{' (otherlv_1= 'Goal' otherlv_2= ':' ( (lv_secreGoal_3_0= RULE_STRING ) ) )? (otherlv_4= 'Level' otherlv_5= ':' ( (lv_secreLevel_6_0= RULE_STRING ) ) )? (otherlv_7= 'Location' otherlv_8= ':' ( (lv_secreLocation_9_0= RULE_STRING ) ) )? (otherlv_10= 'State' otherlv_11= ':' ( (lv_secreState_12_0= RULE_STRING ) ) )? (otherlv_13= 'Descr' otherlv_14= ':' ( (lv_secreDescr_15_0= RULE_STRING ) ) )? (otherlv_16= 'Category' otherlv_17= ':' ( (lv_secreCategory_18_0= RULE_STRING ) ) )? otherlv_19= '}' ) ;
    public final EObject ruleSecRequirements() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_secreGoal_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_secreLevel_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_secreLocation_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_secreState_12_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token lv_secreDescr_15_0=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token lv_secreCategory_18_0=null;
        Token otherlv_19=null;


        	enterRule();

        try {
            // InternalTgfi.g:750:2: ( (otherlv_0= '{' (otherlv_1= 'Goal' otherlv_2= ':' ( (lv_secreGoal_3_0= RULE_STRING ) ) )? (otherlv_4= 'Level' otherlv_5= ':' ( (lv_secreLevel_6_0= RULE_STRING ) ) )? (otherlv_7= 'Location' otherlv_8= ':' ( (lv_secreLocation_9_0= RULE_STRING ) ) )? (otherlv_10= 'State' otherlv_11= ':' ( (lv_secreState_12_0= RULE_STRING ) ) )? (otherlv_13= 'Descr' otherlv_14= ':' ( (lv_secreDescr_15_0= RULE_STRING ) ) )? (otherlv_16= 'Category' otherlv_17= ':' ( (lv_secreCategory_18_0= RULE_STRING ) ) )? otherlv_19= '}' ) )
            // InternalTgfi.g:751:2: (otherlv_0= '{' (otherlv_1= 'Goal' otherlv_2= ':' ( (lv_secreGoal_3_0= RULE_STRING ) ) )? (otherlv_4= 'Level' otherlv_5= ':' ( (lv_secreLevel_6_0= RULE_STRING ) ) )? (otherlv_7= 'Location' otherlv_8= ':' ( (lv_secreLocation_9_0= RULE_STRING ) ) )? (otherlv_10= 'State' otherlv_11= ':' ( (lv_secreState_12_0= RULE_STRING ) ) )? (otherlv_13= 'Descr' otherlv_14= ':' ( (lv_secreDescr_15_0= RULE_STRING ) ) )? (otherlv_16= 'Category' otherlv_17= ':' ( (lv_secreCategory_18_0= RULE_STRING ) ) )? otherlv_19= '}' )
            {
            // InternalTgfi.g:751:2: (otherlv_0= '{' (otherlv_1= 'Goal' otherlv_2= ':' ( (lv_secreGoal_3_0= RULE_STRING ) ) )? (otherlv_4= 'Level' otherlv_5= ':' ( (lv_secreLevel_6_0= RULE_STRING ) ) )? (otherlv_7= 'Location' otherlv_8= ':' ( (lv_secreLocation_9_0= RULE_STRING ) ) )? (otherlv_10= 'State' otherlv_11= ':' ( (lv_secreState_12_0= RULE_STRING ) ) )? (otherlv_13= 'Descr' otherlv_14= ':' ( (lv_secreDescr_15_0= RULE_STRING ) ) )? (otherlv_16= 'Category' otherlv_17= ':' ( (lv_secreCategory_18_0= RULE_STRING ) ) )? otherlv_19= '}' )
            // InternalTgfi.g:752:3: otherlv_0= '{' (otherlv_1= 'Goal' otherlv_2= ':' ( (lv_secreGoal_3_0= RULE_STRING ) ) )? (otherlv_4= 'Level' otherlv_5= ':' ( (lv_secreLevel_6_0= RULE_STRING ) ) )? (otherlv_7= 'Location' otherlv_8= ':' ( (lv_secreLocation_9_0= RULE_STRING ) ) )? (otherlv_10= 'State' otherlv_11= ':' ( (lv_secreState_12_0= RULE_STRING ) ) )? (otherlv_13= 'Descr' otherlv_14= ':' ( (lv_secreDescr_15_0= RULE_STRING ) ) )? (otherlv_16= 'Category' otherlv_17= ':' ( (lv_secreCategory_18_0= RULE_STRING ) ) )? otherlv_19= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getSecRequirementsAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalTgfi.g:756:3: (otherlv_1= 'Goal' otherlv_2= ':' ( (lv_secreGoal_3_0= RULE_STRING ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==32) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalTgfi.g:757:4: otherlv_1= 'Goal' otherlv_2= ':' ( (lv_secreGoal_3_0= RULE_STRING ) )
                    {
                    otherlv_1=(Token)match(input,32,FOLLOW_8); 

                    				newLeafNode(otherlv_1, grammarAccess.getSecRequirementsAccess().getGoalKeyword_1_0());
                    			
                    otherlv_2=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getSecRequirementsAccess().getColonKeyword_1_1());
                    			
                    // InternalTgfi.g:765:4: ( (lv_secreGoal_3_0= RULE_STRING ) )
                    // InternalTgfi.g:766:5: (lv_secreGoal_3_0= RULE_STRING )
                    {
                    // InternalTgfi.g:766:5: (lv_secreGoal_3_0= RULE_STRING )
                    // InternalTgfi.g:767:6: lv_secreGoal_3_0= RULE_STRING
                    {
                    lv_secreGoal_3_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

                    						newLeafNode(lv_secreGoal_3_0, grammarAccess.getSecRequirementsAccess().getSecreGoalSTRINGTerminalRuleCall_1_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSecRequirementsRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"secreGoal",
                    							lv_secreGoal_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTgfi.g:784:3: (otherlv_4= 'Level' otherlv_5= ':' ( (lv_secreLevel_6_0= RULE_STRING ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==33) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalTgfi.g:785:4: otherlv_4= 'Level' otherlv_5= ':' ( (lv_secreLevel_6_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,33,FOLLOW_8); 

                    				newLeafNode(otherlv_4, grammarAccess.getSecRequirementsAccess().getLevelKeyword_2_0());
                    			
                    otherlv_5=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getSecRequirementsAccess().getColonKeyword_2_1());
                    			
                    // InternalTgfi.g:793:4: ( (lv_secreLevel_6_0= RULE_STRING ) )
                    // InternalTgfi.g:794:5: (lv_secreLevel_6_0= RULE_STRING )
                    {
                    // InternalTgfi.g:794:5: (lv_secreLevel_6_0= RULE_STRING )
                    // InternalTgfi.g:795:6: lv_secreLevel_6_0= RULE_STRING
                    {
                    lv_secreLevel_6_0=(Token)match(input,RULE_STRING,FOLLOW_23); 

                    						newLeafNode(lv_secreLevel_6_0, grammarAccess.getSecRequirementsAccess().getSecreLevelSTRINGTerminalRuleCall_2_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSecRequirementsRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"secreLevel",
                    							lv_secreLevel_6_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTgfi.g:812:3: (otherlv_7= 'Location' otherlv_8= ':' ( (lv_secreLocation_9_0= RULE_STRING ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==34) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalTgfi.g:813:4: otherlv_7= 'Location' otherlv_8= ':' ( (lv_secreLocation_9_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,34,FOLLOW_8); 

                    				newLeafNode(otherlv_7, grammarAccess.getSecRequirementsAccess().getLocationKeyword_3_0());
                    			
                    otherlv_8=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getSecRequirementsAccess().getColonKeyword_3_1());
                    			
                    // InternalTgfi.g:821:4: ( (lv_secreLocation_9_0= RULE_STRING ) )
                    // InternalTgfi.g:822:5: (lv_secreLocation_9_0= RULE_STRING )
                    {
                    // InternalTgfi.g:822:5: (lv_secreLocation_9_0= RULE_STRING )
                    // InternalTgfi.g:823:6: lv_secreLocation_9_0= RULE_STRING
                    {
                    lv_secreLocation_9_0=(Token)match(input,RULE_STRING,FOLLOW_24); 

                    						newLeafNode(lv_secreLocation_9_0, grammarAccess.getSecRequirementsAccess().getSecreLocationSTRINGTerminalRuleCall_3_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSecRequirementsRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"secreLocation",
                    							lv_secreLocation_9_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTgfi.g:840:3: (otherlv_10= 'State' otherlv_11= ':' ( (lv_secreState_12_0= RULE_STRING ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==35) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalTgfi.g:841:4: otherlv_10= 'State' otherlv_11= ':' ( (lv_secreState_12_0= RULE_STRING ) )
                    {
                    otherlv_10=(Token)match(input,35,FOLLOW_8); 

                    				newLeafNode(otherlv_10, grammarAccess.getSecRequirementsAccess().getStateKeyword_4_0());
                    			
                    otherlv_11=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_11, grammarAccess.getSecRequirementsAccess().getColonKeyword_4_1());
                    			
                    // InternalTgfi.g:849:4: ( (lv_secreState_12_0= RULE_STRING ) )
                    // InternalTgfi.g:850:5: (lv_secreState_12_0= RULE_STRING )
                    {
                    // InternalTgfi.g:850:5: (lv_secreState_12_0= RULE_STRING )
                    // InternalTgfi.g:851:6: lv_secreState_12_0= RULE_STRING
                    {
                    lv_secreState_12_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

                    						newLeafNode(lv_secreState_12_0, grammarAccess.getSecRequirementsAccess().getSecreStateSTRINGTerminalRuleCall_4_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSecRequirementsRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"secreState",
                    							lv_secreState_12_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTgfi.g:868:3: (otherlv_13= 'Descr' otherlv_14= ':' ( (lv_secreDescr_15_0= RULE_STRING ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==36) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalTgfi.g:869:4: otherlv_13= 'Descr' otherlv_14= ':' ( (lv_secreDescr_15_0= RULE_STRING ) )
                    {
                    otherlv_13=(Token)match(input,36,FOLLOW_8); 

                    				newLeafNode(otherlv_13, grammarAccess.getSecRequirementsAccess().getDescrKeyword_5_0());
                    			
                    otherlv_14=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_14, grammarAccess.getSecRequirementsAccess().getColonKeyword_5_1());
                    			
                    // InternalTgfi.g:877:4: ( (lv_secreDescr_15_0= RULE_STRING ) )
                    // InternalTgfi.g:878:5: (lv_secreDescr_15_0= RULE_STRING )
                    {
                    // InternalTgfi.g:878:5: (lv_secreDescr_15_0= RULE_STRING )
                    // InternalTgfi.g:879:6: lv_secreDescr_15_0= RULE_STRING
                    {
                    lv_secreDescr_15_0=(Token)match(input,RULE_STRING,FOLLOW_26); 

                    						newLeafNode(lv_secreDescr_15_0, grammarAccess.getSecRequirementsAccess().getSecreDescrSTRINGTerminalRuleCall_5_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSecRequirementsRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"secreDescr",
                    							lv_secreDescr_15_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTgfi.g:896:3: (otherlv_16= 'Category' otherlv_17= ':' ( (lv_secreCategory_18_0= RULE_STRING ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==37) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalTgfi.g:897:4: otherlv_16= 'Category' otherlv_17= ':' ( (lv_secreCategory_18_0= RULE_STRING ) )
                    {
                    otherlv_16=(Token)match(input,37,FOLLOW_8); 

                    				newLeafNode(otherlv_16, grammarAccess.getSecRequirementsAccess().getCategoryKeyword_6_0());
                    			
                    otherlv_17=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_17, grammarAccess.getSecRequirementsAccess().getColonKeyword_6_1());
                    			
                    // InternalTgfi.g:905:4: ( (lv_secreCategory_18_0= RULE_STRING ) )
                    // InternalTgfi.g:906:5: (lv_secreCategory_18_0= RULE_STRING )
                    {
                    // InternalTgfi.g:906:5: (lv_secreCategory_18_0= RULE_STRING )
                    // InternalTgfi.g:907:6: lv_secreCategory_18_0= RULE_STRING
                    {
                    lv_secreCategory_18_0=(Token)match(input,RULE_STRING,FOLLOW_27); 

                    						newLeafNode(lv_secreCategory_18_0, grammarAccess.getSecRequirementsAccess().getSecreCategorySTRINGTerminalRuleCall_6_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSecRequirementsRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"secreCategory",
                    							lv_secreCategory_18_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_19=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getSecRequirementsAccess().getRightCurlyBracketKeyword_7());
            		

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
    // InternalTgfi.g:932:1: entryRuleActor returns [String current=null] : iv_ruleActor= ruleActor EOF ;
    public final String entryRuleActor() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleActor = null;


        try {
            // InternalTgfi.g:932:45: (iv_ruleActor= ruleActor EOF )
            // InternalTgfi.g:933:2: iv_ruleActor= ruleActor EOF
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
    // InternalTgfi.g:939:1: ruleActor returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleActor() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalTgfi.g:945:2: (this_STRING_0= RULE_STRING )
            // InternalTgfi.g:946:2: this_STRING_0= RULE_STRING
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
    // InternalTgfi.g:956:1: entryRuleTransaction returns [String current=null] : iv_ruleTransaction= ruleTransaction EOF ;
    public final String entryRuleTransaction() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTransaction = null;


        try {
            // InternalTgfi.g:956:51: (iv_ruleTransaction= ruleTransaction EOF )
            // InternalTgfi.g:957:2: iv_ruleTransaction= ruleTransaction EOF
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
    // InternalTgfi.g:963:1: ruleTransaction returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '(' this_Actor_1= ruleActor kw= ',' this_STRING_3= RULE_STRING kw= ',' this_Actor_5= ruleActor kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleTransaction() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_STRING_3=null;
        AntlrDatatypeRuleToken this_Actor_1 = null;

        AntlrDatatypeRuleToken this_Actor_5 = null;



        	enterRule();

        try {
            // InternalTgfi.g:969:2: ( (kw= '(' this_Actor_1= ruleActor kw= ',' this_STRING_3= RULE_STRING kw= ',' this_Actor_5= ruleActor kw= ')' ) )
            // InternalTgfi.g:970:2: (kw= '(' this_Actor_1= ruleActor kw= ',' this_STRING_3= RULE_STRING kw= ',' this_Actor_5= ruleActor kw= ')' )
            {
            // InternalTgfi.g:970:2: (kw= '(' this_Actor_1= ruleActor kw= ',' this_STRING_3= RULE_STRING kw= ',' this_Actor_5= ruleActor kw= ')' )
            // InternalTgfi.g:971:3: kw= '(' this_Actor_1= ruleActor kw= ',' this_STRING_3= RULE_STRING kw= ',' this_Actor_5= ruleActor kw= ')'
            {
            kw=(Token)match(input,38,FOLLOW_4); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getTransactionAccess().getLeftParenthesisKeyword_0());
            		

            			newCompositeNode(grammarAccess.getTransactionAccess().getActorParserRuleCall_1());
            		
            pushFollow(FOLLOW_28);
            this_Actor_1=ruleActor();

            state._fsp--;


            			current.merge(this_Actor_1);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,39,FOLLOW_4); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getTransactionAccess().getCommaKeyword_2());
            		
            this_STRING_3=(Token)match(input,RULE_STRING,FOLLOW_28); 

            			current.merge(this_STRING_3);
            		

            			newLeafNode(this_STRING_3, grammarAccess.getTransactionAccess().getSTRINGTerminalRuleCall_3());
            		
            kw=(Token)match(input,39,FOLLOW_4); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getTransactionAccess().getCommaKeyword_4());
            		

            			newCompositeNode(grammarAccess.getTransactionAccess().getActorParserRuleCall_5());
            		
            pushFollow(FOLLOW_29);
            this_Actor_5=ruleActor();

            state._fsp--;


            			current.merge(this_Actor_5);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,40,FOLLOW_2); 

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
    // InternalTgfi.g:1022:1: entryRuleDomain returns [String current=null] : iv_ruleDomain= ruleDomain EOF ;
    public final String entryRuleDomain() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDomain = null;


        try {
            // InternalTgfi.g:1022:46: (iv_ruleDomain= ruleDomain EOF )
            // InternalTgfi.g:1023:2: iv_ruleDomain= ruleDomain EOF
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
    // InternalTgfi.g:1029:1: ruleDomain returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleDomain() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalTgfi.g:1035:2: (this_STRING_0= RULE_STRING )
            // InternalTgfi.g:1036:2: this_STRING_0= RULE_STRING
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
    // InternalTgfi.g:1046:1: entryRuleQualityAttr returns [String current=null] : iv_ruleQualityAttr= ruleQualityAttr EOF ;
    public final String entryRuleQualityAttr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualityAttr = null;


        try {
            // InternalTgfi.g:1046:51: (iv_ruleQualityAttr= ruleQualityAttr EOF )
            // InternalTgfi.g:1047:2: iv_ruleQualityAttr= ruleQualityAttr EOF
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
    // InternalTgfi.g:1053:1: ruleQualityAttr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualityAttrID_0= ruleQualityAttrID kw= '[' this_STRING_2= RULE_STRING kw= ']' ) ;
    public final AntlrDatatypeRuleToken ruleQualityAttr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_STRING_2=null;
        AntlrDatatypeRuleToken this_QualityAttrID_0 = null;



        	enterRule();

        try {
            // InternalTgfi.g:1059:2: ( (this_QualityAttrID_0= ruleQualityAttrID kw= '[' this_STRING_2= RULE_STRING kw= ']' ) )
            // InternalTgfi.g:1060:2: (this_QualityAttrID_0= ruleQualityAttrID kw= '[' this_STRING_2= RULE_STRING kw= ']' )
            {
            // InternalTgfi.g:1060:2: (this_QualityAttrID_0= ruleQualityAttrID kw= '[' this_STRING_2= RULE_STRING kw= ']' )
            // InternalTgfi.g:1061:3: this_QualityAttrID_0= ruleQualityAttrID kw= '[' this_STRING_2= RULE_STRING kw= ']'
            {

            			newCompositeNode(grammarAccess.getQualityAttrAccess().getQualityAttrIDParserRuleCall_0());
            		
            pushFollow(FOLLOW_30);
            this_QualityAttrID_0=ruleQualityAttrID();

            state._fsp--;


            			current.merge(this_QualityAttrID_0);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,41,FOLLOW_4); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getQualityAttrAccess().getLeftSquareBracketKeyword_1());
            		
            this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_31); 

            			current.merge(this_STRING_2);
            		

            			newLeafNode(this_STRING_2, grammarAccess.getQualityAttrAccess().getSTRINGTerminalRuleCall_2());
            		
            kw=(Token)match(input,42,FOLLOW_2); 

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
    // InternalTgfi.g:1092:1: entryRuleQualityAttrID returns [String current=null] : iv_ruleQualityAttrID= ruleQualityAttrID EOF ;
    public final String entryRuleQualityAttrID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualityAttrID = null;


        try {
            // InternalTgfi.g:1092:53: (iv_ruleQualityAttrID= ruleQualityAttrID EOF )
            // InternalTgfi.g:1093:2: iv_ruleQualityAttrID= ruleQualityAttrID EOF
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
    // InternalTgfi.g:1099:1: ruleQualityAttrID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleQualityAttrID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalTgfi.g:1105:2: (this_ID_0= RULE_ID )
            // InternalTgfi.g:1106:2: this_ID_0= RULE_ID
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
    // InternalTgfi.g:1116:1: entryRuleRule returns [String current=null] : iv_ruleRule= ruleRule EOF ;
    public final String entryRuleRule() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRule = null;


        try {
            // InternalTgfi.g:1116:44: (iv_ruleRule= ruleRule EOF )
            // InternalTgfi.g:1117:2: iv_ruleRule= ruleRule EOF
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
    // InternalTgfi.g:1123:1: ruleRule returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_RuleId_0= ruleRuleId kw= ':' this_STRING_2= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleRule() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_STRING_2=null;
        AntlrDatatypeRuleToken this_RuleId_0 = null;



        	enterRule();

        try {
            // InternalTgfi.g:1129:2: ( (this_RuleId_0= ruleRuleId kw= ':' this_STRING_2= RULE_STRING ) )
            // InternalTgfi.g:1130:2: (this_RuleId_0= ruleRuleId kw= ':' this_STRING_2= RULE_STRING )
            {
            // InternalTgfi.g:1130:2: (this_RuleId_0= ruleRuleId kw= ':' this_STRING_2= RULE_STRING )
            // InternalTgfi.g:1131:3: this_RuleId_0= ruleRuleId kw= ':' this_STRING_2= RULE_STRING
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
    // InternalTgfi.g:1157:1: entryRuleRuleId returns [String current=null] : iv_ruleRuleId= ruleRuleId EOF ;
    public final String entryRuleRuleId() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRuleId = null;


        try {
            // InternalTgfi.g:1157:46: (iv_ruleRuleId= ruleRuleId EOF )
            // InternalTgfi.g:1158:2: iv_ruleRuleId= ruleRuleId EOF
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
    // InternalTgfi.g:1164:1: ruleRuleId returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleRuleId() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalTgfi.g:1170:2: (this_ID_0= RULE_ID )
            // InternalTgfi.g:1171:2: this_ID_0= RULE_ID
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
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000004020000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000080000020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000402000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000003F00400000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000003E00400000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000003C00400000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000003800400000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000003000400000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000002000400000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000040000000000L});

}
