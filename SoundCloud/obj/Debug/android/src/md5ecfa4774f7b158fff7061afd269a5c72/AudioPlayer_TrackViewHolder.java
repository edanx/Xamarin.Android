package md5ecfa4774f7b158fff7061afd269a5c72;


public class AudioPlayer_TrackViewHolder
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer
{
	static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("SoundCloud.AudioPlayer+TrackViewHolder, SoundCloud, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", AudioPlayer_TrackViewHolder.class, __md_methods);
	}


	public AudioPlayer_TrackViewHolder () throws java.lang.Throwable
	{
		super ();
		if (getClass () == AudioPlayer_TrackViewHolder.class)
			mono.android.TypeManager.Activate ("SoundCloud.AudioPlayer+TrackViewHolder, SoundCloud, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
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
