// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package ziphandling.actions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import java.util.concurrent.TimeUnit;
import com.mendix.core.Core;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import com.mendix.systemwideinterfaces.core.IMendixObject;

/**
 * This Java action will zip all files given in the list of documets in one zip file output.zip.
 */
public class ZipDocuments extends CustomJavaAction<IMendixObject>
{
	private java.util.List<IMendixObject> __ListOfDocument;
	private java.util.List<system.proxies.FileDocument> ListOfDocument;

	public ZipDocuments(IContext context, java.util.List<IMendixObject> ListOfDocument)
	{
		super(context);
		this.__ListOfDocument = ListOfDocument;
	}

	@java.lang.Override
	public IMendixObject executeAction() throws Exception
	{
		this.ListOfDocument = new java.util.ArrayList<system.proxies.FileDocument>();
		if (__ListOfDocument != null)
			for (IMendixObject __ListOfDocumentElement : __ListOfDocument)
				this.ListOfDocument.add(system.proxies.FileDocument.initialize(getContext(), __ListOfDocumentElement));

		// BEGIN USER CODE

		File tempZipFile = File.createTempFile("zipfile", "temp");

		ZipOutputStream zipStream = new ZipOutputStream(new FileOutputStream(tempZipFile));

		List<String> fileList = new ArrayList<String>();

		for (system.proxies.FileDocument file : ListOfDocument) {
			String fileName = file.getName();
			// skip files with no names
			if (fileName != null) {
				//skip files with no contents
				if (file.getHasContents()) {
						if (fileList.contains(fileName)) fileName = file.getMendixObject().getId().toLong() + " " + fileName;

						InputStream inputStream = Core.getFileDocumentContent(getContext(), file.getMendixObject());
						ZipDocuments.addToZipFile(inputStream,fileName,zipStream);

						zipStream.closeEntry();
						fileList.add(fileName);
				}
			}
		}
		zipStream.close();

		IMendixObject mendixObject = Core.instantiate(getContext(), "System.FileDocument");
		mendixObject.setValue(getContext(), "Name" , "output.zip" );
		mendixObject.setValue(getContext(), "DeleteAfterDownload" , "false" );

		InputStream zipInputStream = new FileInputStream(tempZipFile);

		Core.storeFileDocumentContent(getContext(), mendixObject, zipInputStream);

        TimeUnit.SECONDS.sleep(5);

		zipInputStream.close();

		tempZipFile.delete();


	    return mendixObject;

		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "ZipDocuments";
	}

	// BEGIN EXTRA CODE
	public static void addToZipFile(InputStream fis,String fileName, ZipOutputStream zos) throws FileNotFoundException, IOException {


		ZipEntry zipEntry = new ZipEntry(fileName);
		zos.putNextEntry(zipEntry);

		byte[] bytes = new byte[1024];
		int length;
		while ((length = fis.read(bytes)) >= 0) {
			zos.write(bytes, 0, length);
		}

		zos.closeEntry();
		fis.close();
	}

	// END EXTRA CODE
}
