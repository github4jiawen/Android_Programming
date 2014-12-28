public class CrimeLab {
	private static CrimeLab sCrimeLab;
	private Context mAppContext;

	private CrimeLab(Context AppContext) {
		mAppContext = AppContext;
	}

	public static CrimeLab get(Context c) {
		if (sCrimeLab == null) {
			sCrimeLab = new CrimeLab(c.getApplicationContext());
		}
		return sCrimeLab;

	}
}