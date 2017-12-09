package fastily.jwiki.dwrap;

import java.time.Instant;

import com.google.gson.JsonObject;

import fastily.jwiki.util.GSONP;

/**
 * Represents a contribution made by a user.
 * 
 * @author Fastily
 *
 */
public class Contrib extends DataEntry
{
	/**
	 * This contribution's revision id.
	 */
	public final int revid;

	/**
	 * This contribution's parent ID
	 */
	public final int parentid;

	/**
	 * Creates a Contrib object from a JSONObject returned by the server, representing a single contribution.
	 * 
	 * @param r The JSONObject returned by the server, representing a contribution.
	 */
	public Contrib(JsonObject r)
	{
		super(GSONP.getStr(r, "user"), GSONP.getStr(r, "title"), GSONP.getStr(r, "comment"),
				Instant.parse(GSONP.getStr(r, "timestamp")));
		revid = r.get("revid").getAsInt();
		parentid = r.get("parentid").getAsInt();
	}
}