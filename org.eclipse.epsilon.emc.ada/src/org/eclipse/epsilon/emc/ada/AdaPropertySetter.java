package org.eclipse.epsilon.emc.ada;

import org.eclipse.epsilon.eol.exceptions.EolIllegalPropertyException;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.execute.introspection.AbstractPropertySetter;
import org.eclipse.epsilon.eol.execute.introspection.IReflectivePropertySetter;

public class AdaPropertySetter extends AbstractPropertySetter implements
IReflectivePropertySetter {

	@Override
	public void invoke(Object value) throws EolRuntimeException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean conforms(Object value) throws EolIllegalPropertyException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object coerce(Object value) throws EolIllegalPropertyException {
		// TODO Auto-generated method stub
		return null;
	}

}
