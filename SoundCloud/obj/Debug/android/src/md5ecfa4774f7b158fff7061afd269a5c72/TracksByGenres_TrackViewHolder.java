package md5ecfa4774f7b158fff7061afd269a5c72;


public class TracksByGenres_TrackViewHolder
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer
{
	static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("SoundCloud.TracksByGenres+TrackViewHolder, SoundCloud, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", TracksByGenres_TrackViewHolder.class, __md_methods);
	}


	public TracksByGenres_TrackViewHolder () throws java.lang.Throwable
	{
		super ();
		if (getClass () == TracksByGenres_TrackViewHolder.class)
			mono.android.TypeManager.Activate ("SoundCloud.TracksByGenres+TrackViewHolder, SoundCloud, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}

	java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
