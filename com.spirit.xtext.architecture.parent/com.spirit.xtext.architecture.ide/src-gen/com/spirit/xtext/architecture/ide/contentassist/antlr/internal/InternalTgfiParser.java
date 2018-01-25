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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'ArchitecturalElement'", "'{'", "'}'", "'JavaPackage'", "':'", "'Name'", "'Version'", "'Status'", "'Objective'", "'HL_Function'", "'Rules:'", "'Profile'", "'actors:'", "'transactions:'", "'domains:'", "'quality_attributes:'", "'Description'", "'Features'", "'Function'", "'('", "','", "')'", "'['", "']'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
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
    public static final int T__20=20;
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


    // $ANTLR start "entryRuleActor"
    // InternalTgfi.g:153:1: entryRuleActor : ruleActor EOF ;
    public final void entryRuleActor() throws RecognitionException {
        try {
            // InternalTgfi.g:154:1: ( ruleActor EOF )
            // InternalTgfi.g:155:1: ruleActor EOF
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
    // InternalTgfi.g:162:1: ruleActor : ( RULE_STRING ) ;
    public final void ruleActor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:166:2: ( ( RULE_STRING ) )
            // InternalTgfi.g:167:2: ( RULE_STRING )
            {
            // InternalTgfi.g:167:2: ( RULE_STRING )
            // InternalTgfi.g:168:3: RULE_STRING
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
    // InternalTgfi.g:178:1: entryRuleTransaction : ruleTransaction EOF ;
    public final void entryRuleTransaction() throws RecognitionException {
        try {
            // InternalTgfi.g:179:1: ( ruleTransaction EOF )
            // InternalTgfi.g:180:1: ruleTransaction EOF
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
    // InternalTgfi.g:187:1: ruleTransaction : ( ( rule__Transaction__Group__0 ) ) ;
    public final void ruleTransaction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:191:2: ( ( ( rule__Transaction__Group__0 ) ) )
            // InternalTgfi.g:192:2: ( ( rule__Transaction__Group__0 ) )
            {
            // InternalTgfi.g:192:2: ( ( rule__Transaction__Group__0 ) )
            // InternalTgfi.g:193:3: ( rule__Transaction__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransactionAccess().getGroup()); 
            }
            // InternalTgfi.g:194:3: ( rule__Transaction__Group__0 )
            // InternalTgfi.g:194:4: rule__Transaction__Group__0
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
    // InternalTgfi.g:203:1: entryRuleDomain : ruleDomain EOF ;
    public final void entryRuleDomain() throws RecognitionException {
        try {
            // InternalTgfi.g:204:1: ( ruleDomain EOF )
            // InternalTgfi.g:205:1: ruleDomain EOF
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
    // InternalTgfi.g:212:1: ruleDomain : ( RULE_STRING ) ;
    public final void ruleDomain() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:216:2: ( ( RULE_STRING ) )
            // InternalTgfi.g:217:2: ( RULE_STRING )
            {
            // InternalTgfi.g:217:2: ( RULE_STRING )
            // InternalTgfi.g:218:3: RULE_STRING
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
    // InternalTgfi.g:228:1: entryRuleQualityAttr : ruleQualityAttr EOF ;
    public final void entryRuleQualityAttr() throws RecognitionException {
        try {
            // InternalTgfi.g:229:1: ( ruleQualityAttr EOF )
            // InternalTgfi.g:230:1: ruleQualityAttr EOF
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
    // InternalTgfi.g:237:1: ruleQualityAttr : ( ( rule__QualityAttr__Group__0 ) ) ;
    public final void ruleQualityAttr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:241:2: ( ( ( rule__QualityAttr__Group__0 ) ) )
            // InternalTgfi.g:242:2: ( ( rule__QualityAttr__Group__0 ) )
            {
            // InternalTgfi.g:242:2: ( ( rule__QualityAttr__Group__0 ) )
            // InternalTgfi.g:243:3: ( rule__QualityAttr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualityAttrAccess().getGroup()); 
            }
            // InternalTgfi.g:244:3: ( rule__QualityAttr__Group__0 )
            // InternalTgfi.g:244:4: rule__QualityAttr__Group__0
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
    // InternalTgfi.g:253:1: entryRuleQualityAttrID : ruleQualityAttrID EOF ;
    public final void entryRuleQualityAttrID() throws RecognitionException {
        try {
            // InternalTgfi.g:254:1: ( ruleQualityAttrID EOF )
            // InternalTgfi.g:255:1: ruleQualityAttrID EOF
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
    // InternalTgfi.g:262:1: ruleQualityAttrID : ( RULE_ID ) ;
    public final void ruleQualityAttrID() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:266:2: ( ( RULE_ID ) )
            // InternalTgfi.g:267:2: ( RULE_ID )
            {
            // InternalTgfi.g:267:2: ( RULE_ID )
            // InternalTgfi.g:268:3: RULE_ID
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
    // InternalTgfi.g:278:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalTgfi.g:279:1: ( ruleRule EOF )
            // InternalTgfi.g:280:1: ruleRule EOF
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
    // InternalTgfi.g:287:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:291:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalTgfi.g:292:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalTgfi.g:292:2: ( ( rule__Rule__Group__0 ) )
            // InternalTgfi.g:293:3: ( rule__Rule__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getGroup()); 
            }
            // InternalTgfi.g:294:3: ( rule__Rule__Group__0 )
            // InternalTgfi.g:294:4: rule__Rule__Group__0
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
    // InternalTgfi.g:303:1: entryRuleRuleId : ruleRuleId EOF ;
    public final void entryRuleRuleId() throws RecognitionException {
        try {
            // InternalTgfi.g:304:1: ( ruleRuleId EOF )
            // InternalTgfi.g:305:1: ruleRuleId EOF
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
    // InternalTgfi.g:312:1: ruleRuleId : ( RULE_ID ) ;
    public final void ruleRuleId() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:316:2: ( ( RULE_ID ) )
            // InternalTgfi.g:317:2: ( RULE_ID )
            {
            // InternalTgfi.g:317:2: ( RULE_ID )
            // InternalTgfi.g:318:3: RULE_ID
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
    // InternalTgfi.g:327:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:331:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalTgfi.g:332:2: rule__Import__Group__0__Impl rule__Import__Group__1
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
    // InternalTgfi.g:339:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:343:1: ( ( 'import' ) )
            // InternalTgfi.g:344:1: ( 'import' )
            {
            // InternalTgfi.g:344:1: ( 'import' )
            // InternalTgfi.g:345:2: 'import'
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
    // InternalTgfi.g:354:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:358:1: ( rule__Import__Group__1__Impl )
            // InternalTgfi.g:359:2: rule__Import__Group__1__Impl
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
    // InternalTgfi.g:365:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportURIAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:369:1: ( ( ( rule__Import__ImportURIAssignment_1 ) ) )
            // InternalTgfi.g:370:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            {
            // InternalTgfi.g:370:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            // InternalTgfi.g:371:2: ( rule__Import__ImportURIAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportURIAssignment_1()); 
            }
            // InternalTgfi.g:372:2: ( rule__Import__ImportURIAssignment_1 )
            // InternalTgfi.g:372:3: rule__Import__ImportURIAssignment_1
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
    // InternalTgfi.g:381:1: rule__MainTgf__Group__0 : rule__MainTgf__Group__0__Impl rule__MainTgf__Group__1 ;
    public final void rule__MainTgf__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:385:1: ( rule__MainTgf__Group__0__Impl rule__MainTgf__Group__1 )
            // InternalTgfi.g:386:2: rule__MainTgf__Group__0__Impl rule__MainTgf__Group__1
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
    // InternalTgfi.g:393:1: rule__MainTgf__Group__0__Impl : ( 'ArchitecturalElement' ) ;
    public final void rule__MainTgf__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:397:1: ( ( 'ArchitecturalElement' ) )
            // InternalTgfi.g:398:1: ( 'ArchitecturalElement' )
            {
            // InternalTgfi.g:398:1: ( 'ArchitecturalElement' )
            // InternalTgfi.g:399:2: 'ArchitecturalElement'
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
    // InternalTgfi.g:408:1: rule__MainTgf__Group__1 : rule__MainTgf__Group__1__Impl rule__MainTgf__Group__2 ;
    public final void rule__MainTgf__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:412:1: ( rule__MainTgf__Group__1__Impl rule__MainTgf__Group__2 )
            // InternalTgfi.g:413:2: rule__MainTgf__Group__1__Impl rule__MainTgf__Group__2
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
    // InternalTgfi.g:420:1: rule__MainTgf__Group__1__Impl : ( ( rule__MainTgf__NameAssignment_1 ) ) ;
    public final void rule__MainTgf__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:424:1: ( ( ( rule__MainTgf__NameAssignment_1 ) ) )
            // InternalTgfi.g:425:1: ( ( rule__MainTgf__NameAssignment_1 ) )
            {
            // InternalTgfi.g:425:1: ( ( rule__MainTgf__NameAssignment_1 ) )
            // InternalTgfi.g:426:2: ( rule__MainTgf__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainTgfAccess().getNameAssignment_1()); 
            }
            // InternalTgfi.g:427:2: ( rule__MainTgf__NameAssignment_1 )
            // InternalTgfi.g:427:3: rule__MainTgf__NameAssignment_1
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
    // InternalTgfi.g:435:1: rule__MainTgf__Group__2 : rule__MainTgf__Group__2__Impl rule__MainTgf__Group__3 ;
    public final void rule__MainTgf__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:439:1: ( rule__MainTgf__Group__2__Impl rule__MainTgf__Group__3 )
            // InternalTgfi.g:440:2: rule__MainTgf__Group__2__Impl rule__MainTgf__Group__3
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
    // InternalTgfi.g:447:1: rule__MainTgf__Group__2__Impl : ( '{' ) ;
    public final void rule__MainTgf__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:451:1: ( ( '{' ) )
            // InternalTgfi.g:452:1: ( '{' )
            {
            // InternalTgfi.g:452:1: ( '{' )
            // InternalTgfi.g:453:2: '{'
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
    // InternalTgfi.g:462:1: rule__MainTgf__Group__3 : rule__MainTgf__Group__3__Impl rule__MainTgf__Group__4 ;
    public final void rule__MainTgf__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:466:1: ( rule__MainTgf__Group__3__Impl rule__MainTgf__Group__4 )
            // InternalTgfi.g:467:2: rule__MainTgf__Group__3__Impl rule__MainTgf__Group__4
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
    // InternalTgfi.g:474:1: rule__MainTgf__Group__3__Impl : ( ( rule__MainTgf__Group_3__0 )? ) ;
    public final void rule__MainTgf__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:478:1: ( ( ( rule__MainTgf__Group_3__0 )? ) )
            // InternalTgfi.g:479:1: ( ( rule__MainTgf__Group_3__0 )? )
            {
            // InternalTgfi.g:479:1: ( ( rule__MainTgf__Group_3__0 )? )
            // InternalTgfi.g:480:2: ( rule__MainTgf__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainTgfAccess().getGroup_3()); 
            }
            // InternalTgfi.g:481:2: ( rule__MainTgf__Group_3__0 )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==15) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalTgfi.g:481:3: rule__MainTgf__Group_3__0
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
    // InternalTgfi.g:489:1: rule__MainTgf__Group__4 : rule__MainTgf__Group__4__Impl rule__MainTgf__Group__5 ;
    public final void rule__MainTgf__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:493:1: ( rule__MainTgf__Group__4__Impl rule__MainTgf__Group__5 )
            // InternalTgfi.g:494:2: rule__MainTgf__Group__4__Impl rule__MainTgf__Group__5
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
    // InternalTgfi.g:501:1: rule__MainTgf__Group__4__Impl : ( ( rule__MainTgf__Group_4__0 )? ) ;
    public final void rule__MainTgf__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:505:1: ( ( ( rule__MainTgf__Group_4__0 )? ) )
            // InternalTgfi.g:506:1: ( ( rule__MainTgf__Group_4__0 )? )
            {
            // InternalTgfi.g:506:1: ( ( rule__MainTgf__Group_4__0 )? )
            // InternalTgfi.g:507:2: ( rule__MainTgf__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainTgfAccess().getGroup_4()); 
            }
            // InternalTgfi.g:508:2: ( rule__MainTgf__Group_4__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==17) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalTgfi.g:508:3: rule__MainTgf__Group_4__0
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
    // InternalTgfi.g:516:1: rule__MainTgf__Group__5 : rule__MainTgf__Group__5__Impl rule__MainTgf__Group__6 ;
    public final void rule__MainTgf__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:520:1: ( rule__MainTgf__Group__5__Impl rule__MainTgf__Group__6 )
            // InternalTgfi.g:521:2: rule__MainTgf__Group__5__Impl rule__MainTgf__Group__6
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
    // InternalTgfi.g:528:1: rule__MainTgf__Group__5__Impl : ( ( rule__MainTgf__Group_5__0 )? ) ;
    public final void rule__MainTgf__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:532:1: ( ( ( rule__MainTgf__Group_5__0 )? ) )
            // InternalTgfi.g:533:1: ( ( rule__MainTgf__Group_5__0 )? )
            {
            // InternalTgfi.g:533:1: ( ( rule__MainTgf__Group_5__0 )? )
            // InternalTgfi.g:534:2: ( rule__MainTgf__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainTgfAccess().getGroup_5()); 
            }
            // InternalTgfi.g:535:2: ( rule__MainTgf__Group_5__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalTgfi.g:535:3: rule__MainTgf__Group_5__0
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
    // InternalTgfi.g:543:1: rule__MainTgf__Group__6 : rule__MainTgf__Group__6__Impl rule__MainTgf__Group__7 ;
    public final void rule__MainTgf__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:547:1: ( rule__MainTgf__Group__6__Impl rule__MainTgf__Group__7 )
            // InternalTgfi.g:548:2: rule__MainTgf__Group__6__Impl rule__MainTgf__Group__7
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
    // InternalTgfi.g:555:1: rule__MainTgf__Group__6__Impl : ( ( rule__MainTgf__Group_6__0 )? ) ;
    public final void rule__MainTgf__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:559:1: ( ( ( rule__MainTgf__Group_6__0 )? ) )
            // InternalTgfi.g:560:1: ( ( rule__MainTgf__Group_6__0 )? )
            {
            // InternalTgfi.g:560:1: ( ( rule__MainTgf__Group_6__0 )? )
            // InternalTgfi.g:561:2: ( rule__MainTgf__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainTgfAccess().getGroup_6()); 
            }
            // InternalTgfi.g:562:2: ( rule__MainTgf__Group_6__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalTgfi.g:562:3: rule__MainTgf__Group_6__0
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
    // InternalTgfi.g:570:1: rule__MainTgf__Group__7 : rule__MainTgf__Group__7__Impl rule__MainTgf__Group__8 ;
    public final void rule__MainTgf__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:574:1: ( rule__MainTgf__Group__7__Impl rule__MainTgf__Group__8 )
            // InternalTgfi.g:575:2: rule__MainTgf__Group__7__Impl rule__MainTgf__Group__8
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
    // InternalTgfi.g:582:1: rule__MainTgf__Group__7__Impl : ( ( rule__MainTgf__Group_7__0 )? ) ;
    public final void rule__MainTgf__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:586:1: ( ( ( rule__MainTgf__Group_7__0 )? ) )
            // InternalTgfi.g:587:1: ( ( rule__MainTgf__Group_7__0 )? )
            {
            // InternalTgfi.g:587:1: ( ( rule__MainTgf__Group_7__0 )? )
            // InternalTgfi.g:588:2: ( rule__MainTgf__Group_7__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainTgfAccess().getGroup_7()); 
            }
            // InternalTgfi.g:589:2: ( rule__MainTgf__Group_7__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalTgfi.g:589:3: rule__MainTgf__Group_7__0
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
    // InternalTgfi.g:597:1: rule__MainTgf__Group__8 : rule__MainTgf__Group__8__Impl rule__MainTgf__Group__9 ;
    public final void rule__MainTgf__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:601:1: ( rule__MainTgf__Group__8__Impl rule__MainTgf__Group__9 )
            // InternalTgfi.g:602:2: rule__MainTgf__Group__8__Impl rule__MainTgf__Group__9
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
    // InternalTgfi.g:609:1: rule__MainTgf__Group__8__Impl : ( ( rule__MainTgf__Group_8__0 )? ) ;
    public final void rule__MainTgf__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:613:1: ( ( ( rule__MainTgf__Group_8__0 )? ) )
            // InternalTgfi.g:614:1: ( ( rule__MainTgf__Group_8__0 )? )
            {
            // InternalTgfi.g:614:1: ( ( rule__MainTgf__Group_8__0 )? )
            // InternalTgfi.g:615:2: ( rule__MainTgf__Group_8__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainTgfAccess().getGroup_8()); 
            }
            // InternalTgfi.g:616:2: ( rule__MainTgf__Group_8__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalTgfi.g:616:3: rule__MainTgf__Group_8__0
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
    // InternalTgfi.g:624:1: rule__MainTgf__Group__9 : rule__MainTgf__Group__9__Impl rule__MainTgf__Group__10 ;
    public final void rule__MainTgf__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:628:1: ( rule__MainTgf__Group__9__Impl rule__MainTgf__Group__10 )
            // InternalTgfi.g:629:2: rule__MainTgf__Group__9__Impl rule__MainTgf__Group__10
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
    // InternalTgfi.g:636:1: rule__MainTgf__Group__9__Impl : ( ( rule__MainTgf__Group_9__0 )* ) ;
    public final void rule__MainTgf__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:640:1: ( ( ( rule__MainTgf__Group_9__0 )* ) )
            // InternalTgfi.g:641:1: ( ( rule__MainTgf__Group_9__0 )* )
            {
            // InternalTgfi.g:641:1: ( ( rule__MainTgf__Group_9__0 )* )
            // InternalTgfi.g:642:2: ( rule__MainTgf__Group_9__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainTgfAccess().getGroup_9()); 
            }
            // InternalTgfi.g:643:2: ( rule__MainTgf__Group_9__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==22) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalTgfi.g:643:3: rule__MainTgf__Group_9__0
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
    // InternalTgfi.g:651:1: rule__MainTgf__Group__10 : rule__MainTgf__Group__10__Impl rule__MainTgf__Group__11 ;
    public final void rule__MainTgf__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:655:1: ( rule__MainTgf__Group__10__Impl rule__MainTgf__Group__11 )
            // InternalTgfi.g:656:2: rule__MainTgf__Group__10__Impl rule__MainTgf__Group__11
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
    // InternalTgfi.g:663:1: rule__MainTgf__Group__10__Impl : ( ( ( rule__MainTgf__ProfAssignment_10 ) ) ( ( rule__MainTgf__ProfAssignment_10 )* ) ) ;
    public final void rule__MainTgf__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:667:1: ( ( ( ( rule__MainTgf__ProfAssignment_10 ) ) ( ( rule__MainTgf__ProfAssignment_10 )* ) ) )
            // InternalTgfi.g:668:1: ( ( ( rule__MainTgf__ProfAssignment_10 ) ) ( ( rule__MainTgf__ProfAssignment_10 )* ) )
            {
            // InternalTgfi.g:668:1: ( ( ( rule__MainTgf__ProfAssignment_10 ) ) ( ( rule__MainTgf__ProfAssignment_10 )* ) )
            // InternalTgfi.g:669:2: ( ( rule__MainTgf__ProfAssignment_10 ) ) ( ( rule__MainTgf__ProfAssignment_10 )* )
            {
            // InternalTgfi.g:669:2: ( ( rule__MainTgf__ProfAssignment_10 ) )
            // InternalTgfi.g:670:3: ( rule__MainTgf__ProfAssignment_10 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainTgfAccess().getProfAssignment_10()); 
            }
            // InternalTgfi.g:671:3: ( rule__MainTgf__ProfAssignment_10 )
            // InternalTgfi.g:671:4: rule__MainTgf__ProfAssignment_10
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

            // InternalTgfi.g:674:2: ( ( rule__MainTgf__ProfAssignment_10 )* )
            // InternalTgfi.g:675:3: ( rule__MainTgf__ProfAssignment_10 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainTgfAccess().getProfAssignment_10()); 
            }
            // InternalTgfi.g:676:3: ( rule__MainTgf__ProfAssignment_10 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==23) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalTgfi.g:676:4: rule__MainTgf__ProfAssignment_10
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
    // InternalTgfi.g:685:1: rule__MainTgf__Group__11 : rule__MainTgf__Group__11__Impl ;
    public final void rule__MainTgf__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:689:1: ( rule__MainTgf__Group__11__Impl )
            // InternalTgfi.g:690:2: rule__MainTgf__Group__11__Impl
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
    // InternalTgfi.g:696:1: rule__MainTgf__Group__11__Impl : ( '}' ) ;
    public final void rule__MainTgf__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:700:1: ( ( '}' ) )
            // InternalTgfi.g:701:1: ( '}' )
            {
            // InternalTgfi.g:701:1: ( '}' )
            // InternalTgfi.g:702:2: '}'
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
    // InternalTgfi.g:712:1: rule__MainTgf__Group_3__0 : rule__MainTgf__Group_3__0__Impl rule__MainTgf__Group_3__1 ;
    public final void rule__MainTgf__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:716:1: ( rule__MainTgf__Group_3__0__Impl rule__MainTgf__Group_3__1 )
            // InternalTgfi.g:717:2: rule__MainTgf__Group_3__0__Impl rule__MainTgf__Group_3__1
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
    // InternalTgfi.g:724:1: rule__MainTgf__Group_3__0__Impl : ( 'JavaPackage' ) ;
    public final void rule__MainTgf__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:728:1: ( ( 'JavaPackage' ) )
            // InternalTgfi.g:729:1: ( 'JavaPackage' )
            {
            // InternalTgfi.g:729:1: ( 'JavaPackage' )
            // InternalTgfi.g:730:2: 'JavaPackage'
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
    // InternalTgfi.g:739:1: rule__MainTgf__Group_3__1 : rule__MainTgf__Group_3__1__Impl rule__MainTgf__Group_3__2 ;
    public final void rule__MainTgf__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:743:1: ( rule__MainTgf__Group_3__1__Impl rule__MainTgf__Group_3__2 )
            // InternalTgfi.g:744:2: rule__MainTgf__Group_3__1__Impl rule__MainTgf__Group_3__2
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
    // InternalTgfi.g:751:1: rule__MainTgf__Group_3__1__Impl : ( ':' ) ;
    public final void rule__MainTgf__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:755:1: ( ( ':' ) )
            // InternalTgfi.g:756:1: ( ':' )
            {
            // InternalTgfi.g:756:1: ( ':' )
            // InternalTgfi.g:757:2: ':'
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
    // InternalTgfi.g:766:1: rule__MainTgf__Group_3__2 : rule__MainTgf__Group_3__2__Impl ;
    public final void rule__MainTgf__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:770:1: ( rule__MainTgf__Group_3__2__Impl )
            // InternalTgfi.g:771:2: rule__MainTgf__Group_3__2__Impl
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
    // InternalTgfi.g:777:1: rule__MainTgf__Group_3__2__Impl : ( ( rule__MainTgf__GenPackageAssignment_3_2 ) ) ;
    public final void rule__MainTgf__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:781:1: ( ( ( rule__MainTgf__GenPackageAssignment_3_2 ) ) )
            // InternalTgfi.g:782:1: ( ( rule__MainTgf__GenPackageAssignment_3_2 ) )
            {
            // InternalTgfi.g:782:1: ( ( rule__MainTgf__GenPackageAssignment_3_2 ) )
            // InternalTgfi.g:783:2: ( rule__MainTgf__GenPackageAssignment_3_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainTgfAccess().getGenPackageAssignment_3_2()); 
            }
            // InternalTgfi.g:784:2: ( rule__MainTgf__GenPackageAssignment_3_2 )
            // InternalTgfi.g:784:3: rule__MainTgf__GenPackageAssignment_3_2
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
    // InternalTgfi.g:793:1: rule__MainTgf__Group_4__0 : rule__MainTgf__Group_4__0__Impl rule__MainTgf__Group_4__1 ;
    public final void rule__MainTgf__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:797:1: ( rule__MainTgf__Group_4__0__Impl rule__MainTgf__Group_4__1 )
            // InternalTgfi.g:798:2: rule__MainTgf__Group_4__0__Impl rule__MainTgf__Group_4__1
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
    // InternalTgfi.g:805:1: rule__MainTgf__Group_4__0__Impl : ( 'Name' ) ;
    public final void rule__MainTgf__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:809:1: ( ( 'Name' ) )
            // InternalTgfi.g:810:1: ( 'Name' )
            {
            // InternalTgfi.g:810:1: ( 'Name' )
            // InternalTgfi.g:811:2: 'Name'
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
    // InternalTgfi.g:820:1: rule__MainTgf__Group_4__1 : rule__MainTgf__Group_4__1__Impl rule__MainTgf__Group_4__2 ;
    public final void rule__MainTgf__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:824:1: ( rule__MainTgf__Group_4__1__Impl rule__MainTgf__Group_4__2 )
            // InternalTgfi.g:825:2: rule__MainTgf__Group_4__1__Impl rule__MainTgf__Group_4__2
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
    // InternalTgfi.g:832:1: rule__MainTgf__Group_4__1__Impl : ( ':' ) ;
    public final void rule__MainTgf__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:836:1: ( ( ':' ) )
            // InternalTgfi.g:837:1: ( ':' )
            {
            // InternalTgfi.g:837:1: ( ':' )
            // InternalTgfi.g:838:2: ':'
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
    // InternalTgfi.g:847:1: rule__MainTgf__Group_4__2 : rule__MainTgf__Group_4__2__Impl ;
    public final void rule__MainTgf__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:851:1: ( rule__MainTgf__Group_4__2__Impl )
            // InternalTgfi.g:852:2: rule__MainTgf__Group_4__2__Impl
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
    // InternalTgfi.g:858:1: rule__MainTgf__Group_4__2__Impl : ( ( rule__MainTgf__SatNameAssignment_4_2 ) ) ;
    public final void rule__MainTgf__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:862:1: ( ( ( rule__MainTgf__SatNameAssignment_4_2 ) ) )
            // InternalTgfi.g:863:1: ( ( rule__MainTgf__SatNameAssignment_4_2 ) )
            {
            // InternalTgfi.g:863:1: ( ( rule__MainTgf__SatNameAssignment_4_2 ) )
            // InternalTgfi.g:864:2: ( rule__MainTgf__SatNameAssignment_4_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainTgfAccess().getSatNameAssignment_4_2()); 
            }
            // InternalTgfi.g:865:2: ( rule__MainTgf__SatNameAssignment_4_2 )
            // InternalTgfi.g:865:3: rule__MainTgf__SatNameAssignment_4_2
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
    // InternalTgfi.g:874:1: rule__MainTgf__Group_5__0 : rule__MainTgf__Group_5__0__Impl rule__MainTgf__Group_5__1 ;
    public final void rule__MainTgf__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:878:1: ( rule__MainTgf__Group_5__0__Impl rule__MainTgf__Group_5__1 )
            // InternalTgfi.g:879:2: rule__MainTgf__Group_5__0__Impl rule__MainTgf__Group_5__1
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
    // InternalTgfi.g:886:1: rule__MainTgf__Group_5__0__Impl : ( 'Version' ) ;
    public final void rule__MainTgf__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:890:1: ( ( 'Version' ) )
            // InternalTgfi.g:891:1: ( 'Version' )
            {
            // InternalTgfi.g:891:1: ( 'Version' )
            // InternalTgfi.g:892:2: 'Version'
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
    // InternalTgfi.g:901:1: rule__MainTgf__Group_5__1 : rule__MainTgf__Group_5__1__Impl rule__MainTgf__Group_5__2 ;
    public final void rule__MainTgf__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:905:1: ( rule__MainTgf__Group_5__1__Impl rule__MainTgf__Group_5__2 )
            // InternalTgfi.g:906:2: rule__MainTgf__Group_5__1__Impl rule__MainTgf__Group_5__2
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
    // InternalTgfi.g:913:1: rule__MainTgf__Group_5__1__Impl : ( ':' ) ;
    public final void rule__MainTgf__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:917:1: ( ( ':' ) )
            // InternalTgfi.g:918:1: ( ':' )
            {
            // InternalTgfi.g:918:1: ( ':' )
            // InternalTgfi.g:919:2: ':'
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
    // InternalTgfi.g:928:1: rule__MainTgf__Group_5__2 : rule__MainTgf__Group_5__2__Impl ;
    public final void rule__MainTgf__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:932:1: ( rule__MainTgf__Group_5__2__Impl )
            // InternalTgfi.g:933:2: rule__MainTgf__Group_5__2__Impl
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
    // InternalTgfi.g:939:1: rule__MainTgf__Group_5__2__Impl : ( ( rule__MainTgf__VersionNameAssignment_5_2 ) ) ;
    public final void rule__MainTgf__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:943:1: ( ( ( rule__MainTgf__VersionNameAssignment_5_2 ) ) )
            // InternalTgfi.g:944:1: ( ( rule__MainTgf__VersionNameAssignment_5_2 ) )
            {
            // InternalTgfi.g:944:1: ( ( rule__MainTgf__VersionNameAssignment_5_2 ) )
            // InternalTgfi.g:945:2: ( rule__MainTgf__VersionNameAssignment_5_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainTgfAccess().getVersionNameAssignment_5_2()); 
            }
            // InternalTgfi.g:946:2: ( rule__MainTgf__VersionNameAssignment_5_2 )
            // InternalTgfi.g:946:3: rule__MainTgf__VersionNameAssignment_5_2
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
    // InternalTgfi.g:955:1: rule__MainTgf__Group_6__0 : rule__MainTgf__Group_6__0__Impl rule__MainTgf__Group_6__1 ;
    public final void rule__MainTgf__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:959:1: ( rule__MainTgf__Group_6__0__Impl rule__MainTgf__Group_6__1 )
            // InternalTgfi.g:960:2: rule__MainTgf__Group_6__0__Impl rule__MainTgf__Group_6__1
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
    // InternalTgfi.g:967:1: rule__MainTgf__Group_6__0__Impl : ( 'Status' ) ;
    public final void rule__MainTgf__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:971:1: ( ( 'Status' ) )
            // InternalTgfi.g:972:1: ( 'Status' )
            {
            // InternalTgfi.g:972:1: ( 'Status' )
            // InternalTgfi.g:973:2: 'Status'
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
    // InternalTgfi.g:982:1: rule__MainTgf__Group_6__1 : rule__MainTgf__Group_6__1__Impl rule__MainTgf__Group_6__2 ;
    public final void rule__MainTgf__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:986:1: ( rule__MainTgf__Group_6__1__Impl rule__MainTgf__Group_6__2 )
            // InternalTgfi.g:987:2: rule__MainTgf__Group_6__1__Impl rule__MainTgf__Group_6__2
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
    // InternalTgfi.g:994:1: rule__MainTgf__Group_6__1__Impl : ( ':' ) ;
    public final void rule__MainTgf__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:998:1: ( ( ':' ) )
            // InternalTgfi.g:999:1: ( ':' )
            {
            // InternalTgfi.g:999:1: ( ':' )
            // InternalTgfi.g:1000:2: ':'
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
    // InternalTgfi.g:1009:1: rule__MainTgf__Group_6__2 : rule__MainTgf__Group_6__2__Impl ;
    public final void rule__MainTgf__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1013:1: ( rule__MainTgf__Group_6__2__Impl )
            // InternalTgfi.g:1014:2: rule__MainTgf__Group_6__2__Impl
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
    // InternalTgfi.g:1020:1: rule__MainTgf__Group_6__2__Impl : ( ( rule__MainTgf__StatusNameAssignment_6_2 ) ) ;
    public final void rule__MainTgf__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1024:1: ( ( ( rule__MainTgf__StatusNameAssignment_6_2 ) ) )
            // InternalTgfi.g:1025:1: ( ( rule__MainTgf__StatusNameAssignment_6_2 ) )
            {
            // InternalTgfi.g:1025:1: ( ( rule__MainTgf__StatusNameAssignment_6_2 ) )
            // InternalTgfi.g:1026:2: ( rule__MainTgf__StatusNameAssignment_6_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainTgfAccess().getStatusNameAssignment_6_2()); 
            }
            // InternalTgfi.g:1027:2: ( rule__MainTgf__StatusNameAssignment_6_2 )
            // InternalTgfi.g:1027:3: rule__MainTgf__StatusNameAssignment_6_2
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
    // InternalTgfi.g:1036:1: rule__MainTgf__Group_7__0 : rule__MainTgf__Group_7__0__Impl rule__MainTgf__Group_7__1 ;
    public final void rule__MainTgf__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1040:1: ( rule__MainTgf__Group_7__0__Impl rule__MainTgf__Group_7__1 )
            // InternalTgfi.g:1041:2: rule__MainTgf__Group_7__0__Impl rule__MainTgf__Group_7__1
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
    // InternalTgfi.g:1048:1: rule__MainTgf__Group_7__0__Impl : ( 'Objective' ) ;
    public final void rule__MainTgf__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1052:1: ( ( 'Objective' ) )
            // InternalTgfi.g:1053:1: ( 'Objective' )
            {
            // InternalTgfi.g:1053:1: ( 'Objective' )
            // InternalTgfi.g:1054:2: 'Objective'
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
    // InternalTgfi.g:1063:1: rule__MainTgf__Group_7__1 : rule__MainTgf__Group_7__1__Impl rule__MainTgf__Group_7__2 ;
    public final void rule__MainTgf__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1067:1: ( rule__MainTgf__Group_7__1__Impl rule__MainTgf__Group_7__2 )
            // InternalTgfi.g:1068:2: rule__MainTgf__Group_7__1__Impl rule__MainTgf__Group_7__2
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
    // InternalTgfi.g:1075:1: rule__MainTgf__Group_7__1__Impl : ( ':' ) ;
    public final void rule__MainTgf__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1079:1: ( ( ':' ) )
            // InternalTgfi.g:1080:1: ( ':' )
            {
            // InternalTgfi.g:1080:1: ( ':' )
            // InternalTgfi.g:1081:2: ':'
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
    // InternalTgfi.g:1090:1: rule__MainTgf__Group_7__2 : rule__MainTgf__Group_7__2__Impl ;
    public final void rule__MainTgf__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1094:1: ( rule__MainTgf__Group_7__2__Impl )
            // InternalTgfi.g:1095:2: rule__MainTgf__Group_7__2__Impl
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
    // InternalTgfi.g:1101:1: rule__MainTgf__Group_7__2__Impl : ( ( rule__MainTgf__ObjectiveNameAssignment_7_2 ) ) ;
    public final void rule__MainTgf__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1105:1: ( ( ( rule__MainTgf__ObjectiveNameAssignment_7_2 ) ) )
            // InternalTgfi.g:1106:1: ( ( rule__MainTgf__ObjectiveNameAssignment_7_2 ) )
            {
            // InternalTgfi.g:1106:1: ( ( rule__MainTgf__ObjectiveNameAssignment_7_2 ) )
            // InternalTgfi.g:1107:2: ( rule__MainTgf__ObjectiveNameAssignment_7_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainTgfAccess().getObjectiveNameAssignment_7_2()); 
            }
            // InternalTgfi.g:1108:2: ( rule__MainTgf__ObjectiveNameAssignment_7_2 )
            // InternalTgfi.g:1108:3: rule__MainTgf__ObjectiveNameAssignment_7_2
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
    // InternalTgfi.g:1117:1: rule__MainTgf__Group_8__0 : rule__MainTgf__Group_8__0__Impl rule__MainTgf__Group_8__1 ;
    public final void rule__MainTgf__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1121:1: ( rule__MainTgf__Group_8__0__Impl rule__MainTgf__Group_8__1 )
            // InternalTgfi.g:1122:2: rule__MainTgf__Group_8__0__Impl rule__MainTgf__Group_8__1
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
    // InternalTgfi.g:1129:1: rule__MainTgf__Group_8__0__Impl : ( 'HL_Function' ) ;
    public final void rule__MainTgf__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1133:1: ( ( 'HL_Function' ) )
            // InternalTgfi.g:1134:1: ( 'HL_Function' )
            {
            // InternalTgfi.g:1134:1: ( 'HL_Function' )
            // InternalTgfi.g:1135:2: 'HL_Function'
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
    // InternalTgfi.g:1144:1: rule__MainTgf__Group_8__1 : rule__MainTgf__Group_8__1__Impl rule__MainTgf__Group_8__2 ;
    public final void rule__MainTgf__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1148:1: ( rule__MainTgf__Group_8__1__Impl rule__MainTgf__Group_8__2 )
            // InternalTgfi.g:1149:2: rule__MainTgf__Group_8__1__Impl rule__MainTgf__Group_8__2
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
    // InternalTgfi.g:1156:1: rule__MainTgf__Group_8__1__Impl : ( ':' ) ;
    public final void rule__MainTgf__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1160:1: ( ( ':' ) )
            // InternalTgfi.g:1161:1: ( ':' )
            {
            // InternalTgfi.g:1161:1: ( ':' )
            // InternalTgfi.g:1162:2: ':'
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
    // InternalTgfi.g:1171:1: rule__MainTgf__Group_8__2 : rule__MainTgf__Group_8__2__Impl ;
    public final void rule__MainTgf__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1175:1: ( rule__MainTgf__Group_8__2__Impl )
            // InternalTgfi.g:1176:2: rule__MainTgf__Group_8__2__Impl
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
    // InternalTgfi.g:1182:1: rule__MainTgf__Group_8__2__Impl : ( ( rule__MainTgf__HlfunctionNameAssignment_8_2 ) ) ;
    public final void rule__MainTgf__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1186:1: ( ( ( rule__MainTgf__HlfunctionNameAssignment_8_2 ) ) )
            // InternalTgfi.g:1187:1: ( ( rule__MainTgf__HlfunctionNameAssignment_8_2 ) )
            {
            // InternalTgfi.g:1187:1: ( ( rule__MainTgf__HlfunctionNameAssignment_8_2 ) )
            // InternalTgfi.g:1188:2: ( rule__MainTgf__HlfunctionNameAssignment_8_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainTgfAccess().getHlfunctionNameAssignment_8_2()); 
            }
            // InternalTgfi.g:1189:2: ( rule__MainTgf__HlfunctionNameAssignment_8_2 )
            // InternalTgfi.g:1189:3: rule__MainTgf__HlfunctionNameAssignment_8_2
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
    // InternalTgfi.g:1198:1: rule__MainTgf__Group_9__0 : rule__MainTgf__Group_9__0__Impl rule__MainTgf__Group_9__1 ;
    public final void rule__MainTgf__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1202:1: ( rule__MainTgf__Group_9__0__Impl rule__MainTgf__Group_9__1 )
            // InternalTgfi.g:1203:2: rule__MainTgf__Group_9__0__Impl rule__MainTgf__Group_9__1
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
    // InternalTgfi.g:1210:1: rule__MainTgf__Group_9__0__Impl : ( 'Rules:' ) ;
    public final void rule__MainTgf__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1214:1: ( ( 'Rules:' ) )
            // InternalTgfi.g:1215:1: ( 'Rules:' )
            {
            // InternalTgfi.g:1215:1: ( 'Rules:' )
            // InternalTgfi.g:1216:2: 'Rules:'
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
    // InternalTgfi.g:1225:1: rule__MainTgf__Group_9__1 : rule__MainTgf__Group_9__1__Impl rule__MainTgf__Group_9__2 ;
    public final void rule__MainTgf__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1229:1: ( rule__MainTgf__Group_9__1__Impl rule__MainTgf__Group_9__2 )
            // InternalTgfi.g:1230:2: rule__MainTgf__Group_9__1__Impl rule__MainTgf__Group_9__2
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
    // InternalTgfi.g:1237:1: rule__MainTgf__Group_9__1__Impl : ( '{' ) ;
    public final void rule__MainTgf__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1241:1: ( ( '{' ) )
            // InternalTgfi.g:1242:1: ( '{' )
            {
            // InternalTgfi.g:1242:1: ( '{' )
            // InternalTgfi.g:1243:2: '{'
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
    // InternalTgfi.g:1252:1: rule__MainTgf__Group_9__2 : rule__MainTgf__Group_9__2__Impl rule__MainTgf__Group_9__3 ;
    public final void rule__MainTgf__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1256:1: ( rule__MainTgf__Group_9__2__Impl rule__MainTgf__Group_9__3 )
            // InternalTgfi.g:1257:2: rule__MainTgf__Group_9__2__Impl rule__MainTgf__Group_9__3
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
    // InternalTgfi.g:1264:1: rule__MainTgf__Group_9__2__Impl : ( ( rule__MainTgf__RulesAssignment_9_2 )* ) ;
    public final void rule__MainTgf__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1268:1: ( ( ( rule__MainTgf__RulesAssignment_9_2 )* ) )
            // InternalTgfi.g:1269:1: ( ( rule__MainTgf__RulesAssignment_9_2 )* )
            {
            // InternalTgfi.g:1269:1: ( ( rule__MainTgf__RulesAssignment_9_2 )* )
            // InternalTgfi.g:1270:2: ( rule__MainTgf__RulesAssignment_9_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainTgfAccess().getRulesAssignment_9_2()); 
            }
            // InternalTgfi.g:1271:2: ( rule__MainTgf__RulesAssignment_9_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalTgfi.g:1271:3: rule__MainTgf__RulesAssignment_9_2
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
    // InternalTgfi.g:1279:1: rule__MainTgf__Group_9__3 : rule__MainTgf__Group_9__3__Impl ;
    public final void rule__MainTgf__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1283:1: ( rule__MainTgf__Group_9__3__Impl )
            // InternalTgfi.g:1284:2: rule__MainTgf__Group_9__3__Impl
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
    // InternalTgfi.g:1290:1: rule__MainTgf__Group_9__3__Impl : ( '}' ) ;
    public final void rule__MainTgf__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1294:1: ( ( '}' ) )
            // InternalTgfi.g:1295:1: ( '}' )
            {
            // InternalTgfi.g:1295:1: ( '}' )
            // InternalTgfi.g:1296:2: '}'
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
    // InternalTgfi.g:1306:1: rule__Profile__Group__0 : rule__Profile__Group__0__Impl rule__Profile__Group__1 ;
    public final void rule__Profile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1310:1: ( rule__Profile__Group__0__Impl rule__Profile__Group__1 )
            // InternalTgfi.g:1311:2: rule__Profile__Group__0__Impl rule__Profile__Group__1
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
    // InternalTgfi.g:1318:1: rule__Profile__Group__0__Impl : ( 'Profile' ) ;
    public final void rule__Profile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1322:1: ( ( 'Profile' ) )
            // InternalTgfi.g:1323:1: ( 'Profile' )
            {
            // InternalTgfi.g:1323:1: ( 'Profile' )
            // InternalTgfi.g:1324:2: 'Profile'
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
    // InternalTgfi.g:1333:1: rule__Profile__Group__1 : rule__Profile__Group__1__Impl rule__Profile__Group__2 ;
    public final void rule__Profile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1337:1: ( rule__Profile__Group__1__Impl rule__Profile__Group__2 )
            // InternalTgfi.g:1338:2: rule__Profile__Group__1__Impl rule__Profile__Group__2
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
    // InternalTgfi.g:1345:1: rule__Profile__Group__1__Impl : ( ( rule__Profile__NameAssignment_1 ) ) ;
    public final void rule__Profile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1349:1: ( ( ( rule__Profile__NameAssignment_1 ) ) )
            // InternalTgfi.g:1350:1: ( ( rule__Profile__NameAssignment_1 ) )
            {
            // InternalTgfi.g:1350:1: ( ( rule__Profile__NameAssignment_1 ) )
            // InternalTgfi.g:1351:2: ( rule__Profile__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProfileAccess().getNameAssignment_1()); 
            }
            // InternalTgfi.g:1352:2: ( rule__Profile__NameAssignment_1 )
            // InternalTgfi.g:1352:3: rule__Profile__NameAssignment_1
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
    // InternalTgfi.g:1360:1: rule__Profile__Group__2 : rule__Profile__Group__2__Impl rule__Profile__Group__3 ;
    public final void rule__Profile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1364:1: ( rule__Profile__Group__2__Impl rule__Profile__Group__3 )
            // InternalTgfi.g:1365:2: rule__Profile__Group__2__Impl rule__Profile__Group__3
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
    // InternalTgfi.g:1372:1: rule__Profile__Group__2__Impl : ( '{' ) ;
    public final void rule__Profile__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1376:1: ( ( '{' ) )
            // InternalTgfi.g:1377:1: ( '{' )
            {
            // InternalTgfi.g:1377:1: ( '{' )
            // InternalTgfi.g:1378:2: '{'
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
    // InternalTgfi.g:1387:1: rule__Profile__Group__3 : rule__Profile__Group__3__Impl rule__Profile__Group__4 ;
    public final void rule__Profile__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1391:1: ( rule__Profile__Group__3__Impl rule__Profile__Group__4 )
            // InternalTgfi.g:1392:2: rule__Profile__Group__3__Impl rule__Profile__Group__4
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
    // InternalTgfi.g:1399:1: rule__Profile__Group__3__Impl : ( ( rule__Profile__Group_3__0 )? ) ;
    public final void rule__Profile__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1403:1: ( ( ( rule__Profile__Group_3__0 )? ) )
            // InternalTgfi.g:1404:1: ( ( rule__Profile__Group_3__0 )? )
            {
            // InternalTgfi.g:1404:1: ( ( rule__Profile__Group_3__0 )? )
            // InternalTgfi.g:1405:2: ( rule__Profile__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProfileAccess().getGroup_3()); 
            }
            // InternalTgfi.g:1406:2: ( rule__Profile__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==17) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalTgfi.g:1406:3: rule__Profile__Group_3__0
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
    // InternalTgfi.g:1414:1: rule__Profile__Group__4 : rule__Profile__Group__4__Impl rule__Profile__Group__5 ;
    public final void rule__Profile__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1418:1: ( rule__Profile__Group__4__Impl rule__Profile__Group__5 )
            // InternalTgfi.g:1419:2: rule__Profile__Group__4__Impl rule__Profile__Group__5
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
    // InternalTgfi.g:1426:1: rule__Profile__Group__4__Impl : ( ( rule__Profile__Group_4__0 )? ) ;
    public final void rule__Profile__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1430:1: ( ( ( rule__Profile__Group_4__0 )? ) )
            // InternalTgfi.g:1431:1: ( ( rule__Profile__Group_4__0 )? )
            {
            // InternalTgfi.g:1431:1: ( ( rule__Profile__Group_4__0 )? )
            // InternalTgfi.g:1432:2: ( rule__Profile__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProfileAccess().getGroup_4()); 
            }
            // InternalTgfi.g:1433:2: ( rule__Profile__Group_4__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==28) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalTgfi.g:1433:3: rule__Profile__Group_4__0
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
    // InternalTgfi.g:1441:1: rule__Profile__Group__5 : rule__Profile__Group__5__Impl rule__Profile__Group__6 ;
    public final void rule__Profile__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1445:1: ( rule__Profile__Group__5__Impl rule__Profile__Group__6 )
            // InternalTgfi.g:1446:2: rule__Profile__Group__5__Impl rule__Profile__Group__6
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
    // InternalTgfi.g:1453:1: rule__Profile__Group__5__Impl : ( ( rule__Profile__Group_5__0 )? ) ;
    public final void rule__Profile__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1457:1: ( ( ( rule__Profile__Group_5__0 )? ) )
            // InternalTgfi.g:1458:1: ( ( rule__Profile__Group_5__0 )? )
            {
            // InternalTgfi.g:1458:1: ( ( rule__Profile__Group_5__0 )? )
            // InternalTgfi.g:1459:2: ( rule__Profile__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProfileAccess().getGroup_5()); 
            }
            // InternalTgfi.g:1460:2: ( rule__Profile__Group_5__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==29) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalTgfi.g:1460:3: rule__Profile__Group_5__0
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
    // InternalTgfi.g:1468:1: rule__Profile__Group__6 : rule__Profile__Group__6__Impl rule__Profile__Group__7 ;
    public final void rule__Profile__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1472:1: ( rule__Profile__Group__6__Impl rule__Profile__Group__7 )
            // InternalTgfi.g:1473:2: rule__Profile__Group__6__Impl rule__Profile__Group__7
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
    // InternalTgfi.g:1480:1: rule__Profile__Group__6__Impl : ( ( rule__Profile__Group_6__0 )? ) ;
    public final void rule__Profile__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1484:1: ( ( ( rule__Profile__Group_6__0 )? ) )
            // InternalTgfi.g:1485:1: ( ( rule__Profile__Group_6__0 )? )
            {
            // InternalTgfi.g:1485:1: ( ( rule__Profile__Group_6__0 )? )
            // InternalTgfi.g:1486:2: ( rule__Profile__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProfileAccess().getGroup_6()); 
            }
            // InternalTgfi.g:1487:2: ( rule__Profile__Group_6__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==30) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalTgfi.g:1487:3: rule__Profile__Group_6__0
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
    // InternalTgfi.g:1495:1: rule__Profile__Group__7 : rule__Profile__Group__7__Impl rule__Profile__Group__8 ;
    public final void rule__Profile__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1499:1: ( rule__Profile__Group__7__Impl rule__Profile__Group__8 )
            // InternalTgfi.g:1500:2: rule__Profile__Group__7__Impl rule__Profile__Group__8
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
    // InternalTgfi.g:1507:1: rule__Profile__Group__7__Impl : ( 'actors:' ) ;
    public final void rule__Profile__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1511:1: ( ( 'actors:' ) )
            // InternalTgfi.g:1512:1: ( 'actors:' )
            {
            // InternalTgfi.g:1512:1: ( 'actors:' )
            // InternalTgfi.g:1513:2: 'actors:'
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
    // InternalTgfi.g:1522:1: rule__Profile__Group__8 : rule__Profile__Group__8__Impl rule__Profile__Group__9 ;
    public final void rule__Profile__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1526:1: ( rule__Profile__Group__8__Impl rule__Profile__Group__9 )
            // InternalTgfi.g:1527:2: rule__Profile__Group__8__Impl rule__Profile__Group__9
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
    // InternalTgfi.g:1534:1: rule__Profile__Group__8__Impl : ( ( ( rule__Profile__ActorAssignment_8 ) ) ( ( rule__Profile__ActorAssignment_8 )* ) ) ;
    public final void rule__Profile__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1538:1: ( ( ( ( rule__Profile__ActorAssignment_8 ) ) ( ( rule__Profile__ActorAssignment_8 )* ) ) )
            // InternalTgfi.g:1539:1: ( ( ( rule__Profile__ActorAssignment_8 ) ) ( ( rule__Profile__ActorAssignment_8 )* ) )
            {
            // InternalTgfi.g:1539:1: ( ( ( rule__Profile__ActorAssignment_8 ) ) ( ( rule__Profile__ActorAssignment_8 )* ) )
            // InternalTgfi.g:1540:2: ( ( rule__Profile__ActorAssignment_8 ) ) ( ( rule__Profile__ActorAssignment_8 )* )
            {
            // InternalTgfi.g:1540:2: ( ( rule__Profile__ActorAssignment_8 ) )
            // InternalTgfi.g:1541:3: ( rule__Profile__ActorAssignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProfileAccess().getActorAssignment_8()); 
            }
            // InternalTgfi.g:1542:3: ( rule__Profile__ActorAssignment_8 )
            // InternalTgfi.g:1542:4: rule__Profile__ActorAssignment_8
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

            // InternalTgfi.g:1545:2: ( ( rule__Profile__ActorAssignment_8 )* )
            // InternalTgfi.g:1546:3: ( rule__Profile__ActorAssignment_8 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProfileAccess().getActorAssignment_8()); 
            }
            // InternalTgfi.g:1547:3: ( rule__Profile__ActorAssignment_8 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_STRING) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalTgfi.g:1547:4: rule__Profile__ActorAssignment_8
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
    // InternalTgfi.g:1556:1: rule__Profile__Group__9 : rule__Profile__Group__9__Impl rule__Profile__Group__10 ;
    public final void rule__Profile__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1560:1: ( rule__Profile__Group__9__Impl rule__Profile__Group__10 )
            // InternalTgfi.g:1561:2: rule__Profile__Group__9__Impl rule__Profile__Group__10
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
    // InternalTgfi.g:1568:1: rule__Profile__Group__9__Impl : ( 'transactions:' ) ;
    public final void rule__Profile__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1572:1: ( ( 'transactions:' ) )
            // InternalTgfi.g:1573:1: ( 'transactions:' )
            {
            // InternalTgfi.g:1573:1: ( 'transactions:' )
            // InternalTgfi.g:1574:2: 'transactions:'
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
    // InternalTgfi.g:1583:1: rule__Profile__Group__10 : rule__Profile__Group__10__Impl rule__Profile__Group__11 ;
    public final void rule__Profile__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1587:1: ( rule__Profile__Group__10__Impl rule__Profile__Group__11 )
            // InternalTgfi.g:1588:2: rule__Profile__Group__10__Impl rule__Profile__Group__11
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
    // InternalTgfi.g:1595:1: rule__Profile__Group__10__Impl : ( ( rule__Profile__TransactionAssignment_10 )* ) ;
    public final void rule__Profile__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1599:1: ( ( ( rule__Profile__TransactionAssignment_10 )* ) )
            // InternalTgfi.g:1600:1: ( ( rule__Profile__TransactionAssignment_10 )* )
            {
            // InternalTgfi.g:1600:1: ( ( rule__Profile__TransactionAssignment_10 )* )
            // InternalTgfi.g:1601:2: ( rule__Profile__TransactionAssignment_10 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProfileAccess().getTransactionAssignment_10()); 
            }
            // InternalTgfi.g:1602:2: ( rule__Profile__TransactionAssignment_10 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==31) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalTgfi.g:1602:3: rule__Profile__TransactionAssignment_10
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
    // InternalTgfi.g:1610:1: rule__Profile__Group__11 : rule__Profile__Group__11__Impl rule__Profile__Group__12 ;
    public final void rule__Profile__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1614:1: ( rule__Profile__Group__11__Impl rule__Profile__Group__12 )
            // InternalTgfi.g:1615:2: rule__Profile__Group__11__Impl rule__Profile__Group__12
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
    // InternalTgfi.g:1622:1: rule__Profile__Group__11__Impl : ( 'domains:' ) ;
    public final void rule__Profile__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1626:1: ( ( 'domains:' ) )
            // InternalTgfi.g:1627:1: ( 'domains:' )
            {
            // InternalTgfi.g:1627:1: ( 'domains:' )
            // InternalTgfi.g:1628:2: 'domains:'
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
    // InternalTgfi.g:1637:1: rule__Profile__Group__12 : rule__Profile__Group__12__Impl rule__Profile__Group__13 ;
    public final void rule__Profile__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1641:1: ( rule__Profile__Group__12__Impl rule__Profile__Group__13 )
            // InternalTgfi.g:1642:2: rule__Profile__Group__12__Impl rule__Profile__Group__13
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
    // InternalTgfi.g:1649:1: rule__Profile__Group__12__Impl : ( ( rule__Profile__DomainAssignment_12 )* ) ;
    public final void rule__Profile__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1653:1: ( ( ( rule__Profile__DomainAssignment_12 )* ) )
            // InternalTgfi.g:1654:1: ( ( rule__Profile__DomainAssignment_12 )* )
            {
            // InternalTgfi.g:1654:1: ( ( rule__Profile__DomainAssignment_12 )* )
            // InternalTgfi.g:1655:2: ( rule__Profile__DomainAssignment_12 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProfileAccess().getDomainAssignment_12()); 
            }
            // InternalTgfi.g:1656:2: ( rule__Profile__DomainAssignment_12 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_STRING) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalTgfi.g:1656:3: rule__Profile__DomainAssignment_12
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
    // InternalTgfi.g:1664:1: rule__Profile__Group__13 : rule__Profile__Group__13__Impl rule__Profile__Group__14 ;
    public final void rule__Profile__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1668:1: ( rule__Profile__Group__13__Impl rule__Profile__Group__14 )
            // InternalTgfi.g:1669:2: rule__Profile__Group__13__Impl rule__Profile__Group__14
            {
            pushFollow(FOLLOW_11);
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
    // InternalTgfi.g:1676:1: rule__Profile__Group__13__Impl : ( 'quality_attributes:' ) ;
    public final void rule__Profile__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1680:1: ( ( 'quality_attributes:' ) )
            // InternalTgfi.g:1681:1: ( 'quality_attributes:' )
            {
            // InternalTgfi.g:1681:1: ( 'quality_attributes:' )
            // InternalTgfi.g:1682:2: 'quality_attributes:'
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
    // InternalTgfi.g:1691:1: rule__Profile__Group__14 : rule__Profile__Group__14__Impl rule__Profile__Group__15 ;
    public final void rule__Profile__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1695:1: ( rule__Profile__Group__14__Impl rule__Profile__Group__15 )
            // InternalTgfi.g:1696:2: rule__Profile__Group__14__Impl rule__Profile__Group__15
            {
            pushFollow(FOLLOW_11);
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
    // InternalTgfi.g:1703:1: rule__Profile__Group__14__Impl : ( ( rule__Profile__QualityattrAssignment_14 )* ) ;
    public final void rule__Profile__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1707:1: ( ( ( rule__Profile__QualityattrAssignment_14 )* ) )
            // InternalTgfi.g:1708:1: ( ( rule__Profile__QualityattrAssignment_14 )* )
            {
            // InternalTgfi.g:1708:1: ( ( rule__Profile__QualityattrAssignment_14 )* )
            // InternalTgfi.g:1709:2: ( rule__Profile__QualityattrAssignment_14 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProfileAccess().getQualityattrAssignment_14()); 
            }
            // InternalTgfi.g:1710:2: ( rule__Profile__QualityattrAssignment_14 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalTgfi.g:1710:3: rule__Profile__QualityattrAssignment_14
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
    // InternalTgfi.g:1718:1: rule__Profile__Group__15 : rule__Profile__Group__15__Impl ;
    public final void rule__Profile__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1722:1: ( rule__Profile__Group__15__Impl )
            // InternalTgfi.g:1723:2: rule__Profile__Group__15__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Profile__Group__15__Impl();

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
    // InternalTgfi.g:1729:1: rule__Profile__Group__15__Impl : ( '}' ) ;
    public final void rule__Profile__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1733:1: ( ( '}' ) )
            // InternalTgfi.g:1734:1: ( '}' )
            {
            // InternalTgfi.g:1734:1: ( '}' )
            // InternalTgfi.g:1735:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProfileAccess().getRightCurlyBracketKeyword_15()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProfileAccess().getRightCurlyBracketKeyword_15()); 
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


    // $ANTLR start "rule__Profile__Group_3__0"
    // InternalTgfi.g:1745:1: rule__Profile__Group_3__0 : rule__Profile__Group_3__0__Impl rule__Profile__Group_3__1 ;
    public final void rule__Profile__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1749:1: ( rule__Profile__Group_3__0__Impl rule__Profile__Group_3__1 )
            // InternalTgfi.g:1750:2: rule__Profile__Group_3__0__Impl rule__Profile__Group_3__1
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
    // InternalTgfi.g:1757:1: rule__Profile__Group_3__0__Impl : ( 'Name' ) ;
    public final void rule__Profile__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1761:1: ( ( 'Name' ) )
            // InternalTgfi.g:1762:1: ( 'Name' )
            {
            // InternalTgfi.g:1762:1: ( 'Name' )
            // InternalTgfi.g:1763:2: 'Name'
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
    // InternalTgfi.g:1772:1: rule__Profile__Group_3__1 : rule__Profile__Group_3__1__Impl rule__Profile__Group_3__2 ;
    public final void rule__Profile__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1776:1: ( rule__Profile__Group_3__1__Impl rule__Profile__Group_3__2 )
            // InternalTgfi.g:1777:2: rule__Profile__Group_3__1__Impl rule__Profile__Group_3__2
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
    // InternalTgfi.g:1784:1: rule__Profile__Group_3__1__Impl : ( ':' ) ;
    public final void rule__Profile__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1788:1: ( ( ':' ) )
            // InternalTgfi.g:1789:1: ( ':' )
            {
            // InternalTgfi.g:1789:1: ( ':' )
            // InternalTgfi.g:1790:2: ':'
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
    // InternalTgfi.g:1799:1: rule__Profile__Group_3__2 : rule__Profile__Group_3__2__Impl ;
    public final void rule__Profile__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1803:1: ( rule__Profile__Group_3__2__Impl )
            // InternalTgfi.g:1804:2: rule__Profile__Group_3__2__Impl
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
    // InternalTgfi.g:1810:1: rule__Profile__Group_3__2__Impl : ( ( rule__Profile__ProfNameAssignment_3_2 ) ) ;
    public final void rule__Profile__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1814:1: ( ( ( rule__Profile__ProfNameAssignment_3_2 ) ) )
            // InternalTgfi.g:1815:1: ( ( rule__Profile__ProfNameAssignment_3_2 ) )
            {
            // InternalTgfi.g:1815:1: ( ( rule__Profile__ProfNameAssignment_3_2 ) )
            // InternalTgfi.g:1816:2: ( rule__Profile__ProfNameAssignment_3_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProfileAccess().getProfNameAssignment_3_2()); 
            }
            // InternalTgfi.g:1817:2: ( rule__Profile__ProfNameAssignment_3_2 )
            // InternalTgfi.g:1817:3: rule__Profile__ProfNameAssignment_3_2
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
    // InternalTgfi.g:1826:1: rule__Profile__Group_4__0 : rule__Profile__Group_4__0__Impl rule__Profile__Group_4__1 ;
    public final void rule__Profile__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1830:1: ( rule__Profile__Group_4__0__Impl rule__Profile__Group_4__1 )
            // InternalTgfi.g:1831:2: rule__Profile__Group_4__0__Impl rule__Profile__Group_4__1
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
    // InternalTgfi.g:1838:1: rule__Profile__Group_4__0__Impl : ( 'Description' ) ;
    public final void rule__Profile__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1842:1: ( ( 'Description' ) )
            // InternalTgfi.g:1843:1: ( 'Description' )
            {
            // InternalTgfi.g:1843:1: ( 'Description' )
            // InternalTgfi.g:1844:2: 'Description'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProfileAccess().getDescriptionKeyword_4_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
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
    // InternalTgfi.g:1853:1: rule__Profile__Group_4__1 : rule__Profile__Group_4__1__Impl rule__Profile__Group_4__2 ;
    public final void rule__Profile__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1857:1: ( rule__Profile__Group_4__1__Impl rule__Profile__Group_4__2 )
            // InternalTgfi.g:1858:2: rule__Profile__Group_4__1__Impl rule__Profile__Group_4__2
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
    // InternalTgfi.g:1865:1: rule__Profile__Group_4__1__Impl : ( ':' ) ;
    public final void rule__Profile__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1869:1: ( ( ':' ) )
            // InternalTgfi.g:1870:1: ( ':' )
            {
            // InternalTgfi.g:1870:1: ( ':' )
            // InternalTgfi.g:1871:2: ':'
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
    // InternalTgfi.g:1880:1: rule__Profile__Group_4__2 : rule__Profile__Group_4__2__Impl ;
    public final void rule__Profile__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1884:1: ( rule__Profile__Group_4__2__Impl )
            // InternalTgfi.g:1885:2: rule__Profile__Group_4__2__Impl
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
    // InternalTgfi.g:1891:1: rule__Profile__Group_4__2__Impl : ( ( rule__Profile__DescrNameAssignment_4_2 ) ) ;
    public final void rule__Profile__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1895:1: ( ( ( rule__Profile__DescrNameAssignment_4_2 ) ) )
            // InternalTgfi.g:1896:1: ( ( rule__Profile__DescrNameAssignment_4_2 ) )
            {
            // InternalTgfi.g:1896:1: ( ( rule__Profile__DescrNameAssignment_4_2 ) )
            // InternalTgfi.g:1897:2: ( rule__Profile__DescrNameAssignment_4_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProfileAccess().getDescrNameAssignment_4_2()); 
            }
            // InternalTgfi.g:1898:2: ( rule__Profile__DescrNameAssignment_4_2 )
            // InternalTgfi.g:1898:3: rule__Profile__DescrNameAssignment_4_2
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
    // InternalTgfi.g:1907:1: rule__Profile__Group_5__0 : rule__Profile__Group_5__0__Impl rule__Profile__Group_5__1 ;
    public final void rule__Profile__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1911:1: ( rule__Profile__Group_5__0__Impl rule__Profile__Group_5__1 )
            // InternalTgfi.g:1912:2: rule__Profile__Group_5__0__Impl rule__Profile__Group_5__1
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
    // InternalTgfi.g:1919:1: rule__Profile__Group_5__0__Impl : ( 'Features' ) ;
    public final void rule__Profile__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1923:1: ( ( 'Features' ) )
            // InternalTgfi.g:1924:1: ( 'Features' )
            {
            // InternalTgfi.g:1924:1: ( 'Features' )
            // InternalTgfi.g:1925:2: 'Features'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProfileAccess().getFeaturesKeyword_5_0()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
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
    // InternalTgfi.g:1934:1: rule__Profile__Group_5__1 : rule__Profile__Group_5__1__Impl rule__Profile__Group_5__2 ;
    public final void rule__Profile__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1938:1: ( rule__Profile__Group_5__1__Impl rule__Profile__Group_5__2 )
            // InternalTgfi.g:1939:2: rule__Profile__Group_5__1__Impl rule__Profile__Group_5__2
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
    // InternalTgfi.g:1946:1: rule__Profile__Group_5__1__Impl : ( ':' ) ;
    public final void rule__Profile__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1950:1: ( ( ':' ) )
            // InternalTgfi.g:1951:1: ( ':' )
            {
            // InternalTgfi.g:1951:1: ( ':' )
            // InternalTgfi.g:1952:2: ':'
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
    // InternalTgfi.g:1961:1: rule__Profile__Group_5__2 : rule__Profile__Group_5__2__Impl ;
    public final void rule__Profile__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1965:1: ( rule__Profile__Group_5__2__Impl )
            // InternalTgfi.g:1966:2: rule__Profile__Group_5__2__Impl
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
    // InternalTgfi.g:1972:1: rule__Profile__Group_5__2__Impl : ( ( rule__Profile__FeatNameAssignment_5_2 ) ) ;
    public final void rule__Profile__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1976:1: ( ( ( rule__Profile__FeatNameAssignment_5_2 ) ) )
            // InternalTgfi.g:1977:1: ( ( rule__Profile__FeatNameAssignment_5_2 ) )
            {
            // InternalTgfi.g:1977:1: ( ( rule__Profile__FeatNameAssignment_5_2 ) )
            // InternalTgfi.g:1978:2: ( rule__Profile__FeatNameAssignment_5_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProfileAccess().getFeatNameAssignment_5_2()); 
            }
            // InternalTgfi.g:1979:2: ( rule__Profile__FeatNameAssignment_5_2 )
            // InternalTgfi.g:1979:3: rule__Profile__FeatNameAssignment_5_2
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
    // InternalTgfi.g:1988:1: rule__Profile__Group_6__0 : rule__Profile__Group_6__0__Impl rule__Profile__Group_6__1 ;
    public final void rule__Profile__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:1992:1: ( rule__Profile__Group_6__0__Impl rule__Profile__Group_6__1 )
            // InternalTgfi.g:1993:2: rule__Profile__Group_6__0__Impl rule__Profile__Group_6__1
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
    // InternalTgfi.g:2000:1: rule__Profile__Group_6__0__Impl : ( 'Function' ) ;
    public final void rule__Profile__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2004:1: ( ( 'Function' ) )
            // InternalTgfi.g:2005:1: ( 'Function' )
            {
            // InternalTgfi.g:2005:1: ( 'Function' )
            // InternalTgfi.g:2006:2: 'Function'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProfileAccess().getFunctionKeyword_6_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
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
    // InternalTgfi.g:2015:1: rule__Profile__Group_6__1 : rule__Profile__Group_6__1__Impl rule__Profile__Group_6__2 ;
    public final void rule__Profile__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2019:1: ( rule__Profile__Group_6__1__Impl rule__Profile__Group_6__2 )
            // InternalTgfi.g:2020:2: rule__Profile__Group_6__1__Impl rule__Profile__Group_6__2
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
    // InternalTgfi.g:2027:1: rule__Profile__Group_6__1__Impl : ( ':' ) ;
    public final void rule__Profile__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2031:1: ( ( ':' ) )
            // InternalTgfi.g:2032:1: ( ':' )
            {
            // InternalTgfi.g:2032:1: ( ':' )
            // InternalTgfi.g:2033:2: ':'
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
    // InternalTgfi.g:2042:1: rule__Profile__Group_6__2 : rule__Profile__Group_6__2__Impl ;
    public final void rule__Profile__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2046:1: ( rule__Profile__Group_6__2__Impl )
            // InternalTgfi.g:2047:2: rule__Profile__Group_6__2__Impl
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
    // InternalTgfi.g:2053:1: rule__Profile__Group_6__2__Impl : ( ( rule__Profile__FunctionNameAssignment_6_2 ) ) ;
    public final void rule__Profile__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2057:1: ( ( ( rule__Profile__FunctionNameAssignment_6_2 ) ) )
            // InternalTgfi.g:2058:1: ( ( rule__Profile__FunctionNameAssignment_6_2 ) )
            {
            // InternalTgfi.g:2058:1: ( ( rule__Profile__FunctionNameAssignment_6_2 ) )
            // InternalTgfi.g:2059:2: ( rule__Profile__FunctionNameAssignment_6_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProfileAccess().getFunctionNameAssignment_6_2()); 
            }
            // InternalTgfi.g:2060:2: ( rule__Profile__FunctionNameAssignment_6_2 )
            // InternalTgfi.g:2060:3: rule__Profile__FunctionNameAssignment_6_2
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


    // $ANTLR start "rule__Transaction__Group__0"
    // InternalTgfi.g:2069:1: rule__Transaction__Group__0 : rule__Transaction__Group__0__Impl rule__Transaction__Group__1 ;
    public final void rule__Transaction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2073:1: ( rule__Transaction__Group__0__Impl rule__Transaction__Group__1 )
            // InternalTgfi.g:2074:2: rule__Transaction__Group__0__Impl rule__Transaction__Group__1
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
    // InternalTgfi.g:2081:1: rule__Transaction__Group__0__Impl : ( '(' ) ;
    public final void rule__Transaction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2085:1: ( ( '(' ) )
            // InternalTgfi.g:2086:1: ( '(' )
            {
            // InternalTgfi.g:2086:1: ( '(' )
            // InternalTgfi.g:2087:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransactionAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
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
    // InternalTgfi.g:2096:1: rule__Transaction__Group__1 : rule__Transaction__Group__1__Impl rule__Transaction__Group__2 ;
    public final void rule__Transaction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2100:1: ( rule__Transaction__Group__1__Impl rule__Transaction__Group__2 )
            // InternalTgfi.g:2101:2: rule__Transaction__Group__1__Impl rule__Transaction__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalTgfi.g:2108:1: rule__Transaction__Group__1__Impl : ( ruleActor ) ;
    public final void rule__Transaction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2112:1: ( ( ruleActor ) )
            // InternalTgfi.g:2113:1: ( ruleActor )
            {
            // InternalTgfi.g:2113:1: ( ruleActor )
            // InternalTgfi.g:2114:2: ruleActor
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
    // InternalTgfi.g:2123:1: rule__Transaction__Group__2 : rule__Transaction__Group__2__Impl rule__Transaction__Group__3 ;
    public final void rule__Transaction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2127:1: ( rule__Transaction__Group__2__Impl rule__Transaction__Group__3 )
            // InternalTgfi.g:2128:2: rule__Transaction__Group__2__Impl rule__Transaction__Group__3
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
    // InternalTgfi.g:2135:1: rule__Transaction__Group__2__Impl : ( ',' ) ;
    public final void rule__Transaction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2139:1: ( ( ',' ) )
            // InternalTgfi.g:2140:1: ( ',' )
            {
            // InternalTgfi.g:2140:1: ( ',' )
            // InternalTgfi.g:2141:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransactionAccess().getCommaKeyword_2()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
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
    // InternalTgfi.g:2150:1: rule__Transaction__Group__3 : rule__Transaction__Group__3__Impl rule__Transaction__Group__4 ;
    public final void rule__Transaction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2154:1: ( rule__Transaction__Group__3__Impl rule__Transaction__Group__4 )
            // InternalTgfi.g:2155:2: rule__Transaction__Group__3__Impl rule__Transaction__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalTgfi.g:2162:1: rule__Transaction__Group__3__Impl : ( RULE_STRING ) ;
    public final void rule__Transaction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2166:1: ( ( RULE_STRING ) )
            // InternalTgfi.g:2167:1: ( RULE_STRING )
            {
            // InternalTgfi.g:2167:1: ( RULE_STRING )
            // InternalTgfi.g:2168:2: RULE_STRING
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
    // InternalTgfi.g:2177:1: rule__Transaction__Group__4 : rule__Transaction__Group__4__Impl rule__Transaction__Group__5 ;
    public final void rule__Transaction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2181:1: ( rule__Transaction__Group__4__Impl rule__Transaction__Group__5 )
            // InternalTgfi.g:2182:2: rule__Transaction__Group__4__Impl rule__Transaction__Group__5
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
    // InternalTgfi.g:2189:1: rule__Transaction__Group__4__Impl : ( ',' ) ;
    public final void rule__Transaction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2193:1: ( ( ',' ) )
            // InternalTgfi.g:2194:1: ( ',' )
            {
            // InternalTgfi.g:2194:1: ( ',' )
            // InternalTgfi.g:2195:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransactionAccess().getCommaKeyword_4()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
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
    // InternalTgfi.g:2204:1: rule__Transaction__Group__5 : rule__Transaction__Group__5__Impl rule__Transaction__Group__6 ;
    public final void rule__Transaction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2208:1: ( rule__Transaction__Group__5__Impl rule__Transaction__Group__6 )
            // InternalTgfi.g:2209:2: rule__Transaction__Group__5__Impl rule__Transaction__Group__6
            {
            pushFollow(FOLLOW_20);
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
    // InternalTgfi.g:2216:1: rule__Transaction__Group__5__Impl : ( ruleActor ) ;
    public final void rule__Transaction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2220:1: ( ( ruleActor ) )
            // InternalTgfi.g:2221:1: ( ruleActor )
            {
            // InternalTgfi.g:2221:1: ( ruleActor )
            // InternalTgfi.g:2222:2: ruleActor
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
    // InternalTgfi.g:2231:1: rule__Transaction__Group__6 : rule__Transaction__Group__6__Impl ;
    public final void rule__Transaction__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2235:1: ( rule__Transaction__Group__6__Impl )
            // InternalTgfi.g:2236:2: rule__Transaction__Group__6__Impl
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
    // InternalTgfi.g:2242:1: rule__Transaction__Group__6__Impl : ( ')' ) ;
    public final void rule__Transaction__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2246:1: ( ( ')' ) )
            // InternalTgfi.g:2247:1: ( ')' )
            {
            // InternalTgfi.g:2247:1: ( ')' )
            // InternalTgfi.g:2248:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransactionAccess().getRightParenthesisKeyword_6()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
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
    // InternalTgfi.g:2258:1: rule__QualityAttr__Group__0 : rule__QualityAttr__Group__0__Impl rule__QualityAttr__Group__1 ;
    public final void rule__QualityAttr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2262:1: ( rule__QualityAttr__Group__0__Impl rule__QualityAttr__Group__1 )
            // InternalTgfi.g:2263:2: rule__QualityAttr__Group__0__Impl rule__QualityAttr__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalTgfi.g:2270:1: rule__QualityAttr__Group__0__Impl : ( ruleQualityAttrID ) ;
    public final void rule__QualityAttr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2274:1: ( ( ruleQualityAttrID ) )
            // InternalTgfi.g:2275:1: ( ruleQualityAttrID )
            {
            // InternalTgfi.g:2275:1: ( ruleQualityAttrID )
            // InternalTgfi.g:2276:2: ruleQualityAttrID
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
    // InternalTgfi.g:2285:1: rule__QualityAttr__Group__1 : rule__QualityAttr__Group__1__Impl rule__QualityAttr__Group__2 ;
    public final void rule__QualityAttr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2289:1: ( rule__QualityAttr__Group__1__Impl rule__QualityAttr__Group__2 )
            // InternalTgfi.g:2290:2: rule__QualityAttr__Group__1__Impl rule__QualityAttr__Group__2
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
    // InternalTgfi.g:2297:1: rule__QualityAttr__Group__1__Impl : ( '[' ) ;
    public final void rule__QualityAttr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2301:1: ( ( '[' ) )
            // InternalTgfi.g:2302:1: ( '[' )
            {
            // InternalTgfi.g:2302:1: ( '[' )
            // InternalTgfi.g:2303:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualityAttrAccess().getLeftSquareBracketKeyword_1()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
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
    // InternalTgfi.g:2312:1: rule__QualityAttr__Group__2 : rule__QualityAttr__Group__2__Impl rule__QualityAttr__Group__3 ;
    public final void rule__QualityAttr__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2316:1: ( rule__QualityAttr__Group__2__Impl rule__QualityAttr__Group__3 )
            // InternalTgfi.g:2317:2: rule__QualityAttr__Group__2__Impl rule__QualityAttr__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalTgfi.g:2324:1: rule__QualityAttr__Group__2__Impl : ( RULE_STRING ) ;
    public final void rule__QualityAttr__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2328:1: ( ( RULE_STRING ) )
            // InternalTgfi.g:2329:1: ( RULE_STRING )
            {
            // InternalTgfi.g:2329:1: ( RULE_STRING )
            // InternalTgfi.g:2330:2: RULE_STRING
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
    // InternalTgfi.g:2339:1: rule__QualityAttr__Group__3 : rule__QualityAttr__Group__3__Impl ;
    public final void rule__QualityAttr__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2343:1: ( rule__QualityAttr__Group__3__Impl )
            // InternalTgfi.g:2344:2: rule__QualityAttr__Group__3__Impl
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
    // InternalTgfi.g:2350:1: rule__QualityAttr__Group__3__Impl : ( ']' ) ;
    public final void rule__QualityAttr__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2354:1: ( ( ']' ) )
            // InternalTgfi.g:2355:1: ( ']' )
            {
            // InternalTgfi.g:2355:1: ( ']' )
            // InternalTgfi.g:2356:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualityAttrAccess().getRightSquareBracketKeyword_3()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
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
    // InternalTgfi.g:2366:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2370:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalTgfi.g:2371:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
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
    // InternalTgfi.g:2378:1: rule__Rule__Group__0__Impl : ( ruleRuleId ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2382:1: ( ( ruleRuleId ) )
            // InternalTgfi.g:2383:1: ( ruleRuleId )
            {
            // InternalTgfi.g:2383:1: ( ruleRuleId )
            // InternalTgfi.g:2384:2: ruleRuleId
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
    // InternalTgfi.g:2393:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2397:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalTgfi.g:2398:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
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
    // InternalTgfi.g:2405:1: rule__Rule__Group__1__Impl : ( ':' ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2409:1: ( ( ':' ) )
            // InternalTgfi.g:2410:1: ( ':' )
            {
            // InternalTgfi.g:2410:1: ( ':' )
            // InternalTgfi.g:2411:2: ':'
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
    // InternalTgfi.g:2420:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2424:1: ( rule__Rule__Group__2__Impl )
            // InternalTgfi.g:2425:2: rule__Rule__Group__2__Impl
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
    // InternalTgfi.g:2431:1: rule__Rule__Group__2__Impl : ( RULE_STRING ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2435:1: ( ( RULE_STRING ) )
            // InternalTgfi.g:2436:1: ( RULE_STRING )
            {
            // InternalTgfi.g:2436:1: ( RULE_STRING )
            // InternalTgfi.g:2437:2: RULE_STRING
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
    // InternalTgfi.g:2447:1: rule__Tgfi__UnorderedGroup : ( rule__Tgfi__UnorderedGroup__0 )? ;
    public final void rule__Tgfi__UnorderedGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getTgfiAccess().getUnorderedGroup());
        	
        try {
            // InternalTgfi.g:2452:1: ( ( rule__Tgfi__UnorderedGroup__0 )? )
            // InternalTgfi.g:2453:2: ( rule__Tgfi__UnorderedGroup__0 )?
            {
            // InternalTgfi.g:2453:2: ( rule__Tgfi__UnorderedGroup__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( LA18_0 == 11 && getUnorderedGroupHelper().canSelect(grammarAccess.getTgfiAccess().getUnorderedGroup(), 0) ) {
                alt18=1;
            }
            else if ( LA18_0 == 12 && getUnorderedGroupHelper().canSelect(grammarAccess.getTgfiAccess().getUnorderedGroup(), 1) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalTgfi.g:2453:2: rule__Tgfi__UnorderedGroup__0
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
    // InternalTgfi.g:2461:1: rule__Tgfi__UnorderedGroup__Impl : ( ({...}? => ( ( ( ( rule__Tgfi__ImportElAssignment_0 ) ) ( ( ( rule__Tgfi__ImportElAssignment_0 )=> rule__Tgfi__ImportElAssignment_0 )* ) ) ) ) | ({...}? => ( ( ( rule__Tgfi__MainAssignment_1 ) ) ) ) ) ;
    public final void rule__Tgfi__UnorderedGroup__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalTgfi.g:2466:1: ( ( ({...}? => ( ( ( ( rule__Tgfi__ImportElAssignment_0 ) ) ( ( ( rule__Tgfi__ImportElAssignment_0 )=> rule__Tgfi__ImportElAssignment_0 )* ) ) ) ) | ({...}? => ( ( ( rule__Tgfi__MainAssignment_1 ) ) ) ) ) )
            // InternalTgfi.g:2467:3: ( ({...}? => ( ( ( ( rule__Tgfi__ImportElAssignment_0 ) ) ( ( ( rule__Tgfi__ImportElAssignment_0 )=> rule__Tgfi__ImportElAssignment_0 )* ) ) ) ) | ({...}? => ( ( ( rule__Tgfi__MainAssignment_1 ) ) ) ) )
            {
            // InternalTgfi.g:2467:3: ( ({...}? => ( ( ( ( rule__Tgfi__ImportElAssignment_0 ) ) ( ( ( rule__Tgfi__ImportElAssignment_0 )=> rule__Tgfi__ImportElAssignment_0 )* ) ) ) ) | ({...}? => ( ( ( rule__Tgfi__MainAssignment_1 ) ) ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( LA20_0 == 11 && getUnorderedGroupHelper().canSelect(grammarAccess.getTgfiAccess().getUnorderedGroup(), 0) ) {
                alt20=1;
            }
            else if ( LA20_0 == 12 && getUnorderedGroupHelper().canSelect(grammarAccess.getTgfiAccess().getUnorderedGroup(), 1) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalTgfi.g:2468:3: ({...}? => ( ( ( ( rule__Tgfi__ImportElAssignment_0 ) ) ( ( ( rule__Tgfi__ImportElAssignment_0 )=> rule__Tgfi__ImportElAssignment_0 )* ) ) ) )
                    {
                    // InternalTgfi.g:2468:3: ({...}? => ( ( ( ( rule__Tgfi__ImportElAssignment_0 ) ) ( ( ( rule__Tgfi__ImportElAssignment_0 )=> rule__Tgfi__ImportElAssignment_0 )* ) ) ) )
                    // InternalTgfi.g:2469:4: {...}? => ( ( ( ( rule__Tgfi__ImportElAssignment_0 ) ) ( ( ( rule__Tgfi__ImportElAssignment_0 )=> rule__Tgfi__ImportElAssignment_0 )* ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTgfiAccess().getUnorderedGroup(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Tgfi__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getTgfiAccess().getUnorderedGroup(), 0)");
                    }
                    // InternalTgfi.g:2469:98: ( ( ( ( rule__Tgfi__ImportElAssignment_0 ) ) ( ( ( rule__Tgfi__ImportElAssignment_0 )=> rule__Tgfi__ImportElAssignment_0 )* ) ) )
                    // InternalTgfi.g:2470:5: ( ( ( rule__Tgfi__ImportElAssignment_0 ) ) ( ( ( rule__Tgfi__ImportElAssignment_0 )=> rule__Tgfi__ImportElAssignment_0 )* ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getTgfiAccess().getUnorderedGroup(), 0);
                    selected = true;
                    // InternalTgfi.g:2476:5: ( ( ( rule__Tgfi__ImportElAssignment_0 ) ) ( ( ( rule__Tgfi__ImportElAssignment_0 )=> rule__Tgfi__ImportElAssignment_0 )* ) )
                    // InternalTgfi.g:2477:6: ( ( rule__Tgfi__ImportElAssignment_0 ) ) ( ( ( rule__Tgfi__ImportElAssignment_0 )=> rule__Tgfi__ImportElAssignment_0 )* )
                    {
                    // InternalTgfi.g:2477:6: ( ( rule__Tgfi__ImportElAssignment_0 ) )
                    // InternalTgfi.g:2478:7: ( rule__Tgfi__ImportElAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTgfiAccess().getImportElAssignment_0()); 
                    }
                    // InternalTgfi.g:2479:7: ( rule__Tgfi__ImportElAssignment_0 )
                    // InternalTgfi.g:2479:8: rule__Tgfi__ImportElAssignment_0
                    {
                    pushFollow(FOLLOW_23);
                    rule__Tgfi__ImportElAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTgfiAccess().getImportElAssignment_0()); 
                    }

                    }

                    // InternalTgfi.g:2482:6: ( ( ( rule__Tgfi__ImportElAssignment_0 )=> rule__Tgfi__ImportElAssignment_0 )* )
                    // InternalTgfi.g:2483:7: ( ( rule__Tgfi__ImportElAssignment_0 )=> rule__Tgfi__ImportElAssignment_0 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTgfiAccess().getImportElAssignment_0()); 
                    }
                    // InternalTgfi.g:2484:7: ( ( rule__Tgfi__ImportElAssignment_0 )=> rule__Tgfi__ImportElAssignment_0 )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==11) ) {
                            int LA19_1 = input.LA(2);

                            if ( (LA19_1==RULE_STRING) ) {
                                int LA19_3 = input.LA(3);

                                if ( (synpred1_InternalTgfi()) ) {
                                    alt19=1;
                                }


                            }


                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalTgfi.g:2484:8: ( rule__Tgfi__ImportElAssignment_0 )=> rule__Tgfi__ImportElAssignment_0
                    	    {
                    	    pushFollow(FOLLOW_23);
                    	    rule__Tgfi__ImportElAssignment_0();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop19;
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
                    // InternalTgfi.g:2490:3: ({...}? => ( ( ( rule__Tgfi__MainAssignment_1 ) ) ) )
                    {
                    // InternalTgfi.g:2490:3: ({...}? => ( ( ( rule__Tgfi__MainAssignment_1 ) ) ) )
                    // InternalTgfi.g:2491:4: {...}? => ( ( ( rule__Tgfi__MainAssignment_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTgfiAccess().getUnorderedGroup(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Tgfi__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getTgfiAccess().getUnorderedGroup(), 1)");
                    }
                    // InternalTgfi.g:2491:98: ( ( ( rule__Tgfi__MainAssignment_1 ) ) )
                    // InternalTgfi.g:2492:5: ( ( rule__Tgfi__MainAssignment_1 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getTgfiAccess().getUnorderedGroup(), 1);
                    selected = true;
                    // InternalTgfi.g:2498:5: ( ( rule__Tgfi__MainAssignment_1 ) )
                    // InternalTgfi.g:2499:6: ( rule__Tgfi__MainAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTgfiAccess().getMainAssignment_1()); 
                    }
                    // InternalTgfi.g:2500:6: ( rule__Tgfi__MainAssignment_1 )
                    // InternalTgfi.g:2500:7: rule__Tgfi__MainAssignment_1
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
    // InternalTgfi.g:2513:1: rule__Tgfi__UnorderedGroup__0 : rule__Tgfi__UnorderedGroup__Impl ( rule__Tgfi__UnorderedGroup__1 )? ;
    public final void rule__Tgfi__UnorderedGroup__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2517:1: ( rule__Tgfi__UnorderedGroup__Impl ( rule__Tgfi__UnorderedGroup__1 )? )
            // InternalTgfi.g:2518:2: rule__Tgfi__UnorderedGroup__Impl ( rule__Tgfi__UnorderedGroup__1 )?
            {
            pushFollow(FOLLOW_24);
            rule__Tgfi__UnorderedGroup__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalTgfi.g:2519:2: ( rule__Tgfi__UnorderedGroup__1 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( LA21_0 == 11 && getUnorderedGroupHelper().canSelect(grammarAccess.getTgfiAccess().getUnorderedGroup(), 0) ) {
                alt21=1;
            }
            else if ( LA21_0 == 12 && getUnorderedGroupHelper().canSelect(grammarAccess.getTgfiAccess().getUnorderedGroup(), 1) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalTgfi.g:2519:2: rule__Tgfi__UnorderedGroup__1
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
    // InternalTgfi.g:2525:1: rule__Tgfi__UnorderedGroup__1 : rule__Tgfi__UnorderedGroup__Impl ;
    public final void rule__Tgfi__UnorderedGroup__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2529:1: ( rule__Tgfi__UnorderedGroup__Impl )
            // InternalTgfi.g:2530:2: rule__Tgfi__UnorderedGroup__Impl
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
    // InternalTgfi.g:2537:1: rule__Tgfi__ImportElAssignment_0 : ( ruleImport ) ;
    public final void rule__Tgfi__ImportElAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2541:1: ( ( ruleImport ) )
            // InternalTgfi.g:2542:2: ( ruleImport )
            {
            // InternalTgfi.g:2542:2: ( ruleImport )
            // InternalTgfi.g:2543:3: ruleImport
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
    // InternalTgfi.g:2552:1: rule__Tgfi__MainAssignment_1 : ( ruleMainTgf ) ;
    public final void rule__Tgfi__MainAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2556:1: ( ( ruleMainTgf ) )
            // InternalTgfi.g:2557:2: ( ruleMainTgf )
            {
            // InternalTgfi.g:2557:2: ( ruleMainTgf )
            // InternalTgfi.g:2558:3: ruleMainTgf
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
    // InternalTgfi.g:2567:1: rule__Import__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Import__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2571:1: ( ( RULE_STRING ) )
            // InternalTgfi.g:2572:2: ( RULE_STRING )
            {
            // InternalTgfi.g:2572:2: ( RULE_STRING )
            // InternalTgfi.g:2573:3: RULE_STRING
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
    // InternalTgfi.g:2582:1: rule__MainTgf__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MainTgf__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2586:1: ( ( RULE_ID ) )
            // InternalTgfi.g:2587:2: ( RULE_ID )
            {
            // InternalTgfi.g:2587:2: ( RULE_ID )
            // InternalTgfi.g:2588:3: RULE_ID
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
    // InternalTgfi.g:2597:1: rule__MainTgf__GenPackageAssignment_3_2 : ( RULE_STRING ) ;
    public final void rule__MainTgf__GenPackageAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2601:1: ( ( RULE_STRING ) )
            // InternalTgfi.g:2602:2: ( RULE_STRING )
            {
            // InternalTgfi.g:2602:2: ( RULE_STRING )
            // InternalTgfi.g:2603:3: RULE_STRING
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
    // InternalTgfi.g:2612:1: rule__MainTgf__SatNameAssignment_4_2 : ( RULE_STRING ) ;
    public final void rule__MainTgf__SatNameAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2616:1: ( ( RULE_STRING ) )
            // InternalTgfi.g:2617:2: ( RULE_STRING )
            {
            // InternalTgfi.g:2617:2: ( RULE_STRING )
            // InternalTgfi.g:2618:3: RULE_STRING
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
    // InternalTgfi.g:2627:1: rule__MainTgf__VersionNameAssignment_5_2 : ( RULE_STRING ) ;
    public final void rule__MainTgf__VersionNameAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2631:1: ( ( RULE_STRING ) )
            // InternalTgfi.g:2632:2: ( RULE_STRING )
            {
            // InternalTgfi.g:2632:2: ( RULE_STRING )
            // InternalTgfi.g:2633:3: RULE_STRING
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
    // InternalTgfi.g:2642:1: rule__MainTgf__StatusNameAssignment_6_2 : ( RULE_STRING ) ;
    public final void rule__MainTgf__StatusNameAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2646:1: ( ( RULE_STRING ) )
            // InternalTgfi.g:2647:2: ( RULE_STRING )
            {
            // InternalTgfi.g:2647:2: ( RULE_STRING )
            // InternalTgfi.g:2648:3: RULE_STRING
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
    // InternalTgfi.g:2657:1: rule__MainTgf__ObjectiveNameAssignment_7_2 : ( RULE_STRING ) ;
    public final void rule__MainTgf__ObjectiveNameAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2661:1: ( ( RULE_STRING ) )
            // InternalTgfi.g:2662:2: ( RULE_STRING )
            {
            // InternalTgfi.g:2662:2: ( RULE_STRING )
            // InternalTgfi.g:2663:3: RULE_STRING
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
    // InternalTgfi.g:2672:1: rule__MainTgf__HlfunctionNameAssignment_8_2 : ( RULE_STRING ) ;
    public final void rule__MainTgf__HlfunctionNameAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2676:1: ( ( RULE_STRING ) )
            // InternalTgfi.g:2677:2: ( RULE_STRING )
            {
            // InternalTgfi.g:2677:2: ( RULE_STRING )
            // InternalTgfi.g:2678:3: RULE_STRING
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
    // InternalTgfi.g:2687:1: rule__MainTgf__RulesAssignment_9_2 : ( ruleRule ) ;
    public final void rule__MainTgf__RulesAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2691:1: ( ( ruleRule ) )
            // InternalTgfi.g:2692:2: ( ruleRule )
            {
            // InternalTgfi.g:2692:2: ( ruleRule )
            // InternalTgfi.g:2693:3: ruleRule
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
    // InternalTgfi.g:2702:1: rule__MainTgf__ProfAssignment_10 : ( ruleProfile ) ;
    public final void rule__MainTgf__ProfAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2706:1: ( ( ruleProfile ) )
            // InternalTgfi.g:2707:2: ( ruleProfile )
            {
            // InternalTgfi.g:2707:2: ( ruleProfile )
            // InternalTgfi.g:2708:3: ruleProfile
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
    // InternalTgfi.g:2717:1: rule__Profile__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Profile__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2721:1: ( ( RULE_ID ) )
            // InternalTgfi.g:2722:2: ( RULE_ID )
            {
            // InternalTgfi.g:2722:2: ( RULE_ID )
            // InternalTgfi.g:2723:3: RULE_ID
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
    // InternalTgfi.g:2732:1: rule__Profile__ProfNameAssignment_3_2 : ( RULE_STRING ) ;
    public final void rule__Profile__ProfNameAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2736:1: ( ( RULE_STRING ) )
            // InternalTgfi.g:2737:2: ( RULE_STRING )
            {
            // InternalTgfi.g:2737:2: ( RULE_STRING )
            // InternalTgfi.g:2738:3: RULE_STRING
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
    // InternalTgfi.g:2747:1: rule__Profile__DescrNameAssignment_4_2 : ( RULE_STRING ) ;
    public final void rule__Profile__DescrNameAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2751:1: ( ( RULE_STRING ) )
            // InternalTgfi.g:2752:2: ( RULE_STRING )
            {
            // InternalTgfi.g:2752:2: ( RULE_STRING )
            // InternalTgfi.g:2753:3: RULE_STRING
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
    // InternalTgfi.g:2762:1: rule__Profile__FeatNameAssignment_5_2 : ( RULE_STRING ) ;
    public final void rule__Profile__FeatNameAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2766:1: ( ( RULE_STRING ) )
            // InternalTgfi.g:2767:2: ( RULE_STRING )
            {
            // InternalTgfi.g:2767:2: ( RULE_STRING )
            // InternalTgfi.g:2768:3: RULE_STRING
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
    // InternalTgfi.g:2777:1: rule__Profile__FunctionNameAssignment_6_2 : ( RULE_STRING ) ;
    public final void rule__Profile__FunctionNameAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2781:1: ( ( RULE_STRING ) )
            // InternalTgfi.g:2782:2: ( RULE_STRING )
            {
            // InternalTgfi.g:2782:2: ( RULE_STRING )
            // InternalTgfi.g:2783:3: RULE_STRING
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
    // InternalTgfi.g:2792:1: rule__Profile__ActorAssignment_8 : ( ruleActor ) ;
    public final void rule__Profile__ActorAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2796:1: ( ( ruleActor ) )
            // InternalTgfi.g:2797:2: ( ruleActor )
            {
            // InternalTgfi.g:2797:2: ( ruleActor )
            // InternalTgfi.g:2798:3: ruleActor
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
    // InternalTgfi.g:2807:1: rule__Profile__TransactionAssignment_10 : ( ruleTransaction ) ;
    public final void rule__Profile__TransactionAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2811:1: ( ( ruleTransaction ) )
            // InternalTgfi.g:2812:2: ( ruleTransaction )
            {
            // InternalTgfi.g:2812:2: ( ruleTransaction )
            // InternalTgfi.g:2813:3: ruleTransaction
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
    // InternalTgfi.g:2822:1: rule__Profile__DomainAssignment_12 : ( ruleDomain ) ;
    public final void rule__Profile__DomainAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2826:1: ( ( ruleDomain ) )
            // InternalTgfi.g:2827:2: ( ruleDomain )
            {
            // InternalTgfi.g:2827:2: ( ruleDomain )
            // InternalTgfi.g:2828:3: ruleDomain
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
    // InternalTgfi.g:2837:1: rule__Profile__QualityattrAssignment_14 : ( ruleQualityAttr ) ;
    public final void rule__Profile__QualityattrAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTgfi.g:2841:1: ( ( ruleQualityAttr ) )
            // InternalTgfi.g:2842:2: ( ruleQualityAttr )
            {
            // InternalTgfi.g:2842:2: ( ruleQualityAttr )
            // InternalTgfi.g:2843:3: ruleQualityAttr
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

    // $ANTLR start synpred1_InternalTgfi
    public final void synpred1_InternalTgfi_fragment() throws RecognitionException {   
        // InternalTgfi.g:2484:8: ( rule__Tgfi__ImportElAssignment_0 )
        // InternalTgfi.g:2484:9: rule__Tgfi__ImportElAssignment_0
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
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000071020000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000084000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000001802L});

}
