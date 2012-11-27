import com.paypal.risk.idi.variables.AbstractBaseVariable;
import com.paypal.risk.idi.variables.mep.MEPSenderVariable;
import com.paypal.risk.idi.variables.mep.max_cross20wRtDclAcc;
import com.paypal.risk.idi.variables.mep.MEPSenderVariable.MEPSenderVarName;
import com.paypal.risk.idi.variables.radd.asp_spoof_txns;
import com.paypal.risk.idi.variables.radd.radd_timezone_3_2;
import com.paypal.risk.idi.variables.radd.SmSpoofIvfRADDVariable.MISC_KEY03;
import com.paypal.risk.idi.variables.transaction.radd_max_pmt_s_3;
import com.paypal.risk.idi.variables.tsc.IP4MatchLogin;
import com.paypal.risk.idi.variables.tsc.VIDMatchLogin;

public class SessionVariableRepository {
	public static final AbstractBaseVariable login_VIDMatch = new VIDMatchLogin();
	public static final AbstractBaseVariable login_IP4Match = new IP4MatchLogin();
	public static final AbstractBaseVariable SNR1wRtDolDclTxn = new MEPSenderVariable(MEPSenderVarName.snr1wRtDolDclTxn);
	public static final AbstractBaseVariable ip_asp_spoof_txns = new asp_spoof_txns(MISC_KEY03.IP_NUMBER);
	public static final AbstractBaseVariable max_cross20wRtDclAcc = new max_cross20wRtDclAcc();
	public static final AbstractBaseVariable radd_max_pmt_s_3 = new radd_max_pmt_s_3();
	public static final AbstractBaseVariable radd_timezone_3_2 = new radd_timezone_3_2();
	public static final AbstractBaseVariable vid_asp_spoof_txns = new asp_spoof_txns(MISC_KEY03.VID);	
}
