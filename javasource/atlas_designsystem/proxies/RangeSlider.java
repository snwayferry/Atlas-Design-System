// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package atlas_designsystem.proxies;

public class RangeSlider
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject rangeSliderMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Atlas_DesignSystem.RangeSlider";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		LowerValue("LowerValue"),
		UpperValue("UpperValue"),
		MinimumValue("MinimumValue"),
		MaximumValue("MaximumValue"),
		Step("Step");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public RangeSlider(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Atlas_DesignSystem.RangeSlider"));
	}

	protected RangeSlider(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject rangeSliderMendixObject)
	{
		if (rangeSliderMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Atlas_DesignSystem.RangeSlider", rangeSliderMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Atlas_DesignSystem.RangeSlider");

		this.rangeSliderMendixObject = rangeSliderMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'RangeSlider.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static atlas_designsystem.proxies.RangeSlider initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return atlas_designsystem.proxies.RangeSlider.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static atlas_designsystem.proxies.RangeSlider initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new atlas_designsystem.proxies.RangeSlider(context, mendixObject);
	}

	public static atlas_designsystem.proxies.RangeSlider load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return atlas_designsystem.proxies.RangeSlider.initialize(context, mendixObject);
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of LowerValue
	 */
	public final java.lang.Integer getLowerValue()
	{
		return getLowerValue(getContext());
	}

	/**
	 * @param context
	 * @return value of LowerValue
	 */
	public final java.lang.Integer getLowerValue(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.LowerValue.toString());
	}

	/**
	 * Set value of LowerValue
	 * @param lowervalue
	 */
	public final void setLowerValue(java.lang.Integer lowervalue)
	{
		setLowerValue(getContext(), lowervalue);
	}

	/**
	 * Set value of LowerValue
	 * @param context
	 * @param lowervalue
	 */
	public final void setLowerValue(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer lowervalue)
	{
		getMendixObject().setValue(context, MemberNames.LowerValue.toString(), lowervalue);
	}

	/**
	 * @return value of UpperValue
	 */
	public final java.lang.Integer getUpperValue()
	{
		return getUpperValue(getContext());
	}

	/**
	 * @param context
	 * @return value of UpperValue
	 */
	public final java.lang.Integer getUpperValue(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.UpperValue.toString());
	}

	/**
	 * Set value of UpperValue
	 * @param uppervalue
	 */
	public final void setUpperValue(java.lang.Integer uppervalue)
	{
		setUpperValue(getContext(), uppervalue);
	}

	/**
	 * Set value of UpperValue
	 * @param context
	 * @param uppervalue
	 */
	public final void setUpperValue(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer uppervalue)
	{
		getMendixObject().setValue(context, MemberNames.UpperValue.toString(), uppervalue);
	}

	/**
	 * @return value of MinimumValue
	 */
	public final java.lang.Integer getMinimumValue()
	{
		return getMinimumValue(getContext());
	}

	/**
	 * @param context
	 * @return value of MinimumValue
	 */
	public final java.lang.Integer getMinimumValue(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.MinimumValue.toString());
	}

	/**
	 * Set value of MinimumValue
	 * @param minimumvalue
	 */
	public final void setMinimumValue(java.lang.Integer minimumvalue)
	{
		setMinimumValue(getContext(), minimumvalue);
	}

	/**
	 * Set value of MinimumValue
	 * @param context
	 * @param minimumvalue
	 */
	public final void setMinimumValue(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer minimumvalue)
	{
		getMendixObject().setValue(context, MemberNames.MinimumValue.toString(), minimumvalue);
	}

	/**
	 * @return value of MaximumValue
	 */
	public final java.lang.Integer getMaximumValue()
	{
		return getMaximumValue(getContext());
	}

	/**
	 * @param context
	 * @return value of MaximumValue
	 */
	public final java.lang.Integer getMaximumValue(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.MaximumValue.toString());
	}

	/**
	 * Set value of MaximumValue
	 * @param maximumvalue
	 */
	public final void setMaximumValue(java.lang.Integer maximumvalue)
	{
		setMaximumValue(getContext(), maximumvalue);
	}

	/**
	 * Set value of MaximumValue
	 * @param context
	 * @param maximumvalue
	 */
	public final void setMaximumValue(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer maximumvalue)
	{
		getMendixObject().setValue(context, MemberNames.MaximumValue.toString(), maximumvalue);
	}

	/**
	 * @return value of Step
	 */
	public final java.lang.Integer getStep()
	{
		return getStep(getContext());
	}

	/**
	 * @param context
	 * @return value of Step
	 */
	public final java.lang.Integer getStep(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Step.toString());
	}

	/**
	 * Set value of Step
	 * @param step
	 */
	public final void setStep(java.lang.Integer step)
	{
		setStep(getContext(), step);
	}

	/**
	 * Set value of Step
	 * @param context
	 * @param step
	 */
	public final void setStep(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer step)
	{
		getMendixObject().setValue(context, MemberNames.Step.toString(), step);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return rangeSliderMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final atlas_designsystem.proxies.RangeSlider that = (atlas_designsystem.proxies.RangeSlider) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "Atlas_DesignSystem.RangeSlider";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
