package net.sourceforge.pmd.lang.java.javadoc;

import java.util.HashMap;
import java.util.Map;

public class JavadocTag {

	public final String label;
	public final String description;
	
	public static final JavadocTag AUTHOR  		= new JavadocTag("author", 	"Authors of the source code, in chronological order");
	public static final JavadocTag SINCE		= new JavadocTag("since", 	"Version of the source code that this item was introduced, can be a number or a date");
	public static final JavadocTag VERSION  	= new JavadocTag("version", "Current version number of the source code");
	public static final JavadocTag DEPRECATED	= new JavadocTag("deprecated", "Indicates that an item is a member of the deprecated API");
	public static final JavadocTag PARAM  		= new JavadocTag("param", 	" ");
	public static final JavadocTag THROWS  		= new JavadocTag("throws", 	" ");
	public static final JavadocTag SEE  		= new JavadocTag("see", 	" ");

/*	public static final JavadocTag POST  		= new JavadocTag("post", 	" ");
	public static final JavadocTag PRE  		= new JavadocTag("pre", 	" ");
	public static final JavadocTag RETURN  		= new JavadocTag("return", 	" ");
	public static final JavadocTag INV  		= new JavadocTag("inv", 	" ");
	public static final JavadocTag INVARIANT  	= new JavadocTag("invariant", 	" ");
	public static final JavadocTag PATTERN  	= new JavadocTag("pattern", 	" ");	
	public static final JavadocTag SERIAL  		= new JavadocTag("serial", 	" ");	
	public static final JavadocTag SERIAL_DATA	= new JavadocTag("serialData", 	" ");
	public static final JavadocTag SERIAL_FIELD	= new JavadocTag("serialField", 	" ");
	public static final JavadocTag GENERATED  	= new JavadocTag("generated", 	" ");
	public static final JavadocTag GENERATED_BY	= new JavadocTag("generatedBy", 	" ");  */
	
	private static final Map<String, JavadocTag> tagsById = new HashMap<String, JavadocTag>();
	
	private JavadocTag(String theLabel, String theDescription) {
		label = theLabel;
		description = theDescription;
		
		if (tagsById.containsKey(theLabel)) {
			throw new IllegalArgumentException("pre-existing tag!");
		}
		
		tagsById.put(theLabel, this);
	}
	
	public static JavadocTag tagFor(String id) {
		return tagsById.get(id);
	}
	
}