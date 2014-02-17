/*
 * $Id$
 * 
 * Copyright (c) 2008 David Muller <roxon@users.sourceforge.net>.
 * All rights reserved. Use of the code is allowed under the
 * Artistic License 2.0 terms, as specified in the LICENSE file
 * distributed with this code, or available from
 * http://www.opensource.org/licenses/artistic-license-2.0.php
 */
package org.pwsafe.lib.exception;

/**
 *
 */
public class InvalidPassphrasePolicy extends Exception
{
	/**
	 * 
	 */
	public InvalidPassphrasePolicy()
	{
		super();
	}

	/**
	 * @param arg0
	 */
	public InvalidPassphrasePolicy( String arg0 )
	{
		super( arg0 );
	}

	/**
	 * @param arg0
	 */
	public InvalidPassphrasePolicy( Throwable arg0 )
	{
		super( arg0 );
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public InvalidPassphrasePolicy( String arg0, Throwable arg1 )
	{
		super( arg0, arg1 );
	}
}
