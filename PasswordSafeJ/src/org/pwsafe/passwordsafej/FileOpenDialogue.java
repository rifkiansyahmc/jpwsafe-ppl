/*
 * $Id$
 * 
 * Copyright (c) 2008 David Muller <roxon@users.sourceforge.net>.
 * All rights reserved. Use of the code is allowed under the
 * Artistic License 2.0 terms, as specified in the LICENSE file
 * distributed with this code, or available from
 * http://www.opensource.org/licenses/artistic-license-2.0.php
 */
package org.pwsafe.passwordsafej;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileSystemView;

/**
 *
 * @author Kevin Preece
 */
public class FileOpenDialogue extends JFileChooser
{
	class PwsFileFilter extends FileFilter
	{
		/**
		 * 
		 * @param pathname
		 * @return
		 * 
		 * @see java.io.FileFilter#accept(java.io.File)
		 */
		public boolean accept( File pathname )
		{
			int		pos;
			String	ext;
			String	path;

			if ( pathname.isDirectory() )
			{
				return true;
			}

			path	= pathname.getName();
			pos		= path.lastIndexOf( '.' );

			if ( (pos >= 0) )
			{
				ext	= path.substring( pos );

				if ( ext.equals(".dat") )
				{
					return true;
				}
			}
			return false;
		}

		public String getDescription()
		{
	        return I18nHelper.getInstance().formatMessage("filechooser.passwordsafe");
	    }
	}

	/**
	 * 
	 */
	public FileOpenDialogue()
	{
		super();
		setOptions();
	}

	/**
	 * @param currentDirectory
	 */
	public FileOpenDialogue( File currentDirectory )
	{
		super( currentDirectory );
		setOptions();
	}

	/**
	 * @param currentDirectoryPath
	 */
	public FileOpenDialogue( String currentDirectoryPath )
	{
		super( currentDirectoryPath );
		setOptions();
	}

	/**
	 * @param fsv
	 */
	public FileOpenDialogue( FileSystemView fsv )
	{
		super( fsv );
		setOptions();
	}

	/**
	 * @param currentDirectory
	 * @param fsv
	 */
	public FileOpenDialogue( File currentDirectory, FileSystemView fsv )
	{
		super( currentDirectory, fsv );
		setOptions();
	}

	/**
	 * @param currentDirectoryPath
	 * @param fsv
	 */
	public FileOpenDialogue( String currentDirectoryPath, FileSystemView fsv )
	{
		super( currentDirectoryPath, fsv );
		setOptions();
	}

	private void setOptions()
	{
		setMultiSelectionEnabled( false );
		addChoosableFileFilter( new PwsFileFilter() );
	}
}
