package com.spirit.xtext.architecture.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import com.spirit.xtext.architecture.services.TgfiGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalTgfiParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'ArchitecturalElement'", "'{'", "'}'", "'JavaPackage'", "':'", "'Name'", "'Version'", "'Status'", "'Objective'", "'HL_Function'", "'Rules:'", "'Profile'", "'actors:'", "'transactions:'", "'domains:'", "'quality_attributes:'", "'quality_securityrequirements:'", "'Description'", "'Features'", "'Function'", "'Goal'", "'Level'", "'Location'", "'State'", "'Descr'", "'Category'", "'('", "','", "')'", "'['", "']'"
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

    	public void setGrammarAccess(TgfiGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleTgfi"
    // InternalTgfi.g:53:1: entryRuleTgfi : ruleTgfi EOF ;
    public final void entryRuleTgfi() throws RecognitionException {
        try {
            // InternalTgfi.g:54:1: ( ruleTgfi EOF )
            // InternalTgfi.g:55:1: ruleTgfi EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTgfiRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTgfi();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTgfiRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTgfi"


    // $ANTLR start "ruleTgfi"
    // InternalTgfi.g:62:1: ruleTgfi : ( ( rule__Tgfi__UnorderedGroup ) ) ;
    public final void ruleTgfi() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:66:2: ( ( ( rule__Tgfi__UnorderedGroup ) ) )
            // InternalTgfi.g:67:2: ( ( rule__Tgfi__UnorderedGroup ) )
            {
            // InternalTgfi.g:67:2: ( ( rule__Tgfi__UnorderedGroup ) )
            // InternalTgfi.g:68:3: ( rule__Tgfi__UnorderedGroup )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTgfiAccess().getUnorderedGroup()); 
            }
            // InternalTgfi.g:69:3: ( rule__Tgfi__UnorderedGroup )
            // InternalTgfi.g:69:4: rule__Tgfi__UnorderedGroup
            {
            pushFollow(FOLLOW_2);
            rule__Tgfi__UnorderedGroup();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTgfiAccess().getUnorderedGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTgfi"


    // $ANTLR start "entryRuleImport"
    // InternalTgfi.g:78:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalTgfi.g:79:1: ( ruleImport EOF )
            // InternalTgfi.g:80:1: ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalTgfi.g:87:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:91:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalTgfi.g:92:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalTgfi.g:92:2: ( ( rule__Import__Group__0 ) )
            // InternalTgfi.g:93:3: ( rule__Import__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getGroup()); 
            }
            // InternalTgfi.g:94:3: ( rule__Import__Group__0 )
            // InternalTgfi.g:94:4: rule__Import__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleMainTgf"
    // InternalTgfi.g:103:1: entryRuleMainTgf : ruleMainTgf EOF ;
    public final void entryRuleMainTgf() throws RecognitionException {
        try {
            // InternalTgfi.g:104:1: ( ruleMainTgf EOF )
            // InternalTgfi.g:105:1: ruleMainTgf EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainTgfRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMainTgf();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainTgfRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMainTgf"


    // $ANTLR start "ruleMainTgf"
    // InternalTgfi.g:112:1: ruleMainTgf : ( ( rule__MainTgf__Group__0 ) ) ;
    public final void ruleMainTgf() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:116:2: ( ( ( rule__MainTgf__Group__0 ) ) )
            // InternalTgfi.g:117:2: ( ( rule__MainTgf__Group__0 ) )
            {
            // InternalTgfi.g:117:2: ( ( rule__MainTgf__Group__0 ) )
            // InternalTgfi.g:118:3: ( rule__MainTgf__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainTgfAccess().getGroup()); 
            }
            // InternalTgfi.g:119:3: ( rule__MainTgf__Group__0 )
            // InternalTgfi.g:119:4: rule__MainTgf__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MainTgf__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainTgfAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMainTgf"


    // $ANTLR start "entryRuleProfile"
    // InternalTgfi.g:128:1: entryRuleProfile : ruleProfile EOF ;
    public final void entryRuleProfile() throws RecognitionException {
        try {
            // InternalTgfi.g:129:1: ( ruleProfile EOF )
            // InternalTgfi.g:130:1: ruleProfile EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProfileRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleProfile();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProfileRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProfile"


    // $ANTLR start "ruleProfile"
    // InternalTgfi.g:137:1: ruleProfile : ( ( rule__Profile__Group__0 ) ) ;
    public final void ruleProfile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:141:2: ( ( ( rule__Profile__Group__0 ) ) )
            // InternalTgfi.g:142:2: ( ( rule__Profile__Group__0 ) )
            {
            // InternalTgfi.g:142:2: ( ( rule__Profile__Group__0 ) )
            // InternalTgfi.g:143:3: ( rule__Profile__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProfileAccess().getGroup()); 
            }
            // InternalTgfi.g:144:3: ( rule__Profile__Group__0 )
            // InternalTgfi.g:144:4: rule__Profile__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Profile__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProfileAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProfile"


    // $ANTLR start "entryRuleSecRequirements"
    // InternalTgfi.g:153:1: entryRuleSecRequirements : ruleSecRequirements EOF ;
    public final void entryRuleSecRequirements() throws RecognitionException {
        try {
            // InternalTgfi.g:154:1: ( ruleSecRequirements EOF )
            // InternalTgfi.g:155:1: ruleSecRequirements EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSecRequirementsRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSecRequirements();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSecRequirementsRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSecRequirements"


    // $ANTLR start "ruleSecRequirements"
    // InternalTgfi.g:162:1: ruleSecRequirements : ( ( rule__SecRequirements__Group__0 ) ) ;
    public final void ruleSecRequirements() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:166:2: ( ( ( rule__SecRequirements__Group__0 ) ) )
            // InternalTgfi.g:167:2: ( ( rule__SecRequirements__Group__0 ) )
            {
            // InternalTgfi.g:167:2: ( ( rule__SecRequirements__Group__0 ) )
            // InternalTgfi.g:168:3: ( rule__SecRequirements__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSecRequirementsAccess().getGroup()); 
            }
            // InternalTgfi.g:169:3: ( rule__SecRequirements__Group__0 )
            // InternalTgfi.g:169:4: rule__SecRequirements__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SecRequirements__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSecRequirementsAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSecRequirements"


    // $ANTLR start "entryRuleActor"
    // InternalTgfi.g:178:1: entryRuleActor : ruleActor EOF ;
    public final void entryRuleActor() throws RecognitionException {
        try {
            // InternalTgfi.g:179:1: ( ruleActor EOF )
            // InternalTgfi.g:180:1: ruleActor EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActorRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleActor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActorRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleActor"


    // $ANTLR start "ruleActor"
    // InternalTgfi.g:187:1: ruleActor : ( RULE_STRING ) ;
    public final void ruleActor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:191:2: ( ( RULE_STRING ) )
            // InternalTgfi.g:192:2: ( RULE_STRING )
            {
            // InternalTgfi.g:192:2: ( RULE_STRING )
            // InternalTgfi.g:193:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActorAccess().getSTRINGTerminalRuleCall()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActorAccess().getSTRINGTerminalRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActor"


    // $ANTLR start "entryRuleTransaction"
    // InternalTgfi.g:203:1: entryRuleTransaction : ruleTransaction EOF ;
    public final void entryRuleTransaction() throws RecognitionException {
        try {
            // InternalTgfi.g:204:1: ( ruleTransaction EOF )
            // InternalTgfi.g:205:1: ruleTransaction EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransactionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTransaction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransactionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTransaction"


    // $ANTLR start "ruleTransaction"
    // InternalTgfi.g:212:1: ruleTransaction : ( ( rule__Transaction__Group__0 ) ) ;
    public final void ruleTransaction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:216:2: ( ( ( rule__Transaction__Group__0 ) ) )
            // InternalTgfi.g:217:2: ( ( rule__Transaction__Group__0 ) )
            {
            // InternalTgfi.g:217:2: ( ( rule__Transaction__Group__0 ) )
            // InternalTgfi.g:218:3: ( rule__Transaction__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransactionAccess().getGroup()); 
            }
            // InternalTgfi.g:219:3: ( rule__Transaction__Group__0 )
            // InternalTgfi.g:219:4: rule__Transaction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Transaction__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransactionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransaction"


    // $ANTLR start "entryRuleDomain"
    // InternalTgfi.g:228:1: entryRuleDomain : ruleDomain EOF ;
    public final void entryRuleDomain() throws RecognitionException {
        try {
            // InternalTgfi.g:229:1: ( ruleDomain EOF )
            // InternalTgfi.g:230:1: ruleDomain EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDomain();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDomain"


    // $ANTLR start "ruleDomain"
    // InternalTgfi.g:237:1: ruleDomain : ( RULE_STRING ) ;
    public final void ruleDomain() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:241:2: ( ( RULE_STRING ) )
            // InternalTgfi.g:242:2: ( RULE_STRING )
            {
            // InternalTgfi.g:242:2: ( RULE_STRING )
            // InternalTgfi.g:243:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainAccess().getSTRINGTerminalRuleCall()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainAccess().getSTRINGTerminalRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDomain"


    // $ANTLR start "entryRuleQualityAttr"
    // InternalTgfi.g:253:1: entryRuleQualityAttr : ruleQualityAttr EOF ;
    public final void entryRuleQualityAttr() throws RecognitionException {
        try {
            // InternalTgfi.g:254:1: ( ruleQualityAttr EOF )
            // InternalTgfi.g:255:1: ruleQualityAttr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualityAttrRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleQualityAttr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualityAttrRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualityAttr"


    // $ANTLR start "ruleQualityAttr"
    // InternalTgfi.g:262:1: ruleQualityAttr : ( ( rule__QualityAttr__Group__0 ) ) ;
    public final void ruleQualityAttr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:266:2: ( ( ( rule__QualityAttr__Group__0 ) ) )
            // InternalTgfi.g:267:2: ( ( rule__QualityAttr__Group__0 ) )
            {
            // InternalTgfi.g:267:2: ( ( rule__QualityAttr__Group__0 ) )
            // InternalTgfi.g:268:3: ( rule__QualityAttr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualityAttrAccess().getGroup()); 
            }
            // InternalTgfi.g:269:3: ( rule__QualityAttr__Group__0 )
            // InternalTgfi.g:269:4: rule__QualityAttr__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualityAttr__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualityAttrAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualityAttr"


    // $ANTLR start "entryRuleQualityAttrID"
    // InternalTgfi.g:278:1: entryRuleQualityAttrID : ruleQualityAttrID EOF ;
    public final void entryRuleQualityAttrID() throws RecognitionException {
        try {
            // InternalTgfi.g:279:1: ( ruleQualityAttrID EOF )
            // InternalTgfi.g:280:1: ruleQualityAttrID EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualityAttrIDRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleQualityAttrID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualityAttrIDRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualityAttrID"


    // $ANTLR start "ruleQualityAttrID"
    // InternalTgfi.g:287:1: ruleQualityAttrID : ( RULE_ID ) ;
    public final void ruleQualityAttrID() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:291:2: ( ( RULE_ID ) )
            // InternalTgfi.g:292:2: ( RULE_ID )
            {
            // InternalTgfi.g:292:2: ( RULE_ID )
            // InternalTgfi.g:293:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualityAttrIDAccess().getIDTerminalRuleCall()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualityAttrIDAccess().getIDTerminalRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualityAttrID"


    // $ANTLR start "entryRuleRule"
    // InternalTgfi.g:303:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalTgfi.g:304:1: ( ruleRule EOF )
            // InternalTgfi.g:305:1: ruleRule EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalTgfi.g:312:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:316:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalTgfi.g:317:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalTgfi.g:317:2: ( ( rule__Rule__Group__0 ) )
            // InternalTgfi.g:318:3: ( rule__Rule__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getGroup()); 
            }
            // InternalTgfi.g:319:3: ( rule__Rule__Group__0 )
            // InternalTgfi.g:319:4: rule__Rule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleRuleId"
    // InternalTgfi.g:328:1: entryRuleRuleId : ruleRuleId EOF ;
    public final void entryRuleRuleId() throws RecognitionException {
        try {
            // InternalTgfi.g:329:1: ( ruleRuleId EOF )
            // InternalTgfi.g:330:1: ruleRuleId EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleIdRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRuleId();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleIdRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRuleId"


    // $ANTLR start "ruleRuleId"
    // InternalTgfi.g:337:1: ruleRuleId : ( RULE_ID ) ;
    public final void ruleRuleId() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:341:2: ( ( RULE_ID ) )
            // InternalTgfi.g:342:2: ( RULE_ID )
            {
            // InternalTgfi.g:342:2: ( RULE_ID )
            // InternalTgfi.g:343:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleIdAccess().getIDTerminalRuleCall()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleIdAccess().getIDTerminalRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRuleId"


    // $ANTLR start "rule__Import__Group__0"
    // InternalTgfi.g:352:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:356:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalTgfi.g:357:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Import__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Import__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // InternalTgfi.g:364:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:368:1: ( ( 'import' ) )
            // InternalTgfi.g:369:1: ( 'import' )
            {
            // InternalTgfi.g:369:1: ( 'import' )
            // InternalTgfi.g:370:2: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            }
            match(input,11,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getImportKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // InternalTgfi.g:379:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:383:1: ( rule__Import__Group__1__Impl )
            // InternalTgfi.g:384:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // InternalTgfi.g:390:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportURIAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:394:1: ( ( ( rule__Import__ImportURIAssignment_1 ) ) )
            // InternalTgfi.g:395:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            {
            // InternalTgfi.g:395:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            // InternalTgfi.g:396:2: ( rule__Import__ImportURIAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportURIAssignment_1()); 
            }
            // InternalTgfi.g:397:2: ( rule__Import__ImportURIAssignment_1 )
            // InternalTgfi.g:397:3: rule__Import__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Import__ImportURIAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getImportURIAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__MainTgf__Group__0"
    // InternalTgfi.g:406:1: rule__MainTgf__Group__0 : rule__MainTgf__Group__0__Impl rule__MainTgf__Group__1 ;
    public final void rule__MainTgf__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:410:1: ( rule__MainTgf__Group__0__Impl rule__MainTgf__Group__1 )
            // InternalTgfi.g:411:2: rule__MainTgf__Group__0__Impl rule__MainTgf__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__MainTgf__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MainTgf__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainTgf__Group__0"


    // $ANTLR start "rule__MainTgf__Group__0__Impl"
    // InternalTgfi.g:418:1: rule__MainTgf__Group__0__Impl : ( 'ArchitecturalElement' ) ;
    public final void rule__MainTgf__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:422:1: ( ( 'ArchitecturalElement' ) )
            // InternalTgfi.g:423:1: ( 'ArchitecturalElement' )
            {
            // InternalTgfi.g:423:1: ( 'ArchitecturalElement' )
            // InternalTgfi.g:424:2: 'ArchitecturalElement'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainTgfAccess().getArchitecturalElementKeyword_0()); 
            }
            match(input,12,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainTgfAccess().getArchitecturalElementKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainTgf__Group__0__Impl"


    // $ANTLR start "rule__MainTgf__Group__1"
    // InternalTgfi.g:433:1: rule__MainTgf__Group__1 : rule__MainTgf__Group__1__Impl rule__MainTgf__Group__2 ;
    public final void rule__MainTgf__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:437:1: ( rule__MainTgf__Group__1__Impl rule__MainTgf__Group__2 )
            // InternalTgfi.g:438:2: rule__MainTgf__Group__1__Impl rule__MainTgf__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__MainTgf__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MainTgf__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainTgf__Group__1"


    // $ANTLR start "rule__MainTgf__Group__1__Impl"
    // InternalTgfi.g:445:1: rule__MainTgf__Group__1__Impl : ( ( rule__MainTgf__NameAssignment_1 ) ) ;
    public final void rule__MainTgf__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:449:1: ( ( ( rule__MainTgf__NameAssignment_1 ) ) )
            // InternalTgfi.g:450:1: ( ( rule__MainTgf__NameAssignment_1 ) )
            {
            // InternalTgfi.g:450:1: ( ( rule__MainTgf__NameAssignment_1 ) )
            // InternalTgfi.g:451:2: ( rule__MainTgf__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainTgfAccess().getNameAssignment_1()); 
            }
            // InternalTgfi.g:452:2: ( rule__MainTgf__NameAssignment_1 )
            // InternalTgfi.g:452:3: rule__MainTgf__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MainTgf__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainTgfAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainTgf__Group__1__Impl"


    // $ANTLR start "rule__MainTgf__Group__2"
    // InternalTgfi.g:460:1: rule__MainTgf__Group__2 : rule__MainTgf__Group__2__Impl rule__MainTgf__Group__3 ;
    public final void rule__MainTgf__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:464:1: ( rule__MainTgf__Group__2__Impl rule__MainTgf__Group__3 )
            // InternalTgfi.g:465:2: rule__MainTgf__Group__2__Impl rule__MainTgf__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__MainTgf__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MainTgf__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainTgf__Group__2"


    // $ANTLR start "rule__MainTgf__Group__2__Impl"
    // InternalTgfi.g:472:1: rule__MainTgf__Group__2__Impl : ( '{' ) ;
    public final void rule__MainTgf__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:476:1: ( ( '{' ) )
            // InternalTgfi.g:477:1: ( '{' )
            {
            // InternalTgfi.g:477:1: ( '{' )
            // InternalTgfi.g:478:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainTgfAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,13,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainTgfAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainTgf__Group__2__Impl"


    // $ANTLR start "rule__MainTgf__Group__3"
    // InternalTgfi.g:487:1: rule__MainTgf__Group__3 : rule__MainTgf__Group__3__Impl rule__MainTgf__Group__4 ;
    public final void rule__MainTgf__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:491:1: ( rule__MainTgf__Group__3__Impl rule__MainTgf__Group__4 )
            // InternalTgfi.g:492:2: rule__MainTgf__Group__3__Impl rule__MainTgf__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__MainTgf__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MainTgf__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainTgf__Group__3"


    // $ANTLR start "rule__MainTgf__Group__3__Impl"
    // InternalTgfi.g:499:1: rule__MainTgf__Group__3__Impl : ( ( rule__MainTgf__Group_3__0 )? ) ;
    public final void rule__MainTgf__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:503:1: ( ( ( rule__MainTgf__Group_3__0 )? ) )
            // InternalTgfi.g:504:1: ( ( rule__MainTgf__Group_3__0 )? )
            {
            // InternalTgfi.g:504:1: ( ( rule__MainTgf__Group_3__0 )? )
            // InternalTgfi.g:505:2: ( rule__MainTgf__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainTgfAccess().getGroup_3()); 
            }
            // InternalTgfi.g:506:2: ( rule__MainTgf__Group_3__0 )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==15) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalTgfi.g:506:3: rule__MainTgf__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MainTgf__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainTgfAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainTgf__Group__3__Impl"


    // $ANTLR start "rule__MainTgf__Group__4"
    // InternalTgfi.g:514:1: rule__MainTgf__Group__4 : rule__MainTgf__Group__4__Impl rule__MainTgf__Group__5 ;
    public final void rule__MainTgf__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:518:1: ( rule__MainTgf__Group__4__Impl rule__MainTgf__Group__5 )
            // InternalTgfi.g:519:2: rule__MainTgf__Group__4__Impl rule__MainTgf__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__MainTgf__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MainTgf__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainTgf__Group__4"


    // $ANTLR start "rule__MainTgf__Group__4__Impl"
    // InternalTgfi.g:526:1: rule__MainTgf__Group__4__Impl : ( ( rule__MainTgf__Group_4__0 )? ) ;
    public final void rule__MainTgf__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:530:1: ( ( ( rule__MainTgf__Group_4__0 )? ) )
            // InternalTgfi.g:531:1: ( ( rule__MainTgf__Group_4__0 )? )
            {
            // InternalTgfi.g:531:1: ( ( rule__MainTgf__Group_4__0 )? )
            // InternalTgfi.g:532:2: ( rule__MainTgf__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainTgfAccess().getGroup_4()); 
            }
            // InternalTgfi.g:533:2: ( rule__MainTgf__Group_4__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==17) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalTgfi.g:533:3: rule__MainTgf__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MainTgf__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainTgfAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainTgf__Group__4__Impl"


    // $ANTLR start "rule__MainTgf__Group__5"
    // InternalTgfi.g:541:1: rule__MainTgf__Group__5 : rule__MainTgf__Group__5__Impl rule__MainTgf__Group__6 ;
    public final void rule__MainTgf__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:545:1: ( rule__MainTgf__Group__5__Impl rule__MainTgf__Group__6 )
            // InternalTgfi.g:546:2: rule__MainTgf__Group__5__Impl rule__MainTgf__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__MainTgf__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MainTgf__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainTgf__Group__5"


    // $ANTLR start "rule__MainTgf__Group__5__Impl"
    // InternalTgfi.g:553:1: rule__MainTgf__Group__5__Impl : ( ( rule__MainTgf__Group_5__0 )? ) ;
    public final void rule__MainTgf__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:557:1: ( ( ( rule__MainTgf__Group_5__0 )? ) )
            // InternalTgfi.g:558:1: ( ( rule__MainTgf__Group_5__0 )? )
            {
            // InternalTgfi.g:558:1: ( ( rule__MainTgf__Group_5__0 )? )
            // InternalTgfi.g:559:2: ( rule__MainTgf__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainTgfAccess().getGroup_5()); 
            }
            // InternalTgfi.g:560:2: ( rule__MainTgf__Group_5__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalTgfi.g:560:3: rule__MainTgf__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MainTgf__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainTgfAccess().getGroup_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainTgf__Group__5__Impl"


    // $ANTLR start "rule__MainTgf__Group__6"
    // InternalTgfi.g:568:1: rule__MainTgf__Group__6 : rule__MainTgf__Group__6__Impl rule__MainTgf__Group__7 ;
    public final void rule__MainTgf__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:572:1: ( rule__MainTgf__Group__6__Impl rule__MainTgf__Group__7 )
            // InternalTgfi.g:573:2: rule__MainTgf__Group__6__Impl rule__MainTgf__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__MainTgf__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MainTgf__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainTgf__Group__6"


    // $ANTLR start "rule__MainTgf__Group__6__Impl"
    // InternalTgfi.g:580:1: rule__MainTgf__Group__6__Impl : ( ( rule__MainTgf__Group_6__0 )? ) ;
    public final void rule__MainTgf__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:584:1: ( ( ( rule__MainTgf__Group_6__0 )? ) )
            // InternalTgfi.g:585:1: ( ( rule__MainTgf__Group_6__0 )? )
            {
            // InternalTgfi.g:585:1: ( ( rule__MainTgf__Group_6__0 )? )
            // InternalTgfi.g:586:2: ( rule__MainTgf__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainTgfAccess().getGroup_6()); 
            }
            // InternalTgfi.g:587:2: ( rule__MainTgf__Group_6__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalTgfi.g:587:3: rule__MainTgf__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MainTgf__Group_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainTgfAccess().getGroup_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainTgf__Group__6__Impl"


    // $ANTLR start "rule__MainTgf__Group__7"
    // InternalTgfi.g:595:1: rule__MainTgf__Group__7 : rule__MainTgf__Group__7__Impl rule__MainTgf__Group__8 ;
    public final void rule__MainTgf__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:599:1: ( rule__MainTgf__Group__7__Impl rule__MainTgf__Group__8 )
            // InternalTgfi.g:600:2: rule__MainTgf__Group__7__Impl rule__MainTgf__Group__8
            {
            pushFollow(FOLLOW_6);
            rule__MainTgf__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MainTgf__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainTgf__Group__7"


    // $ANTLR start "rule__MainTgf__Group__7__Impl"
    // InternalTgfi.g:607:1: rule__MainTgf__Group__7__Impl : ( ( rule__MainTgf__Group_7__0 )? ) ;
    public final void rule__MainTgf__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:611:1: ( ( ( rule__MainTgf__Group_7__0 )? ) )
            // InternalTgfi.g:612:1: ( ( rule__MainTgf__Group_7__0 )? )
            {
            // InternalTgfi.g:612:1: ( ( rule__MainTgf__Group_7__0 )? )
            // InternalTgfi.g:613:2: ( rule__MainTgf__Group_7__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainTgfAccess().getGroup_7()); 
            }
            // InternalTgfi.g:614:2: ( rule__MainTgf__Group_7__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalTgfi.g:614:3: rule__MainTgf__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MainTgf__Group_7__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainTgfAccess().getGroup_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainTgf__Group__7__Impl"


    // $ANTLR start "rule__MainTgf__Group__8"
    // InternalTgfi.g:622:1: rule__MainTgf__Group__8 : rule__MainTgf__Group__8__Impl rule__MainTgf__Group__9 ;
    public final void rule__MainTgf__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:626:1: ( rule__MainTgf__Group__8__Impl rule__MainTgf__Group__9 )
            // InternalTgfi.g:627:2: rule__MainTgf__Group__8__Impl rule__MainTgf__Group__9
            {
            pushFollow(FOLLOW_6);
            rule__MainTgf__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MainTgf__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainTgf__Group__8"


    // $ANTLR start "rule__MainTgf__Group__8__Impl"
    // InternalTgfi.g:634:1: rule__MainTgf__Group__8__Impl : ( ( rule__MainTgf__Group_8__0 )? ) ;
    public final void rule__MainTgf__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:638:1: ( ( ( rule__MainTgf__Group_8__0 )? ) )
            // InternalTgfi.g:639:1: ( ( rule__MainTgf__Group_8__0 )? )
            {
            // InternalTgfi.g:639:1: ( ( rule__MainTgf__Group_8__0 )? )
            // InternalTgfi.g:640:2: ( rule__MainTgf__Group_8__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainTgfAccess().getGroup_8()); 
            }
            // InternalTgfi.g:641:2: ( rule__MainTgf__Group_8__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalTgfi.g:641:3: rule__MainTgf__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MainTgf__Group_8__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainTgfAccess().getGroup_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainTgf__Group__8__Impl"


    // $ANTLR start "rule__MainTgf__Group__9"
    // InternalTgfi.g:649:1: rule__MainTgf__Group__9 : rule__MainTgf__Group__9__Impl rule__MainTgf__Group__10 ;
    public final void rule__MainTgf__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:653:1: ( rule__MainTgf__Group__9__Impl rule__MainTgf__Group__10 )
            // InternalTgfi.g:654:2: rule__MainTgf__Group__9__Impl rule__MainTgf__Group__10
            {
            pushFollow(FOLLOW_6);
            rule__MainTgf__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MainTgf__Group__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainTgf__Group__9"


    // $ANTLR start "rule__MainTgf__Group__9__Impl"
    // InternalTgfi.g:661:1: rule__MainTgf__Group__9__Impl : ( ( rule__MainTgf__Group_9__0 )* ) ;
    public final void rule__MainTgf__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:665:1: ( ( ( rule__MainTgf__Group_9__0 )* ) )
            // InternalTgfi.g:666:1: ( ( rule__MainTgf__Group_9__0 )* )
            {
            // InternalTgfi.g:666:1: ( ( rule__MainTgf__Group_9__0 )* )
            // InternalTgfi.g:667:2: ( rule__MainTgf__Group_9__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainTgfAccess().getGroup_9()); 
            }
            // InternalTgfi.g:668:2: ( rule__MainTgf__Group_9__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==22) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalTgfi.g:668:3: rule__MainTgf__Group_9__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__MainTgf__Group_9__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainTgfAccess().getGroup_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainTgf__Group__9__Impl"


    // $ANTLR start "rule__MainTgf__Group__10"
    // InternalTgfi.g:676:1: rule__MainTgf__Group__10 : rule__MainTgf__Group__10__Impl rule__MainTgf__Group__11 ;
    public final void rule__MainTgf__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:680:1: ( rule__MainTgf__Group__10__Impl rule__MainTgf__Group__11 )
            // InternalTgfi.g:681:2: rule__MainTgf__Group__10__Impl rule__MainTgf__Group__11
            {
            pushFollow(FOLLOW_8);
            rule__MainTgf__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MainTgf__Group__11();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainTgf__Group__10"


    // $ANTLR start "rule__MainTgf__Group__10__Impl"
    // InternalTgfi.g:688:1: rule__MainTgf__Group__10__Impl : ( ( ( rule__MainTgf__ProfAssignment_10 ) ) ( ( rule__MainTgf__ProfAssignment_10 )* ) ) ;
    public final void rule__MainTgf__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:692:1: ( ( ( ( rule__MainTgf__ProfAssignment_10 ) ) ( ( rule__MainTgf__ProfAssignment_10 )* ) ) )
            // InternalTgfi.g:693:1: ( ( ( rule__MainTgf__ProfAssignment_10 ) ) ( ( rule__MainTgf__ProfAssignment_10 )* ) )
            {
            // InternalTgfi.g:693:1: ( ( ( rule__MainTgf__ProfAssignment_10 ) ) ( ( rule__MainTgf__ProfAssignment_10 )* ) )
            // InternalTgfi.g:694:2: ( ( rule__MainTgf__ProfAssignment_10 ) ) ( ( rule__MainTgf__ProfAssignment_10 )* )
            {
            // InternalTgfi.g:694:2: ( ( rule__MainTgf__ProfAssignment_10 ) )
            // InternalTgfi.g:695:3: ( rule__MainTgf__ProfAssignment_10 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainTgfAccess().getProfAssignment_10()); 
            }
            // InternalTgfi.g:696:3: ( rule__MainTgf__ProfAssignment_10 )
            // InternalTgfi.g:696:4: rule__MainTgf__ProfAssignment_10
            {
            pushFollow(FOLLOW_9);
            rule__MainTgf__ProfAssignment_10();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainTgfAccess().getProfAssignment_10()); 
            }

            }

            // InternalTgfi.g:699:2: ( ( rule__MainTgf__ProfAssignment_10 )* )
            // InternalTgfi.g:700:3: ( rule__MainTgf__ProfAssignment_10 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainTgfAccess().getProfAssignment_10()); 
            }
            // InternalTgfi.g:701:3: ( rule__MainTgf__ProfAssignment_10 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==23) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalTgfi.g:701:4: rule__MainTgf__ProfAssignment_10
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__MainTgf__ProfAssignment_10();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainTgfAccess().getProfAssignment_10()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainTgf__Group__10__Impl"


    // $ANTLR start "rule__MainTgf__Group__11"
    // InternalTgfi.g:710:1: rule__MainTgf__Group__11 : rule__MainTgf__Group__11__Impl ;
    public final void rule__MainTgf__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:714:1: ( rule__MainTgf__Group__11__Impl )
            // InternalTgfi.g:715:2: rule__MainTgf__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MainTgf__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainTgf__Group__11"


    // $ANTLR start "rule__MainTgf__Group__11__Impl"
    // InternalTgfi.g:721:1: rule__MainTgf__Group__11__Impl : ( '}' ) ;
    public final void rule__MainTgf__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:725:1: ( ( '}' ) )
            // InternalTgfi.g:726:1: ( '}' )
            {
            // InternalTgfi.g:726:1: ( '}' )
            // InternalTgfi.g:727:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainTgfAccess().getRightCurlyBracketKeyword_11()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainTgfAccess().getRightCurlyBracketKeyword_11()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainTgf__Group__11__Impl"


    // $ANTLR start "rule__MainTgf__Group_3__0"
    // InternalTgfi.g:737:1: rule__MainTgf__Group_3__0 : rule__MainTgf__Group_3__0__Impl rule__MainTgf__Group_3__1 ;
    public final void rule__MainTgf__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:741:1: ( rule__MainTgf__Group_3__0__Impl rule__MainTgf__Group_3__1 )
            // InternalTgfi.g:742:2: rule__MainTgf__Group_3__0__Impl rule__MainTgf__Group_3__1
            {
            pushFollow(FOLLOW_10);
            rule__MainTgf__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MainTgf__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainTgf__Group_3__0"


    // $ANTLR start "rule__MainTgf__Group_3__0__Impl"
    // InternalTgfi.g:749:1: rule__MainTgf__Group_3__0__Impl : ( 'JavaPackage' ) ;
    public final void rule__MainTgf__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:753:1: ( ( 'JavaPackage' ) )
            // InternalTgfi.g:754:1: ( 'JavaPackage' )
            {
            // InternalTgfi.g:754:1: ( 'JavaPackage' )
            // InternalTgfi.g:755:2: 'JavaPackage'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainTgfAccess().getJavaPackageKeyword_3_0()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainTgfAccess().getJavaPackageKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainTgf__Group_3__0__Impl"


    // $ANTLR start "rule__MainTgf__Group_3__1"
    // InternalTgfi.g:764:1: rule__MainTgf__Group_3__1 : rule__MainTgf__Group_3__1__Impl rule__MainTgf__Group_3__2 ;
    public final void rule__MainTgf__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:768:1: ( rule__MainTgf__Group_3__1__Impl rule__MainTgf__Group_3__2 )
            // InternalTgfi.g:769:2: rule__MainTgf__Group_3__1__Impl rule__MainTgf__Group_3__2
            {
            pushFollow(FOLLOW_3);
            rule__MainTgf__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MainTgf__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainTgf__Group_3__1"


    // $ANTLR start "rule__MainTgf__Group_3__1__Impl"
    // InternalTgfi.g:776:1: rule__MainTgf__Group_3__1__Impl : ( ':' ) ;
    public final void rule__MainTgf__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:780:1: ( ( ':' ) )
            // InternalTgfi.g:781:1: ( ':' )
            {
            // InternalTgfi.g:781:1: ( ':' )
            // InternalTgfi.g:782:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainTgfAccess().getColonKeyword_3_1()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainTgfAccess().getColonKeyword_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainTgf__Group_3__1__Impl"


    // $ANTLR start "rule__MainTgf__Group_3__2"
    // InternalTgfi.g:791:1: rule__MainTgf__Group_3__2 : rule__MainTgf__Group_3__2__Impl ;
    public final void rule__MainTgf__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:795:1: ( rule__MainTgf__Group_3__2__Impl )
            // InternalTgfi.g:796:2: rule__MainTgf__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MainTgf__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainTgf__Group_3__2"


    // $ANTLR start "rule__MainTgf__Group_3__2__Impl"
    // InternalTgfi.g:802:1: rule__MainTgf__Group_3__2__Impl : ( ( rule__MainTgf__GenPackageAssignment_3_2 ) ) ;
    public final void rule__MainTgf__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:806:1: ( ( ( rule__MainTgf__GenPackageAssignment_3_2 ) ) )
            // InternalTgfi.g:807:1: ( ( rule__MainTgf__GenPackageAssignment_3_2 ) )
            {
            // InternalTgfi.g:807:1: ( ( rule__MainTgf__GenPackageAssignment_3_2 ) )
            // InternalTgfi.g:808:2: ( rule__MainTgf__GenPackageAssignment_3_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainTgfAccess().getGenPackageAssignment_3_2()); 
            }
            // InternalTgfi.g:809:2: ( rule__MainTgf__GenPackageAssignment_3_2 )
            // InternalTgfi.g:809:3: rule__MainTgf__GenPackageAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__MainTgf__GenPackageAssignment_3_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainTgfAccess().getGenPackageAssignment_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainTgf__Group_3__2__Impl"


    // $ANTLR start "rule__MainTgf__Group_4__0"
    // InternalTgfi.g:818:1: rule__MainTgf__Group_4__0 : rule__MainTgf__Group_4__0__Impl rule__MainTgf__Group_4__1 ;
    public final void rule__MainTgf__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:822:1: ( rule__MainTgf__Group_4__0__Impl rule__MainTgf__Group_4__1 )
            // InternalTgfi.g:823:2: rule__MainTgf__Group_4__0__Impl rule__MainTgf__Group_4__1
            {
            pushFollow(FOLLOW_10);
            rule__MainTgf__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MainTgf__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainTgf__Group_4__0"


    // $ANTLR start "rule__MainTgf__Group_4__0__Impl"
    // InternalTgfi.g:830:1: rule__MainTgf__Group_4__0__Impl : ( 'Name' ) ;
    public final void rule__MainTgf__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:834:1: ( ( 'Name' ) )
            // InternalTgfi.g:835:1: ( 'Name' )
            {
            // InternalTgfi.g:835:1: ( 'Name' )
            // InternalTgfi.g:836:2: 'Name'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainTgfAccess().getNameKeyword_4_0()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainTgfAccess().getNameKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainTgf__Group_4__0__Impl"


    // $ANTLR start "rule__MainTgf__Group_4__1"
    // InternalTgfi.g:845:1: rule__MainTgf__Group_4__1 : rule__MainTgf__Group_4__1__Impl rule__MainTgf__Group_4__2 ;
    public final void rule__MainTgf__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:849:1: ( rule__MainTgf__Group_4__1__Impl rule__MainTgf__Group_4__2 )
            // InternalTgfi.g:850:2: rule__MainTgf__Group_4__1__Impl rule__MainTgf__Group_4__2
            {
            pushFollow(FOLLOW_3);
            rule__MainTgf__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MainTgf__Group_4__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainTgf__Group_4__1"


    // $ANTLR start "rule__MainTgf__Group_4__1__Impl"
    // InternalTgfi.g:857:1: rule__MainTgf__Group_4__1__Impl : ( ':' ) ;
    public final void rule__MainTgf__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:861:1: ( ( ':' ) )
            // InternalTgfi.g:862:1: ( ':' )
            {
            // InternalTgfi.g:862:1: ( ':' )
            // InternalTgfi.g:863:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainTgfAccess().getColonKeyword_4_1()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainTgfAccess().getColonKeyword_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainTgf__Group_4__1__Impl"


    // $ANTLR start "rule__MainTgf__Group_4__2"
    // InternalTgfi.g:872:1: rule__MainTgf__Group_4__2 : rule__MainTgf__Group_4__2__Impl ;
    public final void rule__MainTgf__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:876:1: ( rule__MainTgf__Group_4__2__Impl )
            // InternalTgfi.g:877:2: rule__MainTgf__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MainTgf__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainTgf__Group_4__2"


    // $ANTLR start "rule__MainTgf__Group_4__2__Impl"
    // InternalTgfi.g:883:1: rule__MainTgf__Group_4__2__Impl : ( ( rule__MainTgf__SatNameAssignment_4_2 ) ) ;
    public final void rule__MainTgf__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:887:1: ( ( ( rule__MainTgf__SatNameAssignment_4_2 ) ) )
            // InternalTgfi.g:888:1: ( ( rule__MainTgf__SatNameAssignment_4_2 ) )
            {
            // InternalTgfi.g:888:1: ( ( rule__MainTgf__SatNameAssignment_4_2 ) )
            // InternalTgfi.g:889:2: ( rule__MainTgf__SatNameAssignment_4_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainTgfAccess().getSatNameAssignment_4_2()); 
            }
            // InternalTgfi.g:890:2: ( rule__MainTgf__SatNameAssignment_4_2 )
            // InternalTgfi.g:890:3: rule__MainTgf__SatNameAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__MainTgf__SatNameAssignment_4_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainTgfAccess().getSatNameAssignment_4_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainTgf__Group_4__2__Impl"


    // $ANTLR start "rule__MainTgf__Group_5__0"
    // InternalTgfi.g:899:1: rule__MainTgf__Group_5__0 : rule__MainTgf__Group_5__0__Impl rule__MainTgf__Group_5__1 ;
    public final void rule__MainTgf__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:903:1: ( rule__MainTgf__Group_5__0__Impl rule__MainTgf__Group_5__1 )
            // InternalTgfi.g:904:2: rule__MainTgf__Group_5__0__Impl rule__MainTgf__Group_5__1
            {
            pushFollow(FOLLOW_10);
            rule__MainTgf__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MainTgf__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainTgf__Group_5__0"


    // $ANTLR start "rule__MainTgf__Group_5__0__Impl"
    // InternalTgfi.g:911:1: rule__MainTgf__Group_5__0__Impl : ( 'Version' ) ;
    public final void rule__MainTgf__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:915:1: ( ( 'Version' ) )
            // InternalTgfi.g:916:1: ( 'Version' )
            {
            // InternalTgfi.g:916:1: ( 'Version' )
            // InternalTgfi.g:917:2: 'Version'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainTgfAccess().getVersionKeyword_5_0()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainTgfAccess().getVersionKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainTgf__Group_5__0__Impl"


    // $ANTLR start "rule__MainTgf__Group_5__1"
    // InternalTgfi.g:926:1: rule__MainTgf__Group_5__1 : rule__MainTgf__Group_5__1__Impl rule__MainTgf__Group_5__2 ;
    public final void rule__MainTgf__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:930:1: ( rule__MainTgf__Group_5__1__Impl rule__MainTgf__Group_5__2 )
            // InternalTgfi.g:931:2: rule__MainTgf__Group_5__1__Impl rule__MainTgf__Group_5__2
            {
            pushFollow(FOLLOW_3);
            rule__MainTgf__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MainTgf__Group_5__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainTgf__Group_5__1"


    // $ANTLR start "rule__MainTgf__Group_5__1__Impl"
    // InternalTgfi.g:938:1: rule__MainTgf__Group_5__1__Impl : ( ':' ) ;
    public final void rule__MainTgf__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:942:1: ( ( ':' ) )
            // InternalTgfi.g:943:1: ( ':' )
            {
            // InternalTgfi.g:943:1: ( ':' )
            // InternalTgfi.g:944:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainTgfAccess().getColonKeyword_5_1()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainTgfAccess().getColonKeyword_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainTgf__Group_5__1__Impl"


    // $ANTLR start "rule__MainTgf__Group_5__2"
    // InternalTgfi.g:953:1: rule__MainTgf__Group_5__2 : rule__MainTgf__Group_5__2__Impl ;
    public final void rule__MainTgf__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:957:1: ( rule__MainTgf__Group_5__2__Impl )
            // InternalTgfi.g:958:2: rule__MainTgf__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MainTgf__Group_5__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainTgf__Group_5__2"


    // $ANTLR start "rule__MainTgf__Group_5__2__Impl"
    // InternalTgfi.g:964:1: rule__MainTgf__Group_5__2__Impl : ( ( rule__MainTgf__VersionNameAssignment_5_2 ) ) ;
    public final void rule__MainTgf__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:968:1: ( ( ( rule__MainTgf__VersionNameAssignment_5_2 ) ) )
            // InternalTgfi.g:969:1: ( ( rule__MainTgf__VersionNameAssignment_5_2 ) )
            {
            // InternalTgfi.g:969:1: ( ( rule__MainTgf__VersionNameAssignment_5_2 ) )
            // InternalTgfi.g:970:2: ( rule__MainTgf__VersionNameAssignment_5_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainTgfAccess().getVersionNameAssignment_5_2()); 
            }
            // InternalTgfi.g:971:2: ( rule__MainTgf__VersionNameAssignment_5_2 )
            // InternalTgfi.g:971:3: rule__MainTgf__VersionNameAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__MainTgf__VersionNameAssignment_5_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainTgfAccess().getVersionNameAssignment_5_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainTgf__Group_5__2__Impl"


    // $ANTLR start "rule__MainTgf__Group_6__0"
    // InternalTgfi.g:980:1: rule__MainTgf__Group_6__0 : rule__MainTgf__Group_6__0__Impl rule__MainTgf__Group_6__1 ;
    public final void rule__MainTgf__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:984:1: ( rule__MainTgf__Group_6__0__Impl rule__MainTgf__Group_6__1 )
            // InternalTgfi.g:985:2: rule__MainTgf__Group_6__0__Impl rule__MainTgf__Group_6__1
            {
            pushFollow(FOLLOW_10);
            rule__MainTgf__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MainTgf__Group_6__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainTgf__Group_6__0"


    // $ANTLR start "rule__MainTgf__Group_6__0__Impl"
    // InternalTgfi.g:992:1: rule__MainTgf__Group_6__0__Impl : ( 'Status' ) ;
    public final void rule__MainTgf__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:996:1: ( ( 'Status' ) )
            // InternalTgfi.g:997:1: ( 'Status' )
            {
            // InternalTgfi.g:997:1: ( 'Status' )
            // InternalTgfi.g:998:2: 'Status'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainTgfAccess().getStatusKeyword_6_0()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainTgfAccess().getStatusKeyword_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainTgf__Group_6__0__Impl"


    // $ANTLR start "rule__MainTgf__Group_6__1"
    // InternalTgfi.g:1007:1: rule__MainTgf__Group_6__1 : rule__MainTgf__Group_6__1__Impl rule__MainTgf__Group_6__2 ;
    public final void rule__MainTgf__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1011:1: ( rule__MainTgf__Group_6__1__Impl rule__MainTgf__Group_6__2 )
            // InternalTgfi.g:1012:2: rule__MainTgf__Group_6__1__Impl rule__MainTgf__Group_6__2
            {
            pushFollow(FOLLOW_3);
            rule__MainTgf__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MainTgf__Group_6__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainTgf__Group_6__1"


    // $ANTLR start "rule__MainTgf__Group_6__1__Impl"
    // InternalTgfi.g:1019:1: rule__MainTgf__Group_6__1__Impl : ( ':' ) ;
    public final void rule__MainTgf__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1023:1: ( ( ':' ) )
            // InternalTgfi.g:1024:1: ( ':' )
            {
            // InternalTgfi.g:1024:1: ( ':' )
            // InternalTgfi.g:1025:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainTgfAccess().getColonKeyword_6_1()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainTgfAccess().getColonKeyword_6_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainTgf__Group_6__1__Impl"


    // $ANTLR start "rule__MainTgf__Group_6__2"
    // InternalTgfi.g:1034:1: rule__MainTgf__Group_6__2 : rule__MainTgf__Group_6__2__Impl ;
    public final void rule__MainTgf__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1038:1: ( rule__MainTgf__Group_6__2__Impl )
            // InternalTgfi.g:1039:2: rule__MainTgf__Group_6__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MainTgf__Group_6__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainTgf__Group_6__2"


    // $ANTLR start "rule__MainTgf__Group_6__2__Impl"
    // InternalTgfi.g:1045:1: rule__MainTgf__Group_6__2__Impl : ( ( rule__MainTgf__StatusNameAssignment_6_2 ) ) ;
    public final void rule__MainTgf__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1049:1: ( ( ( rule__MainTgf__StatusNameAssignment_6_2 ) ) )
            // InternalTgfi.g:1050:1: ( ( rule__MainTgf__StatusNameAssignment_6_2 ) )
            {
            // InternalTgfi.g:1050:1: ( ( rule__MainTgf__StatusNameAssignment_6_2 ) )
            // InternalTgfi.g:1051:2: ( rule__MainTgf__StatusNameAssignment_6_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainTgfAccess().getStatusNameAssignment_6_2()); 
            }
            // InternalTgfi.g:1052:2: ( rule__MainTgf__StatusNameAssignment_6_2 )
            // InternalTgfi.g:1052:3: rule__MainTgf__StatusNameAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__MainTgf__StatusNameAssignment_6_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainTgfAccess().getStatusNameAssignment_6_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainTgf__Group_6__2__Impl"


    // $ANTLR start "rule__MainTgf__Group_7__0"
    // InternalTgfi.g:1061:1: rule__MainTgf__Group_7__0 : rule__MainTgf__Group_7__0__Impl rule__MainTgf__Group_7__1 ;
    public final void rule__MainTgf__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1065:1: ( rule__MainTgf__Group_7__0__Impl rule__MainTgf__Group_7__1 )
            // InternalTgfi.g:1066:2: rule__MainTgf__Group_7__0__Impl rule__MainTgf__Group_7__1
            {
            pushFollow(FOLLOW_10);
            rule__MainTgf__Group_7__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MainTgf__Group_7__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainTgf__Group_7__0"


    // $ANTLR start "rule__MainTgf__Group_7__0__Impl"
    // InternalTgfi.g:1073:1: rule__MainTgf__Group_7__0__Impl : ( 'Objective' ) ;
    public final void rule__MainTgf__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1077:1: ( ( 'Objective' ) )
            // InternalTgfi.g:1078:1: ( 'Objective' )
            {
            // InternalTgfi.g:1078:1: ( 'Objective' )
            // InternalTgfi.g:1079:2: 'Objective'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainTgfAccess().getObjectiveKeyword_7_0()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainTgfAccess().getObjectiveKeyword_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainTgf__Group_7__0__Impl"


    // $ANTLR start "rule__MainTgf__Group_7__1"
    // InternalTgfi.g:1088:1: rule__MainTgf__Group_7__1 : rule__MainTgf__Group_7__1__Impl rule__MainTgf__Group_7__2 ;
    public final void rule__MainTgf__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1092:1: ( rule__MainTgf__Group_7__1__Impl rule__MainTgf__Group_7__2 )
            // InternalTgfi.g:1093:2: rule__MainTgf__Group_7__1__Impl rule__MainTgf__Group_7__2
            {
            pushFollow(FOLLOW_3);
            rule__MainTgf__Group_7__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MainTgf__Group_7__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainTgf__Group_7__1"


    // $ANTLR start "rule__MainTgf__Group_7__1__Impl"
    // InternalTgfi.g:1100:1: rule__MainTgf__Group_7__1__Impl : ( ':' ) ;
    public final void rule__MainTgf__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1104:1: ( ( ':' ) )
            // InternalTgfi.g:1105:1: ( ':' )
            {
            // InternalTgfi.g:1105:1: ( ':' )
            // InternalTgfi.g:1106:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainTgfAccess().getColonKeyword_7_1()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainTgfAccess().getColonKeyword_7_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainTgf__Group_7__1__Impl"


    // $ANTLR start "rule__MainTgf__Group_7__2"
    // InternalTgfi.g:1115:1: rule__MainTgf__Group_7__2 : rule__MainTgf__Group_7__2__Impl ;
    public final void rule__MainTgf__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1119:1: ( rule__MainTgf__Group_7__2__Impl )
            // InternalTgfi.g:1120:2: rule__MainTgf__Group_7__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MainTgf__Group_7__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainTgf__Group_7__2"


    // $ANTLR start "rule__MainTgf__Group_7__2__Impl"
    // InternalTgfi.g:1126:1: rule__MainTgf__Group_7__2__Impl : ( ( rule__MainTgf__ObjectiveNameAssignment_7_2 ) ) ;
    public final void rule__MainTgf__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1130:1: ( ( ( rule__MainTgf__ObjectiveNameAssignment_7_2 ) ) )
            // InternalTgfi.g:1131:1: ( ( rule__MainTgf__ObjectiveNameAssignment_7_2 ) )
            {
            // InternalTgfi.g:1131:1: ( ( rule__MainTgf__ObjectiveNameAssignment_7_2 ) )
            // InternalTgfi.g:1132:2: ( rule__MainTgf__ObjectiveNameAssignment_7_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainTgfAccess().getObjectiveNameAssignment_7_2()); 
            }
            // InternalTgfi.g:1133:2: ( rule__MainTgf__ObjectiveNameAssignment_7_2 )
            // InternalTgfi.g:1133:3: rule__MainTgf__ObjectiveNameAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__MainTgf__ObjectiveNameAssignment_7_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainTgfAccess().getObjectiveNameAssignment_7_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainTgf__Group_7__2__Impl"


    // $ANTLR start "rule__MainTgf__Group_8__0"
    // InternalTgfi.g:1142:1: rule__MainTgf__Group_8__0 : rule__MainTgf__Group_8__0__Impl rule__MainTgf__Group_8__1 ;
    public final void rule__MainTgf__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1146:1: ( rule__MainTgf__Group_8__0__Impl rule__MainTgf__Group_8__1 )
            // InternalTgfi.g:1147:2: rule__MainTgf__Group_8__0__Impl rule__MainTgf__Group_8__1
            {
            pushFollow(FOLLOW_10);
            rule__MainTgf__Group_8__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MainTgf__Group_8__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainTgf__Group_8__0"


    // $ANTLR start "rule__MainTgf__Group_8__0__Impl"
    // InternalTgfi.g:1154:1: rule__MainTgf__Group_8__0__Impl : ( 'HL_Function' ) ;
    public final void rule__MainTgf__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1158:1: ( ( 'HL_Function' ) )
            // InternalTgfi.g:1159:1: ( 'HL_Function' )
            {
            // InternalTgfi.g:1159:1: ( 'HL_Function' )
            // InternalTgfi.g:1160:2: 'HL_Function'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainTgfAccess().getHL_FunctionKeyword_8_0()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainTgfAccess().getHL_FunctionKeyword_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainTgf__Group_8__0__Impl"


    // $ANTLR start "rule__MainTgf__Group_8__1"
    // InternalTgfi.g:1169:1: rule__MainTgf__Group_8__1 : rule__MainTgf__Group_8__1__Impl rule__MainTgf__Group_8__2 ;
    public final void rule__MainTgf__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1173:1: ( rule__MainTgf__Group_8__1__Impl rule__MainTgf__Group_8__2 )
            // InternalTgfi.g:1174:2: rule__MainTgf__Group_8__1__Impl rule__MainTgf__Group_8__2
            {
            pushFollow(FOLLOW_3);
            rule__MainTgf__Group_8__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MainTgf__Group_8__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainTgf__Group_8__1"


    // $ANTLR start "rule__MainTgf__Group_8__1__Impl"
    // InternalTgfi.g:1181:1: rule__MainTgf__Group_8__1__Impl : ( ':' ) ;
    public final void rule__MainTgf__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1185:1: ( ( ':' ) )
            // InternalTgfi.g:1186:1: ( ':' )
            {
            // InternalTgfi.g:1186:1: ( ':' )
            // InternalTgfi.g:1187:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainTgfAccess().getColonKeyword_8_1()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainTgfAccess().getColonKeyword_8_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainTgf__Group_8__1__Impl"


    // $ANTLR start "rule__MainTgf__Group_8__2"
    // InternalTgfi.g:1196:1: rule__MainTgf__Group_8__2 : rule__MainTgf__Group_8__2__Impl ;
    public final void rule__MainTgf__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1200:1: ( rule__MainTgf__Group_8__2__Impl )
            // InternalTgfi.g:1201:2: rule__MainTgf__Group_8__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MainTgf__Group_8__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainTgf__Group_8__2"


    // $ANTLR start "rule__MainTgf__Group_8__2__Impl"
    // InternalTgfi.g:1207:1: rule__MainTgf__Group_8__2__Impl : ( ( rule__MainTgf__HlfunctionNameAssignment_8_2 ) ) ;
    public final void rule__MainTgf__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1211:1: ( ( ( rule__MainTgf__HlfunctionNameAssignment_8_2 ) ) )
            // InternalTgfi.g:1212:1: ( ( rule__MainTgf__HlfunctionNameAssignment_8_2 ) )
            {
            // InternalTgfi.g:1212:1: ( ( rule__MainTgf__HlfunctionNameAssignment_8_2 ) )
            // InternalTgfi.g:1213:2: ( rule__MainTgf__HlfunctionNameAssignment_8_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainTgfAccess().getHlfunctionNameAssignment_8_2()); 
            }
            // InternalTgfi.g:1214:2: ( rule__MainTgf__HlfunctionNameAssignment_8_2 )
            // InternalTgfi.g:1214:3: rule__MainTgf__HlfunctionNameAssignment_8_2
            {
            pushFollow(FOLLOW_2);
            rule__MainTgf__HlfunctionNameAssignment_8_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainTgfAccess().getHlfunctionNameAssignment_8_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainTgf__Group_8__2__Impl"


    // $ANTLR start "rule__MainTgf__Group_9__0"
    // InternalTgfi.g:1223:1: rule__MainTgf__Group_9__0 : rule__MainTgf__Group_9__0__Impl rule__MainTgf__Group_9__1 ;
    public final void rule__MainTgf__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1227:1: ( rule__MainTgf__Group_9__0__Impl rule__MainTgf__Group_9__1 )
            // InternalTgfi.g:1228:2: rule__MainTgf__Group_9__0__Impl rule__MainTgf__Group_9__1
            {
            pushFollow(FOLLOW_5);
            rule__MainTgf__Group_9__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MainTgf__Group_9__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainTgf__Group_9__0"


    // $ANTLR start "rule__MainTgf__Group_9__0__Impl"
    // InternalTgfi.g:1235:1: rule__MainTgf__Group_9__0__Impl : ( 'Rules:' ) ;
    public final void rule__MainTgf__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1239:1: ( ( 'Rules:' ) )
            // InternalTgfi.g:1240:1: ( 'Rules:' )
            {
            // InternalTgfi.g:1240:1: ( 'Rules:' )
            // InternalTgfi.g:1241:2: 'Rules:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainTgfAccess().getRulesKeyword_9_0()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainTgfAccess().getRulesKeyword_9_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainTgf__Group_9__0__Impl"


    // $ANTLR start "rule__MainTgf__Group_9__1"
    // InternalTgfi.g:1250:1: rule__MainTgf__Group_9__1 : rule__MainTgf__Group_9__1__Impl rule__MainTgf__Group_9__2 ;
    public final void rule__MainTgf__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1254:1: ( rule__MainTgf__Group_9__1__Impl rule__MainTgf__Group_9__2 )
            // InternalTgfi.g:1255:2: rule__MainTgf__Group_9__1__Impl rule__MainTgf__Group_9__2
            {
            pushFollow(FOLLOW_11);
            rule__MainTgf__Group_9__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MainTgf__Group_9__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainTgf__Group_9__1"


    // $ANTLR start "rule__MainTgf__Group_9__1__Impl"
    // InternalTgfi.g:1262:1: rule__MainTgf__Group_9__1__Impl : ( '{' ) ;
    public final void rule__MainTgf__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1266:1: ( ( '{' ) )
            // InternalTgfi.g:1267:1: ( '{' )
            {
            // InternalTgfi.g:1267:1: ( '{' )
            // InternalTgfi.g:1268:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainTgfAccess().getLeftCurlyBracketKeyword_9_1()); 
            }
            match(input,13,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainTgfAccess().getLeftCurlyBracketKeyword_9_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainTgf__Group_9__1__Impl"


    // $ANTLR start "rule__MainTgf__Group_9__2"
    // InternalTgfi.g:1277:1: rule__MainTgf__Group_9__2 : rule__MainTgf__Group_9__2__Impl rule__MainTgf__Group_9__3 ;
    public final void rule__MainTgf__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1281:1: ( rule__MainTgf__Group_9__2__Impl rule__MainTgf__Group_9__3 )
            // InternalTgfi.g:1282:2: rule__MainTgf__Group_9__2__Impl rule__MainTgf__Group_9__3
            {
            pushFollow(FOLLOW_11);
            rule__MainTgf__Group_9__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MainTgf__Group_9__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainTgf__Group_9__2"


    // $ANTLR start "rule__MainTgf__Group_9__2__Impl"
    // InternalTgfi.g:1289:1: rule__MainTgf__Group_9__2__Impl : ( ( rule__MainTgf__RulesAssignment_9_2 )* ) ;
    public final void rule__MainTgf__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1293:1: ( ( ( rule__MainTgf__RulesAssignment_9_2 )* ) )
            // InternalTgfi.g:1294:1: ( ( rule__MainTgf__RulesAssignment_9_2 )* )
            {
            // InternalTgfi.g:1294:1: ( ( rule__MainTgf__RulesAssignment_9_2 )* )
            // InternalTgfi.g:1295:2: ( rule__MainTgf__RulesAssignment_9_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainTgfAccess().getRulesAssignment_9_2()); 
            }
            // InternalTgfi.g:1296:2: ( rule__MainTgf__RulesAssignment_9_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalTgfi.g:1296:3: rule__MainTgf__RulesAssignment_9_2
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__MainTgf__RulesAssignment_9_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainTgfAccess().getRulesAssignment_9_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainTgf__Group_9__2__Impl"


    // $ANTLR start "rule__MainTgf__Group_9__3"
    // InternalTgfi.g:1304:1: rule__MainTgf__Group_9__3 : rule__MainTgf__Group_9__3__Impl ;
    public final void rule__MainTgf__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1308:1: ( rule__MainTgf__Group_9__3__Impl )
            // InternalTgfi.g:1309:2: rule__MainTgf__Group_9__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MainTgf__Group_9__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainTgf__Group_9__3"


    // $ANTLR start "rule__MainTgf__Group_9__3__Impl"
    // InternalTgfi.g:1315:1: rule__MainTgf__Group_9__3__Impl : ( '}' ) ;
    public final void rule__MainTgf__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1319:1: ( ( '}' ) )
            // InternalTgfi.g:1320:1: ( '}' )
            {
            // InternalTgfi.g:1320:1: ( '}' )
            // InternalTgfi.g:1321:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainTgfAccess().getRightCurlyBracketKeyword_9_3()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainTgfAccess().getRightCurlyBracketKeyword_9_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainTgf__Group_9__3__Impl"


    // $ANTLR start "rule__Profile__Group__0"
    // InternalTgfi.g:1331:1: rule__Profile__Group__0 : rule__Profile__Group__0__Impl rule__Profile__Group__1 ;
    public final void rule__Profile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1335:1: ( rule__Profile__Group__0__Impl rule__Profile__Group__1 )
            // InternalTgfi.g:1336:2: rule__Profile__Group__0__Impl rule__Profile__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Profile__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Profile__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__Group__0"


    // $ANTLR start "rule__Profile__Group__0__Impl"
    // InternalTgfi.g:1343:1: rule__Profile__Group__0__Impl : ( 'Profile' ) ;
    public final void rule__Profile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1347:1: ( ( 'Profile' ) )
            // InternalTgfi.g:1348:1: ( 'Profile' )
            {
            // InternalTgfi.g:1348:1: ( 'Profile' )
            // InternalTgfi.g:1349:2: 'Profile'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProfileAccess().getProfileKeyword_0()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProfileAccess().getProfileKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__Group__0__Impl"


    // $ANTLR start "rule__Profile__Group__1"
    // InternalTgfi.g:1358:1: rule__Profile__Group__1 : rule__Profile__Group__1__Impl rule__Profile__Group__2 ;
    public final void rule__Profile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1362:1: ( rule__Profile__Group__1__Impl rule__Profile__Group__2 )
            // InternalTgfi.g:1363:2: rule__Profile__Group__1__Impl rule__Profile__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Profile__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Profile__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__Group__1"


    // $ANTLR start "rule__Profile__Group__1__Impl"
    // InternalTgfi.g:1370:1: rule__Profile__Group__1__Impl : ( ( rule__Profile__NameAssignment_1 ) ) ;
    public final void rule__Profile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1374:1: ( ( ( rule__Profile__NameAssignment_1 ) ) )
            // InternalTgfi.g:1375:1: ( ( rule__Profile__NameAssignment_1 ) )
            {
            // InternalTgfi.g:1375:1: ( ( rule__Profile__NameAssignment_1 ) )
            // InternalTgfi.g:1376:2: ( rule__Profile__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProfileAccess().getNameAssignment_1()); 
            }
            // InternalTgfi.g:1377:2: ( rule__Profile__NameAssignment_1 )
            // InternalTgfi.g:1377:3: rule__Profile__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Profile__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProfileAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__Group__1__Impl"


    // $ANTLR start "rule__Profile__Group__2"
    // InternalTgfi.g:1385:1: rule__Profile__Group__2 : rule__Profile__Group__2__Impl rule__Profile__Group__3 ;
    public final void rule__Profile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1389:1: ( rule__Profile__Group__2__Impl rule__Profile__Group__3 )
            // InternalTgfi.g:1390:2: rule__Profile__Group__2__Impl rule__Profile__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Profile__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Profile__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__Group__2"


    // $ANTLR start "rule__Profile__Group__2__Impl"
    // InternalTgfi.g:1397:1: rule__Profile__Group__2__Impl : ( '{' ) ;
    public final void rule__Profile__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1401:1: ( ( '{' ) )
            // InternalTgfi.g:1402:1: ( '{' )
            {
            // InternalTgfi.g:1402:1: ( '{' )
            // InternalTgfi.g:1403:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProfileAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,13,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProfileAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__Group__2__Impl"


    // $ANTLR start "rule__Profile__Group__3"
    // InternalTgfi.g:1412:1: rule__Profile__Group__3 : rule__Profile__Group__3__Impl rule__Profile__Group__4 ;
    public final void rule__Profile__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1416:1: ( rule__Profile__Group__3__Impl rule__Profile__Group__4 )
            // InternalTgfi.g:1417:2: rule__Profile__Group__3__Impl rule__Profile__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Profile__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Profile__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__Group__3"


    // $ANTLR start "rule__Profile__Group__3__Impl"
    // InternalTgfi.g:1424:1: rule__Profile__Group__3__Impl : ( ( rule__Profile__Group_3__0 )? ) ;
    public final void rule__Profile__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1428:1: ( ( ( rule__Profile__Group_3__0 )? ) )
            // InternalTgfi.g:1429:1: ( ( rule__Profile__Group_3__0 )? )
            {
            // InternalTgfi.g:1429:1: ( ( rule__Profile__Group_3__0 )? )
            // InternalTgfi.g:1430:2: ( rule__Profile__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProfileAccess().getGroup_3()); 
            }
            // InternalTgfi.g:1431:2: ( rule__Profile__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==17) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalTgfi.g:1431:3: rule__Profile__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Profile__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProfileAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__Group__3__Impl"


    // $ANTLR start "rule__Profile__Group__4"
    // InternalTgfi.g:1439:1: rule__Profile__Group__4 : rule__Profile__Group__4__Impl rule__Profile__Group__5 ;
    public final void rule__Profile__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1443:1: ( rule__Profile__Group__4__Impl rule__Profile__Group__5 )
            // InternalTgfi.g:1444:2: rule__Profile__Group__4__Impl rule__Profile__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__Profile__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Profile__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__Group__4"


    // $ANTLR start "rule__Profile__Group__4__Impl"
    // InternalTgfi.g:1451:1: rule__Profile__Group__4__Impl : ( ( rule__Profile__Group_4__0 )? ) ;
    public final void rule__Profile__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1455:1: ( ( ( rule__Profile__Group_4__0 )? ) )
            // InternalTgfi.g:1456:1: ( ( rule__Profile__Group_4__0 )? )
            {
            // InternalTgfi.g:1456:1: ( ( rule__Profile__Group_4__0 )? )
            // InternalTgfi.g:1457:2: ( rule__Profile__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProfileAccess().getGroup_4()); 
            }
            // InternalTgfi.g:1458:2: ( rule__Profile__Group_4__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==29) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalTgfi.g:1458:3: rule__Profile__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Profile__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProfileAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__Group__4__Impl"


    // $ANTLR start "rule__Profile__Group__5"
    // InternalTgfi.g:1466:1: rule__Profile__Group__5 : rule__Profile__Group__5__Impl rule__Profile__Group__6 ;
    public final void rule__Profile__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1470:1: ( rule__Profile__Group__5__Impl rule__Profile__Group__6 )
            // InternalTgfi.g:1471:2: rule__Profile__Group__5__Impl rule__Profile__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__Profile__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Profile__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__Group__5"


    // $ANTLR start "rule__Profile__Group__5__Impl"
    // InternalTgfi.g:1478:1: rule__Profile__Group__5__Impl : ( ( rule__Profile__Group_5__0 )? ) ;
    public final void rule__Profile__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1482:1: ( ( ( rule__Profile__Group_5__0 )? ) )
            // InternalTgfi.g:1483:1: ( ( rule__Profile__Group_5__0 )? )
            {
            // InternalTgfi.g:1483:1: ( ( rule__Profile__Group_5__0 )? )
            // InternalTgfi.g:1484:2: ( rule__Profile__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProfileAccess().getGroup_5()); 
            }
            // InternalTgfi.g:1485:2: ( rule__Profile__Group_5__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalTgfi.g:1485:3: rule__Profile__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Profile__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProfileAccess().getGroup_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__Group__5__Impl"


    // $ANTLR start "rule__Profile__Group__6"
    // InternalTgfi.g:1493:1: rule__Profile__Group__6 : rule__Profile__Group__6__Impl rule__Profile__Group__7 ;
    public final void rule__Profile__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1497:1: ( rule__Profile__Group__6__Impl rule__Profile__Group__7 )
            // InternalTgfi.g:1498:2: rule__Profile__Group__6__Impl rule__Profile__Group__7
            {
            pushFollow(FOLLOW_13);
            rule__Profile__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Profile__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__Group__6"


    // $ANTLR start "rule__Profile__Group__6__Impl"
    // InternalTgfi.g:1505:1: rule__Profile__Group__6__Impl : ( ( rule__Profile__Group_6__0 )? ) ;
    public final void rule__Profile__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1509:1: ( ( ( rule__Profile__Group_6__0 )? ) )
            // InternalTgfi.g:1510:1: ( ( rule__Profile__Group_6__0 )? )
            {
            // InternalTgfi.g:1510:1: ( ( rule__Profile__Group_6__0 )? )
            // InternalTgfi.g:1511:2: ( rule__Profile__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProfileAccess().getGroup_6()); 
            }
            // InternalTgfi.g:1512:2: ( rule__Profile__Group_6__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==31) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalTgfi.g:1512:3: rule__Profile__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Profile__Group_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProfileAccess().getGroup_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__Group__6__Impl"


    // $ANTLR start "rule__Profile__Group__7"
    // InternalTgfi.g:1520:1: rule__Profile__Group__7 : rule__Profile__Group__7__Impl rule__Profile__Group__8 ;
    public final void rule__Profile__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1524:1: ( rule__Profile__Group__7__Impl rule__Profile__Group__8 )
            // InternalTgfi.g:1525:2: rule__Profile__Group__7__Impl rule__Profile__Group__8
            {
            pushFollow(FOLLOW_3);
            rule__Profile__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Profile__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__Group__7"


    // $ANTLR start "rule__Profile__Group__7__Impl"
    // InternalTgfi.g:1532:1: rule__Profile__Group__7__Impl : ( 'actors:' ) ;
    public final void rule__Profile__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1536:1: ( ( 'actors:' ) )
            // InternalTgfi.g:1537:1: ( 'actors:' )
            {
            // InternalTgfi.g:1537:1: ( 'actors:' )
            // InternalTgfi.g:1538:2: 'actors:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProfileAccess().getActorsKeyword_7()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProfileAccess().getActorsKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__Group__7__Impl"


    // $ANTLR start "rule__Profile__Group__8"
    // InternalTgfi.g:1547:1: rule__Profile__Group__8 : rule__Profile__Group__8__Impl rule__Profile__Group__9 ;
    public final void rule__Profile__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1551:1: ( rule__Profile__Group__8__Impl rule__Profile__Group__9 )
            // InternalTgfi.g:1552:2: rule__Profile__Group__8__Impl rule__Profile__Group__9
            {
            pushFollow(FOLLOW_14);
            rule__Profile__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Profile__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__Group__8"


    // $ANTLR start "rule__Profile__Group__8__Impl"
    // InternalTgfi.g:1559:1: rule__Profile__Group__8__Impl : ( ( ( rule__Profile__ActorAssignment_8 ) ) ( ( rule__Profile__ActorAssignment_8 )* ) ) ;
    public final void rule__Profile__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1563:1: ( ( ( ( rule__Profile__ActorAssignment_8 ) ) ( ( rule__Profile__ActorAssignment_8 )* ) ) )
            // InternalTgfi.g:1564:1: ( ( ( rule__Profile__ActorAssignment_8 ) ) ( ( rule__Profile__ActorAssignment_8 )* ) )
            {
            // InternalTgfi.g:1564:1: ( ( ( rule__Profile__ActorAssignment_8 ) ) ( ( rule__Profile__ActorAssignment_8 )* ) )
            // InternalTgfi.g:1565:2: ( ( rule__Profile__ActorAssignment_8 ) ) ( ( rule__Profile__ActorAssignment_8 )* )
            {
            // InternalTgfi.g:1565:2: ( ( rule__Profile__ActorAssignment_8 ) )
            // InternalTgfi.g:1566:3: ( rule__Profile__ActorAssignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProfileAccess().getActorAssignment_8()); 
            }
            // InternalTgfi.g:1567:3: ( rule__Profile__ActorAssignment_8 )
            // InternalTgfi.g:1567:4: rule__Profile__ActorAssignment_8
            {
            pushFollow(FOLLOW_15);
            rule__Profile__ActorAssignment_8();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProfileAccess().getActorAssignment_8()); 
            }

            }

            // InternalTgfi.g:1570:2: ( ( rule__Profile__ActorAssignment_8 )* )
            // InternalTgfi.g:1571:3: ( rule__Profile__ActorAssignment_8 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProfileAccess().getActorAssignment_8()); 
            }
            // InternalTgfi.g:1572:3: ( rule__Profile__ActorAssignment_8 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_STRING) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalTgfi.g:1572:4: rule__Profile__ActorAssignment_8
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Profile__ActorAssignment_8();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProfileAccess().getActorAssignment_8()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__Group__8__Impl"


    // $ANTLR start "rule__Profile__Group__9"
    // InternalTgfi.g:1581:1: rule__Profile__Group__9 : rule__Profile__Group__9__Impl rule__Profile__Group__10 ;
    public final void rule__Profile__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1585:1: ( rule__Profile__Group__9__Impl rule__Profile__Group__10 )
            // InternalTgfi.g:1586:2: rule__Profile__Group__9__Impl rule__Profile__Group__10
            {
            pushFollow(FOLLOW_16);
            rule__Profile__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Profile__Group__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__Group__9"


    // $ANTLR start "rule__Profile__Group__9__Impl"
    // InternalTgfi.g:1593:1: rule__Profile__Group__9__Impl : ( 'transactions:' ) ;
    public final void rule__Profile__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1597:1: ( ( 'transactions:' ) )
            // InternalTgfi.g:1598:1: ( 'transactions:' )
            {
            // InternalTgfi.g:1598:1: ( 'transactions:' )
            // InternalTgfi.g:1599:2: 'transactions:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProfileAccess().getTransactionsKeyword_9()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProfileAccess().getTransactionsKeyword_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__Group__9__Impl"


    // $ANTLR start "rule__Profile__Group__10"
    // InternalTgfi.g:1608:1: rule__Profile__Group__10 : rule__Profile__Group__10__Impl rule__Profile__Group__11 ;
    public final void rule__Profile__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1612:1: ( rule__Profile__Group__10__Impl rule__Profile__Group__11 )
            // InternalTgfi.g:1613:2: rule__Profile__Group__10__Impl rule__Profile__Group__11
            {
            pushFollow(FOLLOW_16);
            rule__Profile__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Profile__Group__11();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__Group__10"


    // $ANTLR start "rule__Profile__Group__10__Impl"
    // InternalTgfi.g:1620:1: rule__Profile__Group__10__Impl : ( ( rule__Profile__TransactionAssignment_10 )* ) ;
    public final void rule__Profile__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1624:1: ( ( ( rule__Profile__TransactionAssignment_10 )* ) )
            // InternalTgfi.g:1625:1: ( ( rule__Profile__TransactionAssignment_10 )* )
            {
            // InternalTgfi.g:1625:1: ( ( rule__Profile__TransactionAssignment_10 )* )
            // InternalTgfi.g:1626:2: ( rule__Profile__TransactionAssignment_10 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProfileAccess().getTransactionAssignment_10()); 
            }
            // InternalTgfi.g:1627:2: ( rule__Profile__TransactionAssignment_10 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==38) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalTgfi.g:1627:3: rule__Profile__TransactionAssignment_10
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Profile__TransactionAssignment_10();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProfileAccess().getTransactionAssignment_10()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__Group__10__Impl"


    // $ANTLR start "rule__Profile__Group__11"
    // InternalTgfi.g:1635:1: rule__Profile__Group__11 : rule__Profile__Group__11__Impl rule__Profile__Group__12 ;
    public final void rule__Profile__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1639:1: ( rule__Profile__Group__11__Impl rule__Profile__Group__12 )
            // InternalTgfi.g:1640:2: rule__Profile__Group__11__Impl rule__Profile__Group__12
            {
            pushFollow(FOLLOW_18);
            rule__Profile__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Profile__Group__12();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__Group__11"


    // $ANTLR start "rule__Profile__Group__11__Impl"
    // InternalTgfi.g:1647:1: rule__Profile__Group__11__Impl : ( 'domains:' ) ;
    public final void rule__Profile__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1651:1: ( ( 'domains:' ) )
            // InternalTgfi.g:1652:1: ( 'domains:' )
            {
            // InternalTgfi.g:1652:1: ( 'domains:' )
            // InternalTgfi.g:1653:2: 'domains:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProfileAccess().getDomainsKeyword_11()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProfileAccess().getDomainsKeyword_11()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__Group__11__Impl"


    // $ANTLR start "rule__Profile__Group__12"
    // InternalTgfi.g:1662:1: rule__Profile__Group__12 : rule__Profile__Group__12__Impl rule__Profile__Group__13 ;
    public final void rule__Profile__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1666:1: ( rule__Profile__Group__12__Impl rule__Profile__Group__13 )
            // InternalTgfi.g:1667:2: rule__Profile__Group__12__Impl rule__Profile__Group__13
            {
            pushFollow(FOLLOW_18);
            rule__Profile__Group__12__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Profile__Group__13();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__Group__12"


    // $ANTLR start "rule__Profile__Group__12__Impl"
    // InternalTgfi.g:1674:1: rule__Profile__Group__12__Impl : ( ( rule__Profile__DomainAssignment_12 )* ) ;
    public final void rule__Profile__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1678:1: ( ( ( rule__Profile__DomainAssignment_12 )* ) )
            // InternalTgfi.g:1679:1: ( ( rule__Profile__DomainAssignment_12 )* )
            {
            // InternalTgfi.g:1679:1: ( ( rule__Profile__DomainAssignment_12 )* )
            // InternalTgfi.g:1680:2: ( rule__Profile__DomainAssignment_12 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProfileAccess().getDomainAssignment_12()); 
            }
            // InternalTgfi.g:1681:2: ( rule__Profile__DomainAssignment_12 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_STRING) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalTgfi.g:1681:3: rule__Profile__DomainAssignment_12
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Profile__DomainAssignment_12();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProfileAccess().getDomainAssignment_12()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__Group__12__Impl"


    // $ANTLR start "rule__Profile__Group__13"
    // InternalTgfi.g:1689:1: rule__Profile__Group__13 : rule__Profile__Group__13__Impl rule__Profile__Group__14 ;
    public final void rule__Profile__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1693:1: ( rule__Profile__Group__13__Impl rule__Profile__Group__14 )
            // InternalTgfi.g:1694:2: rule__Profile__Group__13__Impl rule__Profile__Group__14
            {
            pushFollow(FOLLOW_19);
            rule__Profile__Group__13__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Profile__Group__14();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__Group__13"


    // $ANTLR start "rule__Profile__Group__13__Impl"
    // InternalTgfi.g:1701:1: rule__Profile__Group__13__Impl : ( 'quality_attributes:' ) ;
    public final void rule__Profile__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1705:1: ( ( 'quality_attributes:' ) )
            // InternalTgfi.g:1706:1: ( 'quality_attributes:' )
            {
            // InternalTgfi.g:1706:1: ( 'quality_attributes:' )
            // InternalTgfi.g:1707:2: 'quality_attributes:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProfileAccess().getQuality_attributesKeyword_13()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProfileAccess().getQuality_attributesKeyword_13()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__Group__13__Impl"


    // $ANTLR start "rule__Profile__Group__14"
    // InternalTgfi.g:1716:1: rule__Profile__Group__14 : rule__Profile__Group__14__Impl rule__Profile__Group__15 ;
    public final void rule__Profile__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1720:1: ( rule__Profile__Group__14__Impl rule__Profile__Group__15 )
            // InternalTgfi.g:1721:2: rule__Profile__Group__14__Impl rule__Profile__Group__15
            {
            pushFollow(FOLLOW_19);
            rule__Profile__Group__14__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Profile__Group__15();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__Group__14"


    // $ANTLR start "rule__Profile__Group__14__Impl"
    // InternalTgfi.g:1728:1: rule__Profile__Group__14__Impl : ( ( rule__Profile__QualityattrAssignment_14 )* ) ;
    public final void rule__Profile__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1732:1: ( ( ( rule__Profile__QualityattrAssignment_14 )* ) )
            // InternalTgfi.g:1733:1: ( ( rule__Profile__QualityattrAssignment_14 )* )
            {
            // InternalTgfi.g:1733:1: ( ( rule__Profile__QualityattrAssignment_14 )* )
            // InternalTgfi.g:1734:2: ( rule__Profile__QualityattrAssignment_14 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProfileAccess().getQualityattrAssignment_14()); 
            }
            // InternalTgfi.g:1735:2: ( rule__Profile__QualityattrAssignment_14 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalTgfi.g:1735:3: rule__Profile__QualityattrAssignment_14
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Profile__QualityattrAssignment_14();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProfileAccess().getQualityattrAssignment_14()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__Group__14__Impl"


    // $ANTLR start "rule__Profile__Group__15"
    // InternalTgfi.g:1743:1: rule__Profile__Group__15 : rule__Profile__Group__15__Impl rule__Profile__Group__16 ;
    public final void rule__Profile__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1747:1: ( rule__Profile__Group__15__Impl rule__Profile__Group__16 )
            // InternalTgfi.g:1748:2: rule__Profile__Group__15__Impl rule__Profile__Group__16
            {
            pushFollow(FOLLOW_20);
            rule__Profile__Group__15__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Profile__Group__16();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__Group__15"


    // $ANTLR start "rule__Profile__Group__15__Impl"
    // InternalTgfi.g:1755:1: rule__Profile__Group__15__Impl : ( 'quality_securityrequirements:' ) ;
    public final void rule__Profile__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1759:1: ( ( 'quality_securityrequirements:' ) )
            // InternalTgfi.g:1760:1: ( 'quality_securityrequirements:' )
            {
            // InternalTgfi.g:1760:1: ( 'quality_securityrequirements:' )
            // InternalTgfi.g:1761:2: 'quality_securityrequirements:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProfileAccess().getQuality_securityrequirementsKeyword_15()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProfileAccess().getQuality_securityrequirementsKeyword_15()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__Group__15__Impl"


    // $ANTLR start "rule__Profile__Group__16"
    // InternalTgfi.g:1770:1: rule__Profile__Group__16 : rule__Profile__Group__16__Impl rule__Profile__Group__17 ;
    public final void rule__Profile__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1774:1: ( rule__Profile__Group__16__Impl rule__Profile__Group__17 )
            // InternalTgfi.g:1775:2: rule__Profile__Group__16__Impl rule__Profile__Group__17
            {
            pushFollow(FOLLOW_20);
            rule__Profile__Group__16__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Profile__Group__17();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__Group__16"


    // $ANTLR start "rule__Profile__Group__16__Impl"
    // InternalTgfi.g:1782:1: rule__Profile__Group__16__Impl : ( ( rule__Profile__SecreAssignment_16 )* ) ;
    public final void rule__Profile__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1786:1: ( ( ( rule__Profile__SecreAssignment_16 )* ) )
            // InternalTgfi.g:1787:1: ( ( rule__Profile__SecreAssignment_16 )* )
            {
            // InternalTgfi.g:1787:1: ( ( rule__Profile__SecreAssignment_16 )* )
            // InternalTgfi.g:1788:2: ( rule__Profile__SecreAssignment_16 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProfileAccess().getSecreAssignment_16()); 
            }
            // InternalTgfi.g:1789:2: ( rule__Profile__SecreAssignment_16 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==13) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalTgfi.g:1789:3: rule__Profile__SecreAssignment_16
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Profile__SecreAssignment_16();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProfileAccess().getSecreAssignment_16()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__Group__16__Impl"


    // $ANTLR start "rule__Profile__Group__17"
    // InternalTgfi.g:1797:1: rule__Profile__Group__17 : rule__Profile__Group__17__Impl ;
    public final void rule__Profile__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1801:1: ( rule__Profile__Group__17__Impl )
            // InternalTgfi.g:1802:2: rule__Profile__Group__17__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Profile__Group__17__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__Group__17"


    // $ANTLR start "rule__Profile__Group__17__Impl"
    // InternalTgfi.g:1808:1: rule__Profile__Group__17__Impl : ( '}' ) ;
    public final void rule__Profile__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1812:1: ( ( '}' ) )
            // InternalTgfi.g:1813:1: ( '}' )
            {
            // InternalTgfi.g:1813:1: ( '}' )
            // InternalTgfi.g:1814:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProfileAccess().getRightCurlyBracketKeyword_17()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProfileAccess().getRightCurlyBracketKeyword_17()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__Group__17__Impl"


    // $ANTLR start "rule__Profile__Group_3__0"
    // InternalTgfi.g:1824:1: rule__Profile__Group_3__0 : rule__Profile__Group_3__0__Impl rule__Profile__Group_3__1 ;
    public final void rule__Profile__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1828:1: ( rule__Profile__Group_3__0__Impl rule__Profile__Group_3__1 )
            // InternalTgfi.g:1829:2: rule__Profile__Group_3__0__Impl rule__Profile__Group_3__1
            {
            pushFollow(FOLLOW_10);
            rule__Profile__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Profile__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__Group_3__0"


    // $ANTLR start "rule__Profile__Group_3__0__Impl"
    // InternalTgfi.g:1836:1: rule__Profile__Group_3__0__Impl : ( 'Name' ) ;
    public final void rule__Profile__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1840:1: ( ( 'Name' ) )
            // InternalTgfi.g:1841:1: ( 'Name' )
            {
            // InternalTgfi.g:1841:1: ( 'Name' )
            // InternalTgfi.g:1842:2: 'Name'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProfileAccess().getNameKeyword_3_0()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProfileAccess().getNameKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__Group_3__0__Impl"


    // $ANTLR start "rule__Profile__Group_3__1"
    // InternalTgfi.g:1851:1: rule__Profile__Group_3__1 : rule__Profile__Group_3__1__Impl rule__Profile__Group_3__2 ;
    public final void rule__Profile__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1855:1: ( rule__Profile__Group_3__1__Impl rule__Profile__Group_3__2 )
            // InternalTgfi.g:1856:2: rule__Profile__Group_3__1__Impl rule__Profile__Group_3__2
            {
            pushFollow(FOLLOW_3);
            rule__Profile__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Profile__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__Group_3__1"


    // $ANTLR start "rule__Profile__Group_3__1__Impl"
    // InternalTgfi.g:1863:1: rule__Profile__Group_3__1__Impl : ( ':' ) ;
    public final void rule__Profile__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1867:1: ( ( ':' ) )
            // InternalTgfi.g:1868:1: ( ':' )
            {
            // InternalTgfi.g:1868:1: ( ':' )
            // InternalTgfi.g:1869:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProfileAccess().getColonKeyword_3_1()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProfileAccess().getColonKeyword_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__Group_3__1__Impl"


    // $ANTLR start "rule__Profile__Group_3__2"
    // InternalTgfi.g:1878:1: rule__Profile__Group_3__2 : rule__Profile__Group_3__2__Impl ;
    public final void rule__Profile__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1882:1: ( rule__Profile__Group_3__2__Impl )
            // InternalTgfi.g:1883:2: rule__Profile__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Profile__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__Group_3__2"


    // $ANTLR start "rule__Profile__Group_3__2__Impl"
    // InternalTgfi.g:1889:1: rule__Profile__Group_3__2__Impl : ( ( rule__Profile__ProfNameAssignment_3_2 ) ) ;
    public final void rule__Profile__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1893:1: ( ( ( rule__Profile__ProfNameAssignment_3_2 ) ) )
            // InternalTgfi.g:1894:1: ( ( rule__Profile__ProfNameAssignment_3_2 ) )
            {
            // InternalTgfi.g:1894:1: ( ( rule__Profile__ProfNameAssignment_3_2 ) )
            // InternalTgfi.g:1895:2: ( rule__Profile__ProfNameAssignment_3_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProfileAccess().getProfNameAssignment_3_2()); 
            }
            // InternalTgfi.g:1896:2: ( rule__Profile__ProfNameAssignment_3_2 )
            // InternalTgfi.g:1896:3: rule__Profile__ProfNameAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Profile__ProfNameAssignment_3_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProfileAccess().getProfNameAssignment_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__Group_3__2__Impl"


    // $ANTLR start "rule__Profile__Group_4__0"
    // InternalTgfi.g:1905:1: rule__Profile__Group_4__0 : rule__Profile__Group_4__0__Impl rule__Profile__Group_4__1 ;
    public final void rule__Profile__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1909:1: ( rule__Profile__Group_4__0__Impl rule__Profile__Group_4__1 )
            // InternalTgfi.g:1910:2: rule__Profile__Group_4__0__Impl rule__Profile__Group_4__1
            {
            pushFollow(FOLLOW_10);
            rule__Profile__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Profile__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__Group_4__0"


    // $ANTLR start "rule__Profile__Group_4__0__Impl"
    // InternalTgfi.g:1917:1: rule__Profile__Group_4__0__Impl : ( 'Description' ) ;
    public final void rule__Profile__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1921:1: ( ( 'Description' ) )
            // InternalTgfi.g:1922:1: ( 'Description' )
            {
            // InternalTgfi.g:1922:1: ( 'Description' )
            // InternalTgfi.g:1923:2: 'Description'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProfileAccess().getDescriptionKeyword_4_0()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProfileAccess().getDescriptionKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__Group_4__0__Impl"


    // $ANTLR start "rule__Profile__Group_4__1"
    // InternalTgfi.g:1932:1: rule__Profile__Group_4__1 : rule__Profile__Group_4__1__Impl rule__Profile__Group_4__2 ;
    public final void rule__Profile__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1936:1: ( rule__Profile__Group_4__1__Impl rule__Profile__Group_4__2 )
            // InternalTgfi.g:1937:2: rule__Profile__Group_4__1__Impl rule__Profile__Group_4__2
            {
            pushFollow(FOLLOW_3);
            rule__Profile__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Profile__Group_4__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__Group_4__1"


    // $ANTLR start "rule__Profile__Group_4__1__Impl"
    // InternalTgfi.g:1944:1: rule__Profile__Group_4__1__Impl : ( ':' ) ;
    public final void rule__Profile__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1948:1: ( ( ':' ) )
            // InternalTgfi.g:1949:1: ( ':' )
            {
            // InternalTgfi.g:1949:1: ( ':' )
            // InternalTgfi.g:1950:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProfileAccess().getColonKeyword_4_1()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProfileAccess().getColonKeyword_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__Group_4__1__Impl"


    // $ANTLR start "rule__Profile__Group_4__2"
    // InternalTgfi.g:1959:1: rule__Profile__Group_4__2 : rule__Profile__Group_4__2__Impl ;
    public final void rule__Profile__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1963:1: ( rule__Profile__Group_4__2__Impl )
            // InternalTgfi.g:1964:2: rule__Profile__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Profile__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__Group_4__2"


    // $ANTLR start "rule__Profile__Group_4__2__Impl"
    // InternalTgfi.g:1970:1: rule__Profile__Group_4__2__Impl : ( ( rule__Profile__DescrNameAssignment_4_2 ) ) ;
    public final void rule__Profile__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1974:1: ( ( ( rule__Profile__DescrNameAssignment_4_2 ) ) )
            // InternalTgfi.g:1975:1: ( ( rule__Profile__DescrNameAssignment_4_2 ) )
            {
            // InternalTgfi.g:1975:1: ( ( rule__Profile__DescrNameAssignment_4_2 ) )
            // InternalTgfi.g:1976:2: ( rule__Profile__DescrNameAssignment_4_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProfileAccess().getDescrNameAssignment_4_2()); 
            }
            // InternalTgfi.g:1977:2: ( rule__Profile__DescrNameAssignment_4_2 )
            // InternalTgfi.g:1977:3: rule__Profile__DescrNameAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Profile__DescrNameAssignment_4_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProfileAccess().getDescrNameAssignment_4_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__Group_4__2__Impl"


    // $ANTLR start "rule__Profile__Group_5__0"
    // InternalTgfi.g:1986:1: rule__Profile__Group_5__0 : rule__Profile__Group_5__0__Impl rule__Profile__Group_5__1 ;
    public final void rule__Profile__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1990:1: ( rule__Profile__Group_5__0__Impl rule__Profile__Group_5__1 )
            // InternalTgfi.g:1991:2: rule__Profile__Group_5__0__Impl rule__Profile__Group_5__1
            {
            pushFollow(FOLLOW_10);
            rule__Profile__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Profile__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__Group_5__0"


    // $ANTLR start "rule__Profile__Group_5__0__Impl"
    // InternalTgfi.g:1998:1: rule__Profile__Group_5__0__Impl : ( 'Features' ) ;
    public final void rule__Profile__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2002:1: ( ( 'Features' ) )
            // InternalTgfi.g:2003:1: ( 'Features' )
            {
            // InternalTgfi.g:2003:1: ( 'Features' )
            // InternalTgfi.g:2004:2: 'Features'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProfileAccess().getFeaturesKeyword_5_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProfileAccess().getFeaturesKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__Group_5__0__Impl"


    // $ANTLR start "rule__Profile__Group_5__1"
    // InternalTgfi.g:2013:1: rule__Profile__Group_5__1 : rule__Profile__Group_5__1__Impl rule__Profile__Group_5__2 ;
    public final void rule__Profile__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2017:1: ( rule__Profile__Group_5__1__Impl rule__Profile__Group_5__2 )
            // InternalTgfi.g:2018:2: rule__Profile__Group_5__1__Impl rule__Profile__Group_5__2
            {
            pushFollow(FOLLOW_3);
            rule__Profile__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Profile__Group_5__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__Group_5__1"


    // $ANTLR start "rule__Profile__Group_5__1__Impl"
    // InternalTgfi.g:2025:1: rule__Profile__Group_5__1__Impl : ( ':' ) ;
    public final void rule__Profile__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2029:1: ( ( ':' ) )
            // InternalTgfi.g:2030:1: ( ':' )
            {
            // InternalTgfi.g:2030:1: ( ':' )
            // InternalTgfi.g:2031:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProfileAccess().getColonKeyword_5_1()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProfileAccess().getColonKeyword_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__Group_5__1__Impl"


    // $ANTLR start "rule__Profile__Group_5__2"
    // InternalTgfi.g:2040:1: rule__Profile__Group_5__2 : rule__Profile__Group_5__2__Impl ;
    public final void rule__Profile__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2044:1: ( rule__Profile__Group_5__2__Impl )
            // InternalTgfi.g:2045:2: rule__Profile__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Profile__Group_5__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__Group_5__2"


    // $ANTLR start "rule__Profile__Group_5__2__Impl"
    // InternalTgfi.g:2051:1: rule__Profile__Group_5__2__Impl : ( ( rule__Profile__FeatNameAssignment_5_2 ) ) ;
    public final void rule__Profile__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2055:1: ( ( ( rule__Profile__FeatNameAssignment_5_2 ) ) )
            // InternalTgfi.g:2056:1: ( ( rule__Profile__FeatNameAssignment_5_2 ) )
            {
            // InternalTgfi.g:2056:1: ( ( rule__Profile__FeatNameAssignment_5_2 ) )
            // InternalTgfi.g:2057:2: ( rule__Profile__FeatNameAssignment_5_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProfileAccess().getFeatNameAssignment_5_2()); 
            }
            // InternalTgfi.g:2058:2: ( rule__Profile__FeatNameAssignment_5_2 )
            // InternalTgfi.g:2058:3: rule__Profile__FeatNameAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Profile__FeatNameAssignment_5_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProfileAccess().getFeatNameAssignment_5_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__Group_5__2__Impl"


    // $ANTLR start "rule__Profile__Group_6__0"
    // InternalTgfi.g:2067:1: rule__Profile__Group_6__0 : rule__Profile__Group_6__0__Impl rule__Profile__Group_6__1 ;
    public final void rule__Profile__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2071:1: ( rule__Profile__Group_6__0__Impl rule__Profile__Group_6__1 )
            // InternalTgfi.g:2072:2: rule__Profile__Group_6__0__Impl rule__Profile__Group_6__1
            {
            pushFollow(FOLLOW_10);
            rule__Profile__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Profile__Group_6__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__Group_6__0"


    // $ANTLR start "rule__Profile__Group_6__0__Impl"
    // InternalTgfi.g:2079:1: rule__Profile__Group_6__0__Impl : ( 'Function' ) ;
    public final void rule__Profile__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2083:1: ( ( 'Function' ) )
            // InternalTgfi.g:2084:1: ( 'Function' )
            {
            // InternalTgfi.g:2084:1: ( 'Function' )
            // InternalTgfi.g:2085:2: 'Function'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProfileAccess().getFunctionKeyword_6_0()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProfileAccess().getFunctionKeyword_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__Group_6__0__Impl"


    // $ANTLR start "rule__Profile__Group_6__1"
    // InternalTgfi.g:2094:1: rule__Profile__Group_6__1 : rule__Profile__Group_6__1__Impl rule__Profile__Group_6__2 ;
    public final void rule__Profile__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2098:1: ( rule__Profile__Group_6__1__Impl rule__Profile__Group_6__2 )
            // InternalTgfi.g:2099:2: rule__Profile__Group_6__1__Impl rule__Profile__Group_6__2
            {
            pushFollow(FOLLOW_3);
            rule__Profile__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Profile__Group_6__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__Group_6__1"


    // $ANTLR start "rule__Profile__Group_6__1__Impl"
    // InternalTgfi.g:2106:1: rule__Profile__Group_6__1__Impl : ( ':' ) ;
    public final void rule__Profile__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2110:1: ( ( ':' ) )
            // InternalTgfi.g:2111:1: ( ':' )
            {
            // InternalTgfi.g:2111:1: ( ':' )
            // InternalTgfi.g:2112:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProfileAccess().getColonKeyword_6_1()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProfileAccess().getColonKeyword_6_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__Group_6__1__Impl"


    // $ANTLR start "rule__Profile__Group_6__2"
    // InternalTgfi.g:2121:1: rule__Profile__Group_6__2 : rule__Profile__Group_6__2__Impl ;
    public final void rule__Profile__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2125:1: ( rule__Profile__Group_6__2__Impl )
            // InternalTgfi.g:2126:2: rule__Profile__Group_6__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Profile__Group_6__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__Group_6__2"


    // $ANTLR start "rule__Profile__Group_6__2__Impl"
    // InternalTgfi.g:2132:1: rule__Profile__Group_6__2__Impl : ( ( rule__Profile__FunctionNameAssignment_6_2 ) ) ;
    public final void rule__Profile__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2136:1: ( ( ( rule__Profile__FunctionNameAssignment_6_2 ) ) )
            // InternalTgfi.g:2137:1: ( ( rule__Profile__FunctionNameAssignment_6_2 ) )
            {
            // InternalTgfi.g:2137:1: ( ( rule__Profile__FunctionNameAssignment_6_2 ) )
            // InternalTgfi.g:2138:2: ( rule__Profile__FunctionNameAssignment_6_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProfileAccess().getFunctionNameAssignment_6_2()); 
            }
            // InternalTgfi.g:2139:2: ( rule__Profile__FunctionNameAssignment_6_2 )
            // InternalTgfi.g:2139:3: rule__Profile__FunctionNameAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__Profile__FunctionNameAssignment_6_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProfileAccess().getFunctionNameAssignment_6_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__Group_6__2__Impl"


    // $ANTLR start "rule__SecRequirements__Group__0"
    // InternalTgfi.g:2148:1: rule__SecRequirements__Group__0 : rule__SecRequirements__Group__0__Impl rule__SecRequirements__Group__1 ;
    public final void rule__SecRequirements__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2152:1: ( rule__SecRequirements__Group__0__Impl rule__SecRequirements__Group__1 )
            // InternalTgfi.g:2153:2: rule__SecRequirements__Group__0__Impl rule__SecRequirements__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__SecRequirements__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SecRequirements__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecRequirements__Group__0"


    // $ANTLR start "rule__SecRequirements__Group__0__Impl"
    // InternalTgfi.g:2160:1: rule__SecRequirements__Group__0__Impl : ( '{' ) ;
    public final void rule__SecRequirements__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2164:1: ( ( '{' ) )
            // InternalTgfi.g:2165:1: ( '{' )
            {
            // InternalTgfi.g:2165:1: ( '{' )
            // InternalTgfi.g:2166:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSecRequirementsAccess().getLeftCurlyBracketKeyword_0()); 
            }
            match(input,13,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSecRequirementsAccess().getLeftCurlyBracketKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecRequirements__Group__0__Impl"


    // $ANTLR start "rule__SecRequirements__Group__1"
    // InternalTgfi.g:2175:1: rule__SecRequirements__Group__1 : rule__SecRequirements__Group__1__Impl rule__SecRequirements__Group__2 ;
    public final void rule__SecRequirements__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2179:1: ( rule__SecRequirements__Group__1__Impl rule__SecRequirements__Group__2 )
            // InternalTgfi.g:2180:2: rule__SecRequirements__Group__1__Impl rule__SecRequirements__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__SecRequirements__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SecRequirements__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecRequirements__Group__1"


    // $ANTLR start "rule__SecRequirements__Group__1__Impl"
    // InternalTgfi.g:2187:1: rule__SecRequirements__Group__1__Impl : ( ( rule__SecRequirements__Group_1__0 )? ) ;
    public final void rule__SecRequirements__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2191:1: ( ( ( rule__SecRequirements__Group_1__0 )? ) )
            // InternalTgfi.g:2192:1: ( ( rule__SecRequirements__Group_1__0 )? )
            {
            // InternalTgfi.g:2192:1: ( ( rule__SecRequirements__Group_1__0 )? )
            // InternalTgfi.g:2193:2: ( rule__SecRequirements__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSecRequirementsAccess().getGroup_1()); 
            }
            // InternalTgfi.g:2194:2: ( rule__SecRequirements__Group_1__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==32) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalTgfi.g:2194:3: rule__SecRequirements__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SecRequirements__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSecRequirementsAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecRequirements__Group__1__Impl"


    // $ANTLR start "rule__SecRequirements__Group__2"
    // InternalTgfi.g:2202:1: rule__SecRequirements__Group__2 : rule__SecRequirements__Group__2__Impl rule__SecRequirements__Group__3 ;
    public final void rule__SecRequirements__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2206:1: ( rule__SecRequirements__Group__2__Impl rule__SecRequirements__Group__3 )
            // InternalTgfi.g:2207:2: rule__SecRequirements__Group__2__Impl rule__SecRequirements__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__SecRequirements__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SecRequirements__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecRequirements__Group__2"


    // $ANTLR start "rule__SecRequirements__Group__2__Impl"
    // InternalTgfi.g:2214:1: rule__SecRequirements__Group__2__Impl : ( ( rule__SecRequirements__Group_2__0 )? ) ;
    public final void rule__SecRequirements__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2218:1: ( ( ( rule__SecRequirements__Group_2__0 )? ) )
            // InternalTgfi.g:2219:1: ( ( rule__SecRequirements__Group_2__0 )? )
            {
            // InternalTgfi.g:2219:1: ( ( rule__SecRequirements__Group_2__0 )? )
            // InternalTgfi.g:2220:2: ( rule__SecRequirements__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSecRequirementsAccess().getGroup_2()); 
            }
            // InternalTgfi.g:2221:2: ( rule__SecRequirements__Group_2__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==33) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalTgfi.g:2221:3: rule__SecRequirements__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SecRequirements__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSecRequirementsAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecRequirements__Group__2__Impl"


    // $ANTLR start "rule__SecRequirements__Group__3"
    // InternalTgfi.g:2229:1: rule__SecRequirements__Group__3 : rule__SecRequirements__Group__3__Impl rule__SecRequirements__Group__4 ;
    public final void rule__SecRequirements__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2233:1: ( rule__SecRequirements__Group__3__Impl rule__SecRequirements__Group__4 )
            // InternalTgfi.g:2234:2: rule__SecRequirements__Group__3__Impl rule__SecRequirements__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__SecRequirements__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SecRequirements__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecRequirements__Group__3"


    // $ANTLR start "rule__SecRequirements__Group__3__Impl"
    // InternalTgfi.g:2241:1: rule__SecRequirements__Group__3__Impl : ( ( rule__SecRequirements__Group_3__0 )? ) ;
    public final void rule__SecRequirements__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2245:1: ( ( ( rule__SecRequirements__Group_3__0 )? ) )
            // InternalTgfi.g:2246:1: ( ( rule__SecRequirements__Group_3__0 )? )
            {
            // InternalTgfi.g:2246:1: ( ( rule__SecRequirements__Group_3__0 )? )
            // InternalTgfi.g:2247:2: ( rule__SecRequirements__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSecRequirementsAccess().getGroup_3()); 
            }
            // InternalTgfi.g:2248:2: ( rule__SecRequirements__Group_3__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==34) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalTgfi.g:2248:3: rule__SecRequirements__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SecRequirements__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSecRequirementsAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecRequirements__Group__3__Impl"


    // $ANTLR start "rule__SecRequirements__Group__4"
    // InternalTgfi.g:2256:1: rule__SecRequirements__Group__4 : rule__SecRequirements__Group__4__Impl rule__SecRequirements__Group__5 ;
    public final void rule__SecRequirements__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2260:1: ( rule__SecRequirements__Group__4__Impl rule__SecRequirements__Group__5 )
            // InternalTgfi.g:2261:2: rule__SecRequirements__Group__4__Impl rule__SecRequirements__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__SecRequirements__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SecRequirements__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecRequirements__Group__4"


    // $ANTLR start "rule__SecRequirements__Group__4__Impl"
    // InternalTgfi.g:2268:1: rule__SecRequirements__Group__4__Impl : ( ( rule__SecRequirements__Group_4__0 )? ) ;
    public final void rule__SecRequirements__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2272:1: ( ( ( rule__SecRequirements__Group_4__0 )? ) )
            // InternalTgfi.g:2273:1: ( ( rule__SecRequirements__Group_4__0 )? )
            {
            // InternalTgfi.g:2273:1: ( ( rule__SecRequirements__Group_4__0 )? )
            // InternalTgfi.g:2274:2: ( rule__SecRequirements__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSecRequirementsAccess().getGroup_4()); 
            }
            // InternalTgfi.g:2275:2: ( rule__SecRequirements__Group_4__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==35) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalTgfi.g:2275:3: rule__SecRequirements__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SecRequirements__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSecRequirementsAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecRequirements__Group__4__Impl"


    // $ANTLR start "rule__SecRequirements__Group__5"
    // InternalTgfi.g:2283:1: rule__SecRequirements__Group__5 : rule__SecRequirements__Group__5__Impl rule__SecRequirements__Group__6 ;
    public final void rule__SecRequirements__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2287:1: ( rule__SecRequirements__Group__5__Impl rule__SecRequirements__Group__6 )
            // InternalTgfi.g:2288:2: rule__SecRequirements__Group__5__Impl rule__SecRequirements__Group__6
            {
            pushFollow(FOLLOW_22);
            rule__SecRequirements__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SecRequirements__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecRequirements__Group__5"


    // $ANTLR start "rule__SecRequirements__Group__5__Impl"
    // InternalTgfi.g:2295:1: rule__SecRequirements__Group__5__Impl : ( ( rule__SecRequirements__Group_5__0 )? ) ;
    public final void rule__SecRequirements__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2299:1: ( ( ( rule__SecRequirements__Group_5__0 )? ) )
            // InternalTgfi.g:2300:1: ( ( rule__SecRequirements__Group_5__0 )? )
            {
            // InternalTgfi.g:2300:1: ( ( rule__SecRequirements__Group_5__0 )? )
            // InternalTgfi.g:2301:2: ( rule__SecRequirements__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSecRequirementsAccess().getGroup_5()); 
            }
            // InternalTgfi.g:2302:2: ( rule__SecRequirements__Group_5__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==36) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalTgfi.g:2302:3: rule__SecRequirements__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SecRequirements__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSecRequirementsAccess().getGroup_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecRequirements__Group__5__Impl"


    // $ANTLR start "rule__SecRequirements__Group__6"
    // InternalTgfi.g:2310:1: rule__SecRequirements__Group__6 : rule__SecRequirements__Group__6__Impl rule__SecRequirements__Group__7 ;
    public final void rule__SecRequirements__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2314:1: ( rule__SecRequirements__Group__6__Impl rule__SecRequirements__Group__7 )
            // InternalTgfi.g:2315:2: rule__SecRequirements__Group__6__Impl rule__SecRequirements__Group__7
            {
            pushFollow(FOLLOW_22);
            rule__SecRequirements__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SecRequirements__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecRequirements__Group__6"


    // $ANTLR start "rule__SecRequirements__Group__6__Impl"
    // InternalTgfi.g:2322:1: rule__SecRequirements__Group__6__Impl : ( ( rule__SecRequirements__Group_6__0 )? ) ;
    public final void rule__SecRequirements__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2326:1: ( ( ( rule__SecRequirements__Group_6__0 )? ) )
            // InternalTgfi.g:2327:1: ( ( rule__SecRequirements__Group_6__0 )? )
            {
            // InternalTgfi.g:2327:1: ( ( rule__SecRequirements__Group_6__0 )? )
            // InternalTgfi.g:2328:2: ( rule__SecRequirements__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSecRequirementsAccess().getGroup_6()); 
            }
            // InternalTgfi.g:2329:2: ( rule__SecRequirements__Group_6__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==37) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalTgfi.g:2329:3: rule__SecRequirements__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SecRequirements__Group_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSecRequirementsAccess().getGroup_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecRequirements__Group__6__Impl"


    // $ANTLR start "rule__SecRequirements__Group__7"
    // InternalTgfi.g:2337:1: rule__SecRequirements__Group__7 : rule__SecRequirements__Group__7__Impl ;
    public final void rule__SecRequirements__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2341:1: ( rule__SecRequirements__Group__7__Impl )
            // InternalTgfi.g:2342:2: rule__SecRequirements__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SecRequirements__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecRequirements__Group__7"


    // $ANTLR start "rule__SecRequirements__Group__7__Impl"
    // InternalTgfi.g:2348:1: rule__SecRequirements__Group__7__Impl : ( '}' ) ;
    public final void rule__SecRequirements__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2352:1: ( ( '}' ) )
            // InternalTgfi.g:2353:1: ( '}' )
            {
            // InternalTgfi.g:2353:1: ( '}' )
            // InternalTgfi.g:2354:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSecRequirementsAccess().getRightCurlyBracketKeyword_7()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSecRequirementsAccess().getRightCurlyBracketKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecRequirements__Group__7__Impl"


    // $ANTLR start "rule__SecRequirements__Group_1__0"
    // InternalTgfi.g:2364:1: rule__SecRequirements__Group_1__0 : rule__SecRequirements__Group_1__0__Impl rule__SecRequirements__Group_1__1 ;
    public final void rule__SecRequirements__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2368:1: ( rule__SecRequirements__Group_1__0__Impl rule__SecRequirements__Group_1__1 )
            // InternalTgfi.g:2369:2: rule__SecRequirements__Group_1__0__Impl rule__SecRequirements__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__SecRequirements__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SecRequirements__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecRequirements__Group_1__0"


    // $ANTLR start "rule__SecRequirements__Group_1__0__Impl"
    // InternalTgfi.g:2376:1: rule__SecRequirements__Group_1__0__Impl : ( 'Goal' ) ;
    public final void rule__SecRequirements__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2380:1: ( ( 'Goal' ) )
            // InternalTgfi.g:2381:1: ( 'Goal' )
            {
            // InternalTgfi.g:2381:1: ( 'Goal' )
            // InternalTgfi.g:2382:2: 'Goal'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSecRequirementsAccess().getGoalKeyword_1_0()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSecRequirementsAccess().getGoalKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecRequirements__Group_1__0__Impl"


    // $ANTLR start "rule__SecRequirements__Group_1__1"
    // InternalTgfi.g:2391:1: rule__SecRequirements__Group_1__1 : rule__SecRequirements__Group_1__1__Impl rule__SecRequirements__Group_1__2 ;
    public final void rule__SecRequirements__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2395:1: ( rule__SecRequirements__Group_1__1__Impl rule__SecRequirements__Group_1__2 )
            // InternalTgfi.g:2396:2: rule__SecRequirements__Group_1__1__Impl rule__SecRequirements__Group_1__2
            {
            pushFollow(FOLLOW_3);
            rule__SecRequirements__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SecRequirements__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecRequirements__Group_1__1"


    // $ANTLR start "rule__SecRequirements__Group_1__1__Impl"
    // InternalTgfi.g:2403:1: rule__SecRequirements__Group_1__1__Impl : ( ':' ) ;
    public final void rule__SecRequirements__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2407:1: ( ( ':' ) )
            // InternalTgfi.g:2408:1: ( ':' )
            {
            // InternalTgfi.g:2408:1: ( ':' )
            // InternalTgfi.g:2409:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSecRequirementsAccess().getColonKeyword_1_1()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSecRequirementsAccess().getColonKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecRequirements__Group_1__1__Impl"


    // $ANTLR start "rule__SecRequirements__Group_1__2"
    // InternalTgfi.g:2418:1: rule__SecRequirements__Group_1__2 : rule__SecRequirements__Group_1__2__Impl ;
    public final void rule__SecRequirements__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2422:1: ( rule__SecRequirements__Group_1__2__Impl )
            // InternalTgfi.g:2423:2: rule__SecRequirements__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SecRequirements__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecRequirements__Group_1__2"


    // $ANTLR start "rule__SecRequirements__Group_1__2__Impl"
    // InternalTgfi.g:2429:1: rule__SecRequirements__Group_1__2__Impl : ( ( rule__SecRequirements__SecreGoalAssignment_1_2 ) ) ;
    public final void rule__SecRequirements__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2433:1: ( ( ( rule__SecRequirements__SecreGoalAssignment_1_2 ) ) )
            // InternalTgfi.g:2434:1: ( ( rule__SecRequirements__SecreGoalAssignment_1_2 ) )
            {
            // InternalTgfi.g:2434:1: ( ( rule__SecRequirements__SecreGoalAssignment_1_2 ) )
            // InternalTgfi.g:2435:2: ( rule__SecRequirements__SecreGoalAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSecRequirementsAccess().getSecreGoalAssignment_1_2()); 
            }
            // InternalTgfi.g:2436:2: ( rule__SecRequirements__SecreGoalAssignment_1_2 )
            // InternalTgfi.g:2436:3: rule__SecRequirements__SecreGoalAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__SecRequirements__SecreGoalAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSecRequirementsAccess().getSecreGoalAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecRequirements__Group_1__2__Impl"


    // $ANTLR start "rule__SecRequirements__Group_2__0"
    // InternalTgfi.g:2445:1: rule__SecRequirements__Group_2__0 : rule__SecRequirements__Group_2__0__Impl rule__SecRequirements__Group_2__1 ;
    public final void rule__SecRequirements__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2449:1: ( rule__SecRequirements__Group_2__0__Impl rule__SecRequirements__Group_2__1 )
            // InternalTgfi.g:2450:2: rule__SecRequirements__Group_2__0__Impl rule__SecRequirements__Group_2__1
            {
            pushFollow(FOLLOW_10);
            rule__SecRequirements__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SecRequirements__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecRequirements__Group_2__0"


    // $ANTLR start "rule__SecRequirements__Group_2__0__Impl"
    // InternalTgfi.g:2457:1: rule__SecRequirements__Group_2__0__Impl : ( 'Level' ) ;
    public final void rule__SecRequirements__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2461:1: ( ( 'Level' ) )
            // InternalTgfi.g:2462:1: ( 'Level' )
            {
            // InternalTgfi.g:2462:1: ( 'Level' )
            // InternalTgfi.g:2463:2: 'Level'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSecRequirementsAccess().getLevelKeyword_2_0()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSecRequirementsAccess().getLevelKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecRequirements__Group_2__0__Impl"


    // $ANTLR start "rule__SecRequirements__Group_2__1"
    // InternalTgfi.g:2472:1: rule__SecRequirements__Group_2__1 : rule__SecRequirements__Group_2__1__Impl rule__SecRequirements__Group_2__2 ;
    public final void rule__SecRequirements__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2476:1: ( rule__SecRequirements__Group_2__1__Impl rule__SecRequirements__Group_2__2 )
            // InternalTgfi.g:2477:2: rule__SecRequirements__Group_2__1__Impl rule__SecRequirements__Group_2__2
            {
            pushFollow(FOLLOW_3);
            rule__SecRequirements__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SecRequirements__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecRequirements__Group_2__1"


    // $ANTLR start "rule__SecRequirements__Group_2__1__Impl"
    // InternalTgfi.g:2484:1: rule__SecRequirements__Group_2__1__Impl : ( ':' ) ;
    public final void rule__SecRequirements__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2488:1: ( ( ':' ) )
            // InternalTgfi.g:2489:1: ( ':' )
            {
            // InternalTgfi.g:2489:1: ( ':' )
            // InternalTgfi.g:2490:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSecRequirementsAccess().getColonKeyword_2_1()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSecRequirementsAccess().getColonKeyword_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecRequirements__Group_2__1__Impl"


    // $ANTLR start "rule__SecRequirements__Group_2__2"
    // InternalTgfi.g:2499:1: rule__SecRequirements__Group_2__2 : rule__SecRequirements__Group_2__2__Impl ;
    public final void rule__SecRequirements__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2503:1: ( rule__SecRequirements__Group_2__2__Impl )
            // InternalTgfi.g:2504:2: rule__SecRequirements__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SecRequirements__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecRequirements__Group_2__2"


    // $ANTLR start "rule__SecRequirements__Group_2__2__Impl"
    // InternalTgfi.g:2510:1: rule__SecRequirements__Group_2__2__Impl : ( ( rule__SecRequirements__SecreLevelAssignment_2_2 ) ) ;
    public final void rule__SecRequirements__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2514:1: ( ( ( rule__SecRequirements__SecreLevelAssignment_2_2 ) ) )
            // InternalTgfi.g:2515:1: ( ( rule__SecRequirements__SecreLevelAssignment_2_2 ) )
            {
            // InternalTgfi.g:2515:1: ( ( rule__SecRequirements__SecreLevelAssignment_2_2 ) )
            // InternalTgfi.g:2516:2: ( rule__SecRequirements__SecreLevelAssignment_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSecRequirementsAccess().getSecreLevelAssignment_2_2()); 
            }
            // InternalTgfi.g:2517:2: ( rule__SecRequirements__SecreLevelAssignment_2_2 )
            // InternalTgfi.g:2517:3: rule__SecRequirements__SecreLevelAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__SecRequirements__SecreLevelAssignment_2_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSecRequirementsAccess().getSecreLevelAssignment_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecRequirements__Group_2__2__Impl"


    // $ANTLR start "rule__SecRequirements__Group_3__0"
    // InternalTgfi.g:2526:1: rule__SecRequirements__Group_3__0 : rule__SecRequirements__Group_3__0__Impl rule__SecRequirements__Group_3__1 ;
    public final void rule__SecRequirements__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2530:1: ( rule__SecRequirements__Group_3__0__Impl rule__SecRequirements__Group_3__1 )
            // InternalTgfi.g:2531:2: rule__SecRequirements__Group_3__0__Impl rule__SecRequirements__Group_3__1
            {
            pushFollow(FOLLOW_10);
            rule__SecRequirements__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SecRequirements__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecRequirements__Group_3__0"


    // $ANTLR start "rule__SecRequirements__Group_3__0__Impl"
    // InternalTgfi.g:2538:1: rule__SecRequirements__Group_3__0__Impl : ( 'Location' ) ;
    public final void rule__SecRequirements__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2542:1: ( ( 'Location' ) )
            // InternalTgfi.g:2543:1: ( 'Location' )
            {
            // InternalTgfi.g:2543:1: ( 'Location' )
            // InternalTgfi.g:2544:2: 'Location'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSecRequirementsAccess().getLocationKeyword_3_0()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSecRequirementsAccess().getLocationKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecRequirements__Group_3__0__Impl"


    // $ANTLR start "rule__SecRequirements__Group_3__1"
    // InternalTgfi.g:2553:1: rule__SecRequirements__Group_3__1 : rule__SecRequirements__Group_3__1__Impl rule__SecRequirements__Group_3__2 ;
    public final void rule__SecRequirements__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2557:1: ( rule__SecRequirements__Group_3__1__Impl rule__SecRequirements__Group_3__2 )
            // InternalTgfi.g:2558:2: rule__SecRequirements__Group_3__1__Impl rule__SecRequirements__Group_3__2
            {
            pushFollow(FOLLOW_3);
            rule__SecRequirements__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SecRequirements__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecRequirements__Group_3__1"


    // $ANTLR start "rule__SecRequirements__Group_3__1__Impl"
    // InternalTgfi.g:2565:1: rule__SecRequirements__Group_3__1__Impl : ( ':' ) ;
    public final void rule__SecRequirements__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2569:1: ( ( ':' ) )
            // InternalTgfi.g:2570:1: ( ':' )
            {
            // InternalTgfi.g:2570:1: ( ':' )
            // InternalTgfi.g:2571:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSecRequirementsAccess().getColonKeyword_3_1()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSecRequirementsAccess().getColonKeyword_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecRequirements__Group_3__1__Impl"


    // $ANTLR start "rule__SecRequirements__Group_3__2"
    // InternalTgfi.g:2580:1: rule__SecRequirements__Group_3__2 : rule__SecRequirements__Group_3__2__Impl ;
    public final void rule__SecRequirements__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2584:1: ( rule__SecRequirements__Group_3__2__Impl )
            // InternalTgfi.g:2585:2: rule__SecRequirements__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SecRequirements__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecRequirements__Group_3__2"


    // $ANTLR start "rule__SecRequirements__Group_3__2__Impl"
    // InternalTgfi.g:2591:1: rule__SecRequirements__Group_3__2__Impl : ( ( rule__SecRequirements__SecreLocationAssignment_3_2 ) ) ;
    public final void rule__SecRequirements__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2595:1: ( ( ( rule__SecRequirements__SecreLocationAssignment_3_2 ) ) )
            // InternalTgfi.g:2596:1: ( ( rule__SecRequirements__SecreLocationAssignment_3_2 ) )
            {
            // InternalTgfi.g:2596:1: ( ( rule__SecRequirements__SecreLocationAssignment_3_2 ) )
            // InternalTgfi.g:2597:2: ( rule__SecRequirements__SecreLocationAssignment_3_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSecRequirementsAccess().getSecreLocationAssignment_3_2()); 
            }
            // InternalTgfi.g:2598:2: ( rule__SecRequirements__SecreLocationAssignment_3_2 )
            // InternalTgfi.g:2598:3: rule__SecRequirements__SecreLocationAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__SecRequirements__SecreLocationAssignment_3_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSecRequirementsAccess().getSecreLocationAssignment_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecRequirements__Group_3__2__Impl"


    // $ANTLR start "rule__SecRequirements__Group_4__0"
    // InternalTgfi.g:2607:1: rule__SecRequirements__Group_4__0 : rule__SecRequirements__Group_4__0__Impl rule__SecRequirements__Group_4__1 ;
    public final void rule__SecRequirements__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2611:1: ( rule__SecRequirements__Group_4__0__Impl rule__SecRequirements__Group_4__1 )
            // InternalTgfi.g:2612:2: rule__SecRequirements__Group_4__0__Impl rule__SecRequirements__Group_4__1
            {
            pushFollow(FOLLOW_10);
            rule__SecRequirements__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SecRequirements__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecRequirements__Group_4__0"


    // $ANTLR start "rule__SecRequirements__Group_4__0__Impl"
    // InternalTgfi.g:2619:1: rule__SecRequirements__Group_4__0__Impl : ( 'State' ) ;
    public final void rule__SecRequirements__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2623:1: ( ( 'State' ) )
            // InternalTgfi.g:2624:1: ( 'State' )
            {
            // InternalTgfi.g:2624:1: ( 'State' )
            // InternalTgfi.g:2625:2: 'State'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSecRequirementsAccess().getStateKeyword_4_0()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSecRequirementsAccess().getStateKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecRequirements__Group_4__0__Impl"


    // $ANTLR start "rule__SecRequirements__Group_4__1"
    // InternalTgfi.g:2634:1: rule__SecRequirements__Group_4__1 : rule__SecRequirements__Group_4__1__Impl rule__SecRequirements__Group_4__2 ;
    public final void rule__SecRequirements__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2638:1: ( rule__SecRequirements__Group_4__1__Impl rule__SecRequirements__Group_4__2 )
            // InternalTgfi.g:2639:2: rule__SecRequirements__Group_4__1__Impl rule__SecRequirements__Group_4__2
            {
            pushFollow(FOLLOW_3);
            rule__SecRequirements__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SecRequirements__Group_4__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecRequirements__Group_4__1"


    // $ANTLR start "rule__SecRequirements__Group_4__1__Impl"
    // InternalTgfi.g:2646:1: rule__SecRequirements__Group_4__1__Impl : ( ':' ) ;
    public final void rule__SecRequirements__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2650:1: ( ( ':' ) )
            // InternalTgfi.g:2651:1: ( ':' )
            {
            // InternalTgfi.g:2651:1: ( ':' )
            // InternalTgfi.g:2652:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSecRequirementsAccess().getColonKeyword_4_1()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSecRequirementsAccess().getColonKeyword_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecRequirements__Group_4__1__Impl"


    // $ANTLR start "rule__SecRequirements__Group_4__2"
    // InternalTgfi.g:2661:1: rule__SecRequirements__Group_4__2 : rule__SecRequirements__Group_4__2__Impl ;
    public final void rule__SecRequirements__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2665:1: ( rule__SecRequirements__Group_4__2__Impl )
            // InternalTgfi.g:2666:2: rule__SecRequirements__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SecRequirements__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecRequirements__Group_4__2"


    // $ANTLR start "rule__SecRequirements__Group_4__2__Impl"
    // InternalTgfi.g:2672:1: rule__SecRequirements__Group_4__2__Impl : ( ( rule__SecRequirements__SecreStateAssignment_4_2 ) ) ;
    public final void rule__SecRequirements__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2676:1: ( ( ( rule__SecRequirements__SecreStateAssignment_4_2 ) ) )
            // InternalTgfi.g:2677:1: ( ( rule__SecRequirements__SecreStateAssignment_4_2 ) )
            {
            // InternalTgfi.g:2677:1: ( ( rule__SecRequirements__SecreStateAssignment_4_2 ) )
            // InternalTgfi.g:2678:2: ( rule__SecRequirements__SecreStateAssignment_4_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSecRequirementsAccess().getSecreStateAssignment_4_2()); 
            }
            // InternalTgfi.g:2679:2: ( rule__SecRequirements__SecreStateAssignment_4_2 )
            // InternalTgfi.g:2679:3: rule__SecRequirements__SecreStateAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__SecRequirements__SecreStateAssignment_4_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSecRequirementsAccess().getSecreStateAssignment_4_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecRequirements__Group_4__2__Impl"


    // $ANTLR start "rule__SecRequirements__Group_5__0"
    // InternalTgfi.g:2688:1: rule__SecRequirements__Group_5__0 : rule__SecRequirements__Group_5__0__Impl rule__SecRequirements__Group_5__1 ;
    public final void rule__SecRequirements__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2692:1: ( rule__SecRequirements__Group_5__0__Impl rule__SecRequirements__Group_5__1 )
            // InternalTgfi.g:2693:2: rule__SecRequirements__Group_5__0__Impl rule__SecRequirements__Group_5__1
            {
            pushFollow(FOLLOW_10);
            rule__SecRequirements__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SecRequirements__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecRequirements__Group_5__0"


    // $ANTLR start "rule__SecRequirements__Group_5__0__Impl"
    // InternalTgfi.g:2700:1: rule__SecRequirements__Group_5__0__Impl : ( 'Descr' ) ;
    public final void rule__SecRequirements__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2704:1: ( ( 'Descr' ) )
            // InternalTgfi.g:2705:1: ( 'Descr' )
            {
            // InternalTgfi.g:2705:1: ( 'Descr' )
            // InternalTgfi.g:2706:2: 'Descr'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSecRequirementsAccess().getDescrKeyword_5_0()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSecRequirementsAccess().getDescrKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecRequirements__Group_5__0__Impl"


    // $ANTLR start "rule__SecRequirements__Group_5__1"
    // InternalTgfi.g:2715:1: rule__SecRequirements__Group_5__1 : rule__SecRequirements__Group_5__1__Impl rule__SecRequirements__Group_5__2 ;
    public final void rule__SecRequirements__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2719:1: ( rule__SecRequirements__Group_5__1__Impl rule__SecRequirements__Group_5__2 )
            // InternalTgfi.g:2720:2: rule__SecRequirements__Group_5__1__Impl rule__SecRequirements__Group_5__2
            {
            pushFollow(FOLLOW_3);
            rule__SecRequirements__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SecRequirements__Group_5__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecRequirements__Group_5__1"


    // $ANTLR start "rule__SecRequirements__Group_5__1__Impl"
    // InternalTgfi.g:2727:1: rule__SecRequirements__Group_5__1__Impl : ( ':' ) ;
    public final void rule__SecRequirements__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2731:1: ( ( ':' ) )
            // InternalTgfi.g:2732:1: ( ':' )
            {
            // InternalTgfi.g:2732:1: ( ':' )
            // InternalTgfi.g:2733:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSecRequirementsAccess().getColonKeyword_5_1()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSecRequirementsAccess().getColonKeyword_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecRequirements__Group_5__1__Impl"


    // $ANTLR start "rule__SecRequirements__Group_5__2"
    // InternalTgfi.g:2742:1: rule__SecRequirements__Group_5__2 : rule__SecRequirements__Group_5__2__Impl ;
    public final void rule__SecRequirements__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2746:1: ( rule__SecRequirements__Group_5__2__Impl )
            // InternalTgfi.g:2747:2: rule__SecRequirements__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SecRequirements__Group_5__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecRequirements__Group_5__2"


    // $ANTLR start "rule__SecRequirements__Group_5__2__Impl"
    // InternalTgfi.g:2753:1: rule__SecRequirements__Group_5__2__Impl : ( ( rule__SecRequirements__SecreDescrAssignment_5_2 ) ) ;
    public final void rule__SecRequirements__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2757:1: ( ( ( rule__SecRequirements__SecreDescrAssignment_5_2 ) ) )
            // InternalTgfi.g:2758:1: ( ( rule__SecRequirements__SecreDescrAssignment_5_2 ) )
            {
            // InternalTgfi.g:2758:1: ( ( rule__SecRequirements__SecreDescrAssignment_5_2 ) )
            // InternalTgfi.g:2759:2: ( rule__SecRequirements__SecreDescrAssignment_5_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSecRequirementsAccess().getSecreDescrAssignment_5_2()); 
            }
            // InternalTgfi.g:2760:2: ( rule__SecRequirements__SecreDescrAssignment_5_2 )
            // InternalTgfi.g:2760:3: rule__SecRequirements__SecreDescrAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__SecRequirements__SecreDescrAssignment_5_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSecRequirementsAccess().getSecreDescrAssignment_5_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecRequirements__Group_5__2__Impl"


    // $ANTLR start "rule__SecRequirements__Group_6__0"
    // InternalTgfi.g:2769:1: rule__SecRequirements__Group_6__0 : rule__SecRequirements__Group_6__0__Impl rule__SecRequirements__Group_6__1 ;
    public final void rule__SecRequirements__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2773:1: ( rule__SecRequirements__Group_6__0__Impl rule__SecRequirements__Group_6__1 )
            // InternalTgfi.g:2774:2: rule__SecRequirements__Group_6__0__Impl rule__SecRequirements__Group_6__1
            {
            pushFollow(FOLLOW_10);
            rule__SecRequirements__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SecRequirements__Group_6__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecRequirements__Group_6__0"


    // $ANTLR start "rule__SecRequirements__Group_6__0__Impl"
    // InternalTgfi.g:2781:1: rule__SecRequirements__Group_6__0__Impl : ( 'Category' ) ;
    public final void rule__SecRequirements__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2785:1: ( ( 'Category' ) )
            // InternalTgfi.g:2786:1: ( 'Category' )
            {
            // InternalTgfi.g:2786:1: ( 'Category' )
            // InternalTgfi.g:2787:2: 'Category'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSecRequirementsAccess().getCategoryKeyword_6_0()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSecRequirementsAccess().getCategoryKeyword_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecRequirements__Group_6__0__Impl"


    // $ANTLR start "rule__SecRequirements__Group_6__1"
    // InternalTgfi.g:2796:1: rule__SecRequirements__Group_6__1 : rule__SecRequirements__Group_6__1__Impl rule__SecRequirements__Group_6__2 ;
    public final void rule__SecRequirements__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2800:1: ( rule__SecRequirements__Group_6__1__Impl rule__SecRequirements__Group_6__2 )
            // InternalTgfi.g:2801:2: rule__SecRequirements__Group_6__1__Impl rule__SecRequirements__Group_6__2
            {
            pushFollow(FOLLOW_3);
            rule__SecRequirements__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SecRequirements__Group_6__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecRequirements__Group_6__1"


    // $ANTLR start "rule__SecRequirements__Group_6__1__Impl"
    // InternalTgfi.g:2808:1: rule__SecRequirements__Group_6__1__Impl : ( ':' ) ;
    public final void rule__SecRequirements__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2812:1: ( ( ':' ) )
            // InternalTgfi.g:2813:1: ( ':' )
            {
            // InternalTgfi.g:2813:1: ( ':' )
            // InternalTgfi.g:2814:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSecRequirementsAccess().getColonKeyword_6_1()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSecRequirementsAccess().getColonKeyword_6_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecRequirements__Group_6__1__Impl"


    // $ANTLR start "rule__SecRequirements__Group_6__2"
    // InternalTgfi.g:2823:1: rule__SecRequirements__Group_6__2 : rule__SecRequirements__Group_6__2__Impl ;
    public final void rule__SecRequirements__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2827:1: ( rule__SecRequirements__Group_6__2__Impl )
            // InternalTgfi.g:2828:2: rule__SecRequirements__Group_6__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SecRequirements__Group_6__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecRequirements__Group_6__2"


    // $ANTLR start "rule__SecRequirements__Group_6__2__Impl"
    // InternalTgfi.g:2834:1: rule__SecRequirements__Group_6__2__Impl : ( ( rule__SecRequirements__SecreCategoryAssignment_6_2 ) ) ;
    public final void rule__SecRequirements__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2838:1: ( ( ( rule__SecRequirements__SecreCategoryAssignment_6_2 ) ) )
            // InternalTgfi.g:2839:1: ( ( rule__SecRequirements__SecreCategoryAssignment_6_2 ) )
            {
            // InternalTgfi.g:2839:1: ( ( rule__SecRequirements__SecreCategoryAssignment_6_2 ) )
            // InternalTgfi.g:2840:2: ( rule__SecRequirements__SecreCategoryAssignment_6_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSecRequirementsAccess().getSecreCategoryAssignment_6_2()); 
            }
            // InternalTgfi.g:2841:2: ( rule__SecRequirements__SecreCategoryAssignment_6_2 )
            // InternalTgfi.g:2841:3: rule__SecRequirements__SecreCategoryAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__SecRequirements__SecreCategoryAssignment_6_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSecRequirementsAccess().getSecreCategoryAssignment_6_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecRequirements__Group_6__2__Impl"


    // $ANTLR start "rule__Transaction__Group__0"
    // InternalTgfi.g:2850:1: rule__Transaction__Group__0 : rule__Transaction__Group__0__Impl rule__Transaction__Group__1 ;
    public final void rule__Transaction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2854:1: ( rule__Transaction__Group__0__Impl rule__Transaction__Group__1 )
            // InternalTgfi.g:2855:2: rule__Transaction__Group__0__Impl rule__Transaction__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Transaction__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Transaction__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__0"


    // $ANTLR start "rule__Transaction__Group__0__Impl"
    // InternalTgfi.g:2862:1: rule__Transaction__Group__0__Impl : ( '(' ) ;
    public final void rule__Transaction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2866:1: ( ( '(' ) )
            // InternalTgfi.g:2867:1: ( '(' )
            {
            // InternalTgfi.g:2867:1: ( '(' )
            // InternalTgfi.g:2868:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransactionAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransactionAccess().getLeftParenthesisKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__0__Impl"


    // $ANTLR start "rule__Transaction__Group__1"
    // InternalTgfi.g:2877:1: rule__Transaction__Group__1 : rule__Transaction__Group__1__Impl rule__Transaction__Group__2 ;
    public final void rule__Transaction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2881:1: ( rule__Transaction__Group__1__Impl rule__Transaction__Group__2 )
            // InternalTgfi.g:2882:2: rule__Transaction__Group__1__Impl rule__Transaction__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__Transaction__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Transaction__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__1"


    // $ANTLR start "rule__Transaction__Group__1__Impl"
    // InternalTgfi.g:2889:1: rule__Transaction__Group__1__Impl : ( ruleActor ) ;
    public final void rule__Transaction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2893:1: ( ( ruleActor ) )
            // InternalTgfi.g:2894:1: ( ruleActor )
            {
            // InternalTgfi.g:2894:1: ( ruleActor )
            // InternalTgfi.g:2895:2: ruleActor
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransactionAccess().getActorParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleActor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransactionAccess().getActorParserRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__1__Impl"


    // $ANTLR start "rule__Transaction__Group__2"
    // InternalTgfi.g:2904:1: rule__Transaction__Group__2 : rule__Transaction__Group__2__Impl rule__Transaction__Group__3 ;
    public final void rule__Transaction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2908:1: ( rule__Transaction__Group__2__Impl rule__Transaction__Group__3 )
            // InternalTgfi.g:2909:2: rule__Transaction__Group__2__Impl rule__Transaction__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Transaction__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Transaction__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__2"


    // $ANTLR start "rule__Transaction__Group__2__Impl"
    // InternalTgfi.g:2916:1: rule__Transaction__Group__2__Impl : ( ',' ) ;
    public final void rule__Transaction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2920:1: ( ( ',' ) )
            // InternalTgfi.g:2921:1: ( ',' )
            {
            // InternalTgfi.g:2921:1: ( ',' )
            // InternalTgfi.g:2922:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransactionAccess().getCommaKeyword_2()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransactionAccess().getCommaKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__2__Impl"


    // $ANTLR start "rule__Transaction__Group__3"
    // InternalTgfi.g:2931:1: rule__Transaction__Group__3 : rule__Transaction__Group__3__Impl rule__Transaction__Group__4 ;
    public final void rule__Transaction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2935:1: ( rule__Transaction__Group__3__Impl rule__Transaction__Group__4 )
            // InternalTgfi.g:2936:2: rule__Transaction__Group__3__Impl rule__Transaction__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__Transaction__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Transaction__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__3"


    // $ANTLR start "rule__Transaction__Group__3__Impl"
    // InternalTgfi.g:2943:1: rule__Transaction__Group__3__Impl : ( RULE_STRING ) ;
    public final void rule__Transaction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2947:1: ( ( RULE_STRING ) )
            // InternalTgfi.g:2948:1: ( RULE_STRING )
            {
            // InternalTgfi.g:2948:1: ( RULE_STRING )
            // InternalTgfi.g:2949:2: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransactionAccess().getSTRINGTerminalRuleCall_3()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransactionAccess().getSTRINGTerminalRuleCall_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__3__Impl"


    // $ANTLR start "rule__Transaction__Group__4"
    // InternalTgfi.g:2958:1: rule__Transaction__Group__4 : rule__Transaction__Group__4__Impl rule__Transaction__Group__5 ;
    public final void rule__Transaction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2962:1: ( rule__Transaction__Group__4__Impl rule__Transaction__Group__5 )
            // InternalTgfi.g:2963:2: rule__Transaction__Group__4__Impl rule__Transaction__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__Transaction__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Transaction__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__4"


    // $ANTLR start "rule__Transaction__Group__4__Impl"
    // InternalTgfi.g:2970:1: rule__Transaction__Group__4__Impl : ( ',' ) ;
    public final void rule__Transaction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2974:1: ( ( ',' ) )
            // InternalTgfi.g:2975:1: ( ',' )
            {
            // InternalTgfi.g:2975:1: ( ',' )
            // InternalTgfi.g:2976:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransactionAccess().getCommaKeyword_4()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransactionAccess().getCommaKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__4__Impl"


    // $ANTLR start "rule__Transaction__Group__5"
    // InternalTgfi.g:2985:1: rule__Transaction__Group__5 : rule__Transaction__Group__5__Impl rule__Transaction__Group__6 ;
    public final void rule__Transaction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2989:1: ( rule__Transaction__Group__5__Impl rule__Transaction__Group__6 )
            // InternalTgfi.g:2990:2: rule__Transaction__Group__5__Impl rule__Transaction__Group__6
            {
            pushFollow(FOLLOW_24);
            rule__Transaction__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Transaction__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__5"


    // $ANTLR start "rule__Transaction__Group__5__Impl"
    // InternalTgfi.g:2997:1: rule__Transaction__Group__5__Impl : ( ruleActor ) ;
    public final void rule__Transaction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:3001:1: ( ( ruleActor ) )
            // InternalTgfi.g:3002:1: ( ruleActor )
            {
            // InternalTgfi.g:3002:1: ( ruleActor )
            // InternalTgfi.g:3003:2: ruleActor
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransactionAccess().getActorParserRuleCall_5()); 
            }
            pushFollow(FOLLOW_2);
            ruleActor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransactionAccess().getActorParserRuleCall_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__5__Impl"


    // $ANTLR start "rule__Transaction__Group__6"
    // InternalTgfi.g:3012:1: rule__Transaction__Group__6 : rule__Transaction__Group__6__Impl ;
    public final void rule__Transaction__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:3016:1: ( rule__Transaction__Group__6__Impl )
            // InternalTgfi.g:3017:2: rule__Transaction__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transaction__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__6"


    // $ANTLR start "rule__Transaction__Group__6__Impl"
    // InternalTgfi.g:3023:1: rule__Transaction__Group__6__Impl : ( ')' ) ;
    public final void rule__Transaction__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:3027:1: ( ( ')' ) )
            // InternalTgfi.g:3028:1: ( ')' )
            {
            // InternalTgfi.g:3028:1: ( ')' )
            // InternalTgfi.g:3029:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransactionAccess().getRightParenthesisKeyword_6()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransactionAccess().getRightParenthesisKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__6__Impl"


    // $ANTLR start "rule__QualityAttr__Group__0"
    // InternalTgfi.g:3039:1: rule__QualityAttr__Group__0 : rule__QualityAttr__Group__0__Impl rule__QualityAttr__Group__1 ;
    public final void rule__QualityAttr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:3043:1: ( rule__QualityAttr__Group__0__Impl rule__QualityAttr__Group__1 )
            // InternalTgfi.g:3044:2: rule__QualityAttr__Group__0__Impl rule__QualityAttr__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__QualityAttr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__QualityAttr__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAttr__Group__0"


    // $ANTLR start "rule__QualityAttr__Group__0__Impl"
    // InternalTgfi.g:3051:1: rule__QualityAttr__Group__0__Impl : ( ruleQualityAttrID ) ;
    public final void rule__QualityAttr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:3055:1: ( ( ruleQualityAttrID ) )
            // InternalTgfi.g:3056:1: ( ruleQualityAttrID )
            {
            // InternalTgfi.g:3056:1: ( ruleQualityAttrID )
            // InternalTgfi.g:3057:2: ruleQualityAttrID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualityAttrAccess().getQualityAttrIDParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualityAttrID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualityAttrAccess().getQualityAttrIDParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAttr__Group__0__Impl"


    // $ANTLR start "rule__QualityAttr__Group__1"
    // InternalTgfi.g:3066:1: rule__QualityAttr__Group__1 : rule__QualityAttr__Group__1__Impl rule__QualityAttr__Group__2 ;
    public final void rule__QualityAttr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:3070:1: ( rule__QualityAttr__Group__1__Impl rule__QualityAttr__Group__2 )
            // InternalTgfi.g:3071:2: rule__QualityAttr__Group__1__Impl rule__QualityAttr__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__QualityAttr__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__QualityAttr__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAttr__Group__1"


    // $ANTLR start "rule__QualityAttr__Group__1__Impl"
    // InternalTgfi.g:3078:1: rule__QualityAttr__Group__1__Impl : ( '[' ) ;
    public final void rule__QualityAttr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:3082:1: ( ( '[' ) )
            // InternalTgfi.g:3083:1: ( '[' )
            {
            // InternalTgfi.g:3083:1: ( '[' )
            // InternalTgfi.g:3084:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualityAttrAccess().getLeftSquareBracketKeyword_1()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualityAttrAccess().getLeftSquareBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAttr__Group__1__Impl"


    // $ANTLR start "rule__QualityAttr__Group__2"
    // InternalTgfi.g:3093:1: rule__QualityAttr__Group__2 : rule__QualityAttr__Group__2__Impl rule__QualityAttr__Group__3 ;
    public final void rule__QualityAttr__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:3097:1: ( rule__QualityAttr__Group__2__Impl rule__QualityAttr__Group__3 )
            // InternalTgfi.g:3098:2: rule__QualityAttr__Group__2__Impl rule__QualityAttr__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__QualityAttr__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__QualityAttr__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAttr__Group__2"


    // $ANTLR start "rule__QualityAttr__Group__2__Impl"
    // InternalTgfi.g:3105:1: rule__QualityAttr__Group__2__Impl : ( RULE_STRING ) ;
    public final void rule__QualityAttr__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:3109:1: ( ( RULE_STRING ) )
            // InternalTgfi.g:3110:1: ( RULE_STRING )
            {
            // InternalTgfi.g:3110:1: ( RULE_STRING )
            // InternalTgfi.g:3111:2: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualityAttrAccess().getSTRINGTerminalRuleCall_2()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualityAttrAccess().getSTRINGTerminalRuleCall_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAttr__Group__2__Impl"


    // $ANTLR start "rule__QualityAttr__Group__3"
    // InternalTgfi.g:3120:1: rule__QualityAttr__Group__3 : rule__QualityAttr__Group__3__Impl ;
    public final void rule__QualityAttr__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:3124:1: ( rule__QualityAttr__Group__3__Impl )
            // InternalTgfi.g:3125:2: rule__QualityAttr__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualityAttr__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAttr__Group__3"


    // $ANTLR start "rule__QualityAttr__Group__3__Impl"
    // InternalTgfi.g:3131:1: rule__QualityAttr__Group__3__Impl : ( ']' ) ;
    public final void rule__QualityAttr__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:3135:1: ( ( ']' ) )
            // InternalTgfi.g:3136:1: ( ']' )
            {
            // InternalTgfi.g:3136:1: ( ']' )
            // InternalTgfi.g:3137:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualityAttrAccess().getRightSquareBracketKeyword_3()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualityAttrAccess().getRightSquareBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAttr__Group__3__Impl"


    // $ANTLR start "rule__Rule__Group__0"
    // InternalTgfi.g:3147:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:3151:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalTgfi.g:3152:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Rule__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Rule__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0"


    // $ANTLR start "rule__Rule__Group__0__Impl"
    // InternalTgfi.g:3159:1: rule__Rule__Group__0__Impl : ( ruleRuleId ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:3163:1: ( ( ruleRuleId ) )
            // InternalTgfi.g:3164:1: ( ruleRuleId )
            {
            // InternalTgfi.g:3164:1: ( ruleRuleId )
            // InternalTgfi.g:3165:2: ruleRuleId
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getRuleIdParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleRuleId();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getRuleIdParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0__Impl"


    // $ANTLR start "rule__Rule__Group__1"
    // InternalTgfi.g:3174:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:3178:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalTgfi.g:3179:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Rule__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Rule__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1"


    // $ANTLR start "rule__Rule__Group__1__Impl"
    // InternalTgfi.g:3186:1: rule__Rule__Group__1__Impl : ( ':' ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:3190:1: ( ( ':' ) )
            // InternalTgfi.g:3191:1: ( ':' )
            {
            // InternalTgfi.g:3191:1: ( ':' )
            // InternalTgfi.g:3192:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getColonKeyword_1()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getColonKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1__Impl"


    // $ANTLR start "rule__Rule__Group__2"
    // InternalTgfi.g:3201:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:3205:1: ( rule__Rule__Group__2__Impl )
            // InternalTgfi.g:3206:2: rule__Rule__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2"


    // $ANTLR start "rule__Rule__Group__2__Impl"
    // InternalTgfi.g:3212:1: rule__Rule__Group__2__Impl : ( RULE_STRING ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:3216:1: ( ( RULE_STRING ) )
            // InternalTgfi.g:3217:1: ( RULE_STRING )
            {
            // InternalTgfi.g:3217:1: ( RULE_STRING )
            // InternalTgfi.g:3218:2: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getSTRINGTerminalRuleCall_2()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getSTRINGTerminalRuleCall_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2__Impl"


    // $ANTLR start "rule__Tgfi__UnorderedGroup"
    // InternalTgfi.g:3228:1: rule__Tgfi__UnorderedGroup : ( rule__Tgfi__UnorderedGroup__0 )? ;
    public final void rule__Tgfi__UnorderedGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getTgfiAccess().getUnorderedGroup());
        	
        try {
            // InternalTgfi.g:3233:1: ( ( rule__Tgfi__UnorderedGroup__0 )? )
            // InternalTgfi.g:3234:2: ( rule__Tgfi__UnorderedGroup__0 )?
            {
            // InternalTgfi.g:3234:2: ( rule__Tgfi__UnorderedGroup__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( LA25_0 == 11 && getUnorderedGroupHelper().canSelect(grammarAccess.getTgfiAccess().getUnorderedGroup(), 0) ) {
                alt25=1;
            }
            else if ( LA25_0 == 12 && getUnorderedGroupHelper().canSelect(grammarAccess.getTgfiAccess().getUnorderedGroup(), 1) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalTgfi.g:3234:2: rule__Tgfi__UnorderedGroup__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Tgfi__UnorderedGroup__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getTgfiAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tgfi__UnorderedGroup"


    // $ANTLR start "rule__Tgfi__UnorderedGroup__Impl"
    // InternalTgfi.g:3242:1: rule__Tgfi__UnorderedGroup__Impl : ( ({...}? => ( ( ( ( rule__Tgfi__ImportElAssignment_0 ) ) ( ( ( rule__Tgfi__ImportElAssignment_0 )=> rule__Tgfi__ImportElAssignment_0 )* ) ) ) ) | ({...}? => ( ( ( rule__Tgfi__MainAssignment_1 ) ) ) ) ) ;
    public final void rule__Tgfi__UnorderedGroup__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalTgfi.g:3247:1: ( ( ({...}? => ( ( ( ( rule__Tgfi__ImportElAssignment_0 ) ) ( ( ( rule__Tgfi__ImportElAssignment_0 )=> rule__Tgfi__ImportElAssignment_0 )* ) ) ) ) | ({...}? => ( ( ( rule__Tgfi__MainAssignment_1 ) ) ) ) ) )
            // InternalTgfi.g:3248:3: ( ({...}? => ( ( ( ( rule__Tgfi__ImportElAssignment_0 ) ) ( ( ( rule__Tgfi__ImportElAssignment_0 )=> rule__Tgfi__ImportElAssignment_0 )* ) ) ) ) | ({...}? => ( ( ( rule__Tgfi__MainAssignment_1 ) ) ) ) )
            {
            // InternalTgfi.g:3248:3: ( ({...}? => ( ( ( ( rule__Tgfi__ImportElAssignment_0 ) ) ( ( ( rule__Tgfi__ImportElAssignment_0 )=> rule__Tgfi__ImportElAssignment_0 )* ) ) ) ) | ({...}? => ( ( ( rule__Tgfi__MainAssignment_1 ) ) ) ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( LA27_0 == 11 && getUnorderedGroupHelper().canSelect(grammarAccess.getTgfiAccess().getUnorderedGroup(), 0) ) {
                alt27=1;
            }
            else if ( LA27_0 == 12 && getUnorderedGroupHelper().canSelect(grammarAccess.getTgfiAccess().getUnorderedGroup(), 1) ) {
                alt27=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalTgfi.g:3249:3: ({...}? => ( ( ( ( rule__Tgfi__ImportElAssignment_0 ) ) ( ( ( rule__Tgfi__ImportElAssignment_0 )=> rule__Tgfi__ImportElAssignment_0 )* ) ) ) )
                    {
                    // InternalTgfi.g:3249:3: ({...}? => ( ( ( ( rule__Tgfi__ImportElAssignment_0 ) ) ( ( ( rule__Tgfi__ImportElAssignment_0 )=> rule__Tgfi__ImportElAssignment_0 )* ) ) ) )
                    // InternalTgfi.g:3250:4: {...}? => ( ( ( ( rule__Tgfi__ImportElAssignment_0 ) ) ( ( ( rule__Tgfi__ImportElAssignment_0 )=> rule__Tgfi__ImportElAssignment_0 )* ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTgfiAccess().getUnorderedGroup(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Tgfi__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getTgfiAccess().getUnorderedGroup(), 0)");
                    }
                    // InternalTgfi.g:3250:98: ( ( ( ( rule__Tgfi__ImportElAssignment_0 ) ) ( ( ( rule__Tgfi__ImportElAssignment_0 )=> rule__Tgfi__ImportElAssignment_0 )* ) ) )
                    // InternalTgfi.g:3251:5: ( ( ( rule__Tgfi__ImportElAssignment_0 ) ) ( ( ( rule__Tgfi__ImportElAssignment_0 )=> rule__Tgfi__ImportElAssignment_0 )* ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getTgfiAccess().getUnorderedGroup(), 0);
                    selected = true;
                    // InternalTgfi.g:3257:5: ( ( ( rule__Tgfi__ImportElAssignment_0 ) ) ( ( ( rule__Tgfi__ImportElAssignment_0 )=> rule__Tgfi__ImportElAssignment_0 )* ) )
                    // InternalTgfi.g:3258:6: ( ( rule__Tgfi__ImportElAssignment_0 ) ) ( ( ( rule__Tgfi__ImportElAssignment_0 )=> rule__Tgfi__ImportElAssignment_0 )* )
                    {
                    // InternalTgfi.g:3258:6: ( ( rule__Tgfi__ImportElAssignment_0 ) )
                    // InternalTgfi.g:3259:7: ( rule__Tgfi__ImportElAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTgfiAccess().getImportElAssignment_0()); 
                    }
                    // InternalTgfi.g:3260:7: ( rule__Tgfi__ImportElAssignment_0 )
                    // InternalTgfi.g:3260:8: rule__Tgfi__ImportElAssignment_0
                    {
                    pushFollow(FOLLOW_27);
                    rule__Tgfi__ImportElAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTgfiAccess().getImportElAssignment_0()); 
                    }

                    }

                    // InternalTgfi.g:3263:6: ( ( ( rule__Tgfi__ImportElAssignment_0 )=> rule__Tgfi__ImportElAssignment_0 )* )
                    // InternalTgfi.g:3264:7: ( ( rule__Tgfi__ImportElAssignment_0 )=> rule__Tgfi__ImportElAssignment_0 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTgfiAccess().getImportElAssignment_0()); 
                    }
                    // InternalTgfi.g:3265:7: ( ( rule__Tgfi__ImportElAssignment_0 )=> rule__Tgfi__ImportElAssignment_0 )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==11) ) {
                            int LA26_1 = input.LA(2);

                            if ( (LA26_1==RULE_STRING) ) {
                                int LA26_3 = input.LA(3);

                                if ( (synpred1_InternalTgfi()) ) {
                                    alt26=1;
                                }


                            }


                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalTgfi.g:3265:8: ( rule__Tgfi__ImportElAssignment_0 )=> rule__Tgfi__ImportElAssignment_0
                    	    {
                    	    pushFollow(FOLLOW_27);
                    	    rule__Tgfi__ImportElAssignment_0();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTgfiAccess().getImportElAssignment_0()); 
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTgfi.g:3271:3: ({...}? => ( ( ( rule__Tgfi__MainAssignment_1 ) ) ) )
                    {
                    // InternalTgfi.g:3271:3: ({...}? => ( ( ( rule__Tgfi__MainAssignment_1 ) ) ) )
                    // InternalTgfi.g:3272:4: {...}? => ( ( ( rule__Tgfi__MainAssignment_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTgfiAccess().getUnorderedGroup(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Tgfi__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getTgfiAccess().getUnorderedGroup(), 1)");
                    }
                    // InternalTgfi.g:3272:98: ( ( ( rule__Tgfi__MainAssignment_1 ) ) )
                    // InternalTgfi.g:3273:5: ( ( rule__Tgfi__MainAssignment_1 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getTgfiAccess().getUnorderedGroup(), 1);
                    selected = true;
                    // InternalTgfi.g:3279:5: ( ( rule__Tgfi__MainAssignment_1 ) )
                    // InternalTgfi.g:3280:6: ( rule__Tgfi__MainAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTgfiAccess().getMainAssignment_1()); 
                    }
                    // InternalTgfi.g:3281:6: ( rule__Tgfi__MainAssignment_1 )
                    // InternalTgfi.g:3281:7: rule__Tgfi__MainAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Tgfi__MainAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTgfiAccess().getMainAssignment_1()); 
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTgfiAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tgfi__UnorderedGroup__Impl"


    // $ANTLR start "rule__Tgfi__UnorderedGroup__0"
    // InternalTgfi.g:3294:1: rule__Tgfi__UnorderedGroup__0 : rule__Tgfi__UnorderedGroup__Impl ( rule__Tgfi__UnorderedGroup__1 )? ;
    public final void rule__Tgfi__UnorderedGroup__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:3298:1: ( rule__Tgfi__UnorderedGroup__Impl ( rule__Tgfi__UnorderedGroup__1 )? )
            // InternalTgfi.g:3299:2: rule__Tgfi__UnorderedGroup__Impl ( rule__Tgfi__UnorderedGroup__1 )?
            {
            pushFollow(FOLLOW_28);
            rule__Tgfi__UnorderedGroup__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalTgfi.g:3300:2: ( rule__Tgfi__UnorderedGroup__1 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( LA28_0 == 11 && getUnorderedGroupHelper().canSelect(grammarAccess.getTgfiAccess().getUnorderedGroup(), 0) ) {
                alt28=1;
            }
            else if ( LA28_0 == 12 && getUnorderedGroupHelper().canSelect(grammarAccess.getTgfiAccess().getUnorderedGroup(), 1) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalTgfi.g:3300:2: rule__Tgfi__UnorderedGroup__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Tgfi__UnorderedGroup__1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tgfi__UnorderedGroup__0"


    // $ANTLR start "rule__Tgfi__UnorderedGroup__1"
    // InternalTgfi.g:3306:1: rule__Tgfi__UnorderedGroup__1 : rule__Tgfi__UnorderedGroup__Impl ;
    public final void rule__Tgfi__UnorderedGroup__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:3310:1: ( rule__Tgfi__UnorderedGroup__Impl )
            // InternalTgfi.g:3311:2: rule__Tgfi__UnorderedGroup__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tgfi__UnorderedGroup__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tgfi__UnorderedGroup__1"


    // $ANTLR start "rule__Tgfi__ImportElAssignment_0"
    // InternalTgfi.g:3318:1: rule__Tgfi__ImportElAssignment_0 : ( ruleImport ) ;
    public final void rule__Tgfi__ImportElAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:3322:1: ( ( ruleImport ) )
            // InternalTgfi.g:3323:2: ( ruleImport )
            {
            // InternalTgfi.g:3323:2: ( ruleImport )
            // InternalTgfi.g:3324:3: ruleImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTgfiAccess().getImportElImportParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTgfiAccess().getImportElImportParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tgfi__ImportElAssignment_0"


    // $ANTLR start "rule__Tgfi__MainAssignment_1"
    // InternalTgfi.g:3333:1: rule__Tgfi__MainAssignment_1 : ( ruleMainTgf ) ;
    public final void rule__Tgfi__MainAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:3337:1: ( ( ruleMainTgf ) )
            // InternalTgfi.g:3338:2: ( ruleMainTgf )
            {
            // InternalTgfi.g:3338:2: ( ruleMainTgf )
            // InternalTgfi.g:3339:3: ruleMainTgf
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTgfiAccess().getMainMainTgfParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMainTgf();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTgfiAccess().getMainMainTgfParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tgfi__MainAssignment_1"


    // $ANTLR start "rule__Import__ImportURIAssignment_1"
    // InternalTgfi.g:3348:1: rule__Import__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Import__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:3352:1: ( ( RULE_STRING ) )
            // InternalTgfi.g:3353:2: ( RULE_STRING )
            {
            // InternalTgfi.g:3353:2: ( RULE_STRING )
            // InternalTgfi.g:3354:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__ImportURIAssignment_1"


    // $ANTLR start "rule__MainTgf__NameAssignment_1"
    // InternalTgfi.g:3363:1: rule__MainTgf__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MainTgf__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:3367:1: ( ( RULE_ID ) )
            // InternalTgfi.g:3368:2: ( RULE_ID )
            {
            // InternalTgfi.g:3368:2: ( RULE_ID )
            // InternalTgfi.g:3369:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainTgfAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainTgfAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainTgf__NameAssignment_1"


    // $ANTLR start "rule__MainTgf__GenPackageAssignment_3_2"
    // InternalTgfi.g:3378:1: rule__MainTgf__GenPackageAssignment_3_2 : ( RULE_STRING ) ;
    public final void rule__MainTgf__GenPackageAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:3382:1: ( ( RULE_STRING ) )
            // InternalTgfi.g:3383:2: ( RULE_STRING )
            {
            // InternalTgfi.g:3383:2: ( RULE_STRING )
            // InternalTgfi.g:3384:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainTgfAccess().getGenPackageSTRINGTerminalRuleCall_3_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainTgfAccess().getGenPackageSTRINGTerminalRuleCall_3_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainTgf__GenPackageAssignment_3_2"


    // $ANTLR start "rule__MainTgf__SatNameAssignment_4_2"
    // InternalTgfi.g:3393:1: rule__MainTgf__SatNameAssignment_4_2 : ( RULE_STRING ) ;
    public final void rule__MainTgf__SatNameAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:3397:1: ( ( RULE_STRING ) )
            // InternalTgfi.g:3398:2: ( RULE_STRING )
            {
            // InternalTgfi.g:3398:2: ( RULE_STRING )
            // InternalTgfi.g:3399:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainTgfAccess().getSatNameSTRINGTerminalRuleCall_4_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainTgfAccess().getSatNameSTRINGTerminalRuleCall_4_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainTgf__SatNameAssignment_4_2"


    // $ANTLR start "rule__MainTgf__VersionNameAssignment_5_2"
    // InternalTgfi.g:3408:1: rule__MainTgf__VersionNameAssignment_5_2 : ( RULE_STRING ) ;
    public final void rule__MainTgf__VersionNameAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:3412:1: ( ( RULE_STRING ) )
            // InternalTgfi.g:3413:2: ( RULE_STRING )
            {
            // InternalTgfi.g:3413:2: ( RULE_STRING )
            // InternalTgfi.g:3414:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainTgfAccess().getVersionNameSTRINGTerminalRuleCall_5_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainTgfAccess().getVersionNameSTRINGTerminalRuleCall_5_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainTgf__VersionNameAssignment_5_2"


    // $ANTLR start "rule__MainTgf__StatusNameAssignment_6_2"
    // InternalTgfi.g:3423:1: rule__MainTgf__StatusNameAssignment_6_2 : ( RULE_STRING ) ;
    public final void rule__MainTgf__StatusNameAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:3427:1: ( ( RULE_STRING ) )
            // InternalTgfi.g:3428:2: ( RULE_STRING )
            {
            // InternalTgfi.g:3428:2: ( RULE_STRING )
            // InternalTgfi.g:3429:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainTgfAccess().getStatusNameSTRINGTerminalRuleCall_6_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainTgfAccess().getStatusNameSTRINGTerminalRuleCall_6_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainTgf__StatusNameAssignment_6_2"


    // $ANTLR start "rule__MainTgf__ObjectiveNameAssignment_7_2"
    // InternalTgfi.g:3438:1: rule__MainTgf__ObjectiveNameAssignment_7_2 : ( RULE_STRING ) ;
    public final void rule__MainTgf__ObjectiveNameAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:3442:1: ( ( RULE_STRING ) )
            // InternalTgfi.g:3443:2: ( RULE_STRING )
            {
            // InternalTgfi.g:3443:2: ( RULE_STRING )
            // InternalTgfi.g:3444:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainTgfAccess().getObjectiveNameSTRINGTerminalRuleCall_7_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainTgfAccess().getObjectiveNameSTRINGTerminalRuleCall_7_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainTgf__ObjectiveNameAssignment_7_2"


    // $ANTLR start "rule__MainTgf__HlfunctionNameAssignment_8_2"
    // InternalTgfi.g:3453:1: rule__MainTgf__HlfunctionNameAssignment_8_2 : ( RULE_STRING ) ;
    public final void rule__MainTgf__HlfunctionNameAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:3457:1: ( ( RULE_STRING ) )
            // InternalTgfi.g:3458:2: ( RULE_STRING )
            {
            // InternalTgfi.g:3458:2: ( RULE_STRING )
            // InternalTgfi.g:3459:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainTgfAccess().getHlfunctionNameSTRINGTerminalRuleCall_8_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainTgfAccess().getHlfunctionNameSTRINGTerminalRuleCall_8_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainTgf__HlfunctionNameAssignment_8_2"


    // $ANTLR start "rule__MainTgf__RulesAssignment_9_2"
    // InternalTgfi.g:3468:1: rule__MainTgf__RulesAssignment_9_2 : ( ruleRule ) ;
    public final void rule__MainTgf__RulesAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:3472:1: ( ( ruleRule ) )
            // InternalTgfi.g:3473:2: ( ruleRule )
            {
            // InternalTgfi.g:3473:2: ( ruleRule )
            // InternalTgfi.g:3474:3: ruleRule
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainTgfAccess().getRulesRuleParserRuleCall_9_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainTgfAccess().getRulesRuleParserRuleCall_9_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainTgf__RulesAssignment_9_2"


    // $ANTLR start "rule__MainTgf__ProfAssignment_10"
    // InternalTgfi.g:3483:1: rule__MainTgf__ProfAssignment_10 : ( ruleProfile ) ;
    public final void rule__MainTgf__ProfAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:3487:1: ( ( ruleProfile ) )
            // InternalTgfi.g:3488:2: ( ruleProfile )
            {
            // InternalTgfi.g:3488:2: ( ruleProfile )
            // InternalTgfi.g:3489:3: ruleProfile
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainTgfAccess().getProfProfileParserRuleCall_10_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleProfile();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainTgfAccess().getProfProfileParserRuleCall_10_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainTgf__ProfAssignment_10"


    // $ANTLR start "rule__Profile__NameAssignment_1"
    // InternalTgfi.g:3498:1: rule__Profile__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Profile__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:3502:1: ( ( RULE_ID ) )
            // InternalTgfi.g:3503:2: ( RULE_ID )
            {
            // InternalTgfi.g:3503:2: ( RULE_ID )
            // InternalTgfi.g:3504:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProfileAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProfileAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__NameAssignment_1"


    // $ANTLR start "rule__Profile__ProfNameAssignment_3_2"
    // InternalTgfi.g:3513:1: rule__Profile__ProfNameAssignment_3_2 : ( RULE_STRING ) ;
    public final void rule__Profile__ProfNameAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:3517:1: ( ( RULE_STRING ) )
            // InternalTgfi.g:3518:2: ( RULE_STRING )
            {
            // InternalTgfi.g:3518:2: ( RULE_STRING )
            // InternalTgfi.g:3519:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProfileAccess().getProfNameSTRINGTerminalRuleCall_3_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProfileAccess().getProfNameSTRINGTerminalRuleCall_3_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__ProfNameAssignment_3_2"


    // $ANTLR start "rule__Profile__DescrNameAssignment_4_2"
    // InternalTgfi.g:3528:1: rule__Profile__DescrNameAssignment_4_2 : ( RULE_STRING ) ;
    public final void rule__Profile__DescrNameAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:3532:1: ( ( RULE_STRING ) )
            // InternalTgfi.g:3533:2: ( RULE_STRING )
            {
            // InternalTgfi.g:3533:2: ( RULE_STRING )
            // InternalTgfi.g:3534:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProfileAccess().getDescrNameSTRINGTerminalRuleCall_4_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProfileAccess().getDescrNameSTRINGTerminalRuleCall_4_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__DescrNameAssignment_4_2"


    // $ANTLR start "rule__Profile__FeatNameAssignment_5_2"
    // InternalTgfi.g:3543:1: rule__Profile__FeatNameAssignment_5_2 : ( RULE_STRING ) ;
    public final void rule__Profile__FeatNameAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:3547:1: ( ( RULE_STRING ) )
            // InternalTgfi.g:3548:2: ( RULE_STRING )
            {
            // InternalTgfi.g:3548:2: ( RULE_STRING )
            // InternalTgfi.g:3549:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProfileAccess().getFeatNameSTRINGTerminalRuleCall_5_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProfileAccess().getFeatNameSTRINGTerminalRuleCall_5_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__FeatNameAssignment_5_2"


    // $ANTLR start "rule__Profile__FunctionNameAssignment_6_2"
    // InternalTgfi.g:3558:1: rule__Profile__FunctionNameAssignment_6_2 : ( RULE_STRING ) ;
    public final void rule__Profile__FunctionNameAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:3562:1: ( ( RULE_STRING ) )
            // InternalTgfi.g:3563:2: ( RULE_STRING )
            {
            // InternalTgfi.g:3563:2: ( RULE_STRING )
            // InternalTgfi.g:3564:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProfileAccess().getFunctionNameSTRINGTerminalRuleCall_6_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProfileAccess().getFunctionNameSTRINGTerminalRuleCall_6_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__FunctionNameAssignment_6_2"


    // $ANTLR start "rule__Profile__ActorAssignment_8"
    // InternalTgfi.g:3573:1: rule__Profile__ActorAssignment_8 : ( ruleActor ) ;
    public final void rule__Profile__ActorAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:3577:1: ( ( ruleActor ) )
            // InternalTgfi.g:3578:2: ( ruleActor )
            {
            // InternalTgfi.g:3578:2: ( ruleActor )
            // InternalTgfi.g:3579:3: ruleActor
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProfileAccess().getActorActorParserRuleCall_8_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleActor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProfileAccess().getActorActorParserRuleCall_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__ActorAssignment_8"


    // $ANTLR start "rule__Profile__TransactionAssignment_10"
    // InternalTgfi.g:3588:1: rule__Profile__TransactionAssignment_10 : ( ruleTransaction ) ;
    public final void rule__Profile__TransactionAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:3592:1: ( ( ruleTransaction ) )
            // InternalTgfi.g:3593:2: ( ruleTransaction )
            {
            // InternalTgfi.g:3593:2: ( ruleTransaction )
            // InternalTgfi.g:3594:3: ruleTransaction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProfileAccess().getTransactionTransactionParserRuleCall_10_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTransaction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProfileAccess().getTransactionTransactionParserRuleCall_10_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__TransactionAssignment_10"


    // $ANTLR start "rule__Profile__DomainAssignment_12"
    // InternalTgfi.g:3603:1: rule__Profile__DomainAssignment_12 : ( ruleDomain ) ;
    public final void rule__Profile__DomainAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:3607:1: ( ( ruleDomain ) )
            // InternalTgfi.g:3608:2: ( ruleDomain )
            {
            // InternalTgfi.g:3608:2: ( ruleDomain )
            // InternalTgfi.g:3609:3: ruleDomain
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProfileAccess().getDomainDomainParserRuleCall_12_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDomain();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProfileAccess().getDomainDomainParserRuleCall_12_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__DomainAssignment_12"


    // $ANTLR start "rule__Profile__QualityattrAssignment_14"
    // InternalTgfi.g:3618:1: rule__Profile__QualityattrAssignment_14 : ( ruleQualityAttr ) ;
    public final void rule__Profile__QualityattrAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:3622:1: ( ( ruleQualityAttr ) )
            // InternalTgfi.g:3623:2: ( ruleQualityAttr )
            {
            // InternalTgfi.g:3623:2: ( ruleQualityAttr )
            // InternalTgfi.g:3624:3: ruleQualityAttr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProfileAccess().getQualityattrQualityAttrParserRuleCall_14_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualityAttr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProfileAccess().getQualityattrQualityAttrParserRuleCall_14_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__QualityattrAssignment_14"


    // $ANTLR start "rule__Profile__SecreAssignment_16"
    // InternalTgfi.g:3633:1: rule__Profile__SecreAssignment_16 : ( ruleSecRequirements ) ;
    public final void rule__Profile__SecreAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:3637:1: ( ( ruleSecRequirements ) )
            // InternalTgfi.g:3638:2: ( ruleSecRequirements )
            {
            // InternalTgfi.g:3638:2: ( ruleSecRequirements )
            // InternalTgfi.g:3639:3: ruleSecRequirements
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProfileAccess().getSecreSecRequirementsParserRuleCall_16_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSecRequirements();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProfileAccess().getSecreSecRequirementsParserRuleCall_16_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__SecreAssignment_16"


    // $ANTLR start "rule__SecRequirements__SecreGoalAssignment_1_2"
    // InternalTgfi.g:3648:1: rule__SecRequirements__SecreGoalAssignment_1_2 : ( RULE_STRING ) ;
    public final void rule__SecRequirements__SecreGoalAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:3652:1: ( ( RULE_STRING ) )
            // InternalTgfi.g:3653:2: ( RULE_STRING )
            {
            // InternalTgfi.g:3653:2: ( RULE_STRING )
            // InternalTgfi.g:3654:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSecRequirementsAccess().getSecreGoalSTRINGTerminalRuleCall_1_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSecRequirementsAccess().getSecreGoalSTRINGTerminalRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecRequirements__SecreGoalAssignment_1_2"


    // $ANTLR start "rule__SecRequirements__SecreLevelAssignment_2_2"
    // InternalTgfi.g:3663:1: rule__SecRequirements__SecreLevelAssignment_2_2 : ( RULE_STRING ) ;
    public final void rule__SecRequirements__SecreLevelAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:3667:1: ( ( RULE_STRING ) )
            // InternalTgfi.g:3668:2: ( RULE_STRING )
            {
            // InternalTgfi.g:3668:2: ( RULE_STRING )
            // InternalTgfi.g:3669:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSecRequirementsAccess().getSecreLevelSTRINGTerminalRuleCall_2_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSecRequirementsAccess().getSecreLevelSTRINGTerminalRuleCall_2_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecRequirements__SecreLevelAssignment_2_2"


    // $ANTLR start "rule__SecRequirements__SecreLocationAssignment_3_2"
    // InternalTgfi.g:3678:1: rule__SecRequirements__SecreLocationAssignment_3_2 : ( RULE_STRING ) ;
    public final void rule__SecRequirements__SecreLocationAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:3682:1: ( ( RULE_STRING ) )
            // InternalTgfi.g:3683:2: ( RULE_STRING )
            {
            // InternalTgfi.g:3683:2: ( RULE_STRING )
            // InternalTgfi.g:3684:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSecRequirementsAccess().getSecreLocationSTRINGTerminalRuleCall_3_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSecRequirementsAccess().getSecreLocationSTRINGTerminalRuleCall_3_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecRequirements__SecreLocationAssignment_3_2"


    // $ANTLR start "rule__SecRequirements__SecreStateAssignment_4_2"
    // InternalTgfi.g:3693:1: rule__SecRequirements__SecreStateAssignment_4_2 : ( RULE_STRING ) ;
    public final void rule__SecRequirements__SecreStateAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:3697:1: ( ( RULE_STRING ) )
            // InternalTgfi.g:3698:2: ( RULE_STRING )
            {
            // InternalTgfi.g:3698:2: ( RULE_STRING )
            // InternalTgfi.g:3699:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSecRequirementsAccess().getSecreStateSTRINGTerminalRuleCall_4_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSecRequirementsAccess().getSecreStateSTRINGTerminalRuleCall_4_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecRequirements__SecreStateAssignment_4_2"


    // $ANTLR start "rule__SecRequirements__SecreDescrAssignment_5_2"
    // InternalTgfi.g:3708:1: rule__SecRequirements__SecreDescrAssignment_5_2 : ( RULE_STRING ) ;
    public final void rule__SecRequirements__SecreDescrAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:3712:1: ( ( RULE_STRING ) )
            // InternalTgfi.g:3713:2: ( RULE_STRING )
            {
            // InternalTgfi.g:3713:2: ( RULE_STRING )
            // InternalTgfi.g:3714:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSecRequirementsAccess().getSecreDescrSTRINGTerminalRuleCall_5_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSecRequirementsAccess().getSecreDescrSTRINGTerminalRuleCall_5_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecRequirements__SecreDescrAssignment_5_2"


    // $ANTLR start "rule__SecRequirements__SecreCategoryAssignment_6_2"
    // InternalTgfi.g:3723:1: rule__SecRequirements__SecreCategoryAssignment_6_2 : ( RULE_STRING ) ;
    public final void rule__SecRequirements__SecreCategoryAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:3727:1: ( ( RULE_STRING ) )
            // InternalTgfi.g:3728:2: ( RULE_STRING )
            {
            // InternalTgfi.g:3728:2: ( RULE_STRING )
            // InternalTgfi.g:3729:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSecRequirementsAccess().getSecreCategorySTRINGTerminalRuleCall_6_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSecRequirementsAccess().getSecreCategorySTRINGTerminalRuleCall_6_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecRequirements__SecreCategoryAssignment_6_2"

    // $ANTLR start synpred1_InternalTgfi
    public final void synpred1_InternalTgfi_fragment() throws RecognitionException {   
        // InternalTgfi.g:3265:8: ( rule__Tgfi__ImportElAssignment_0 )
        // InternalTgfi.g:3265:9: rule__Tgfi__ImportElAssignment_0
        {
        pushFollow(FOLLOW_2);
        rule__Tgfi__ImportElAssignment_0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalTgfi

    // Delegated rules

    public final boolean synpred1_InternalTgfi() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalTgfi_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000FE8000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000FE8002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000E1020000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000004004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000003F00004000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000001802L});

}
