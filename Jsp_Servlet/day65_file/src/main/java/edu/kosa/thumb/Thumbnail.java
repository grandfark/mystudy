package edu.kosa.thumb;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.media.jai.JAI;
import javax.media.jai.RenderedOp; //랜더링

public class Thumbnail {

	// 썸네일 이미지를 생성하는 메소드
	public static void createimage(String loadFile, String saveFile, String fileExt, int zoom) 
			throws Exception {
		
		File save = new File(saveFile);// 썸네일 이미지
		// loadFile은 원본 이미지 파일, RenderedOp 객체 생성
		RenderedOp op = JAI.create("fileload", loadFile);
		// bufferedimage 이미지 객체를 얻어와서
		BufferedImage im = op.getAsBufferedImage();

		if (zoom <= 0)	zoom = 1;

		int width = im.getWidth() / zoom;// 축소하고자 하는 배율
		int height = im.getHeight() / zoom;// 축소하고자 하는 배율
		
		// 메모리에 이미지 공간을 생성
		BufferedImage thumb = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

		Graphics2D g2 = thumb.createGraphics();
		
		// 메모리의 이미지 공간에 원본 이미지를 width, height크기로 그린다
		// 실제로 그려주는 부분
		g2.drawImage(im, 0, 0, width, height, null);//(0,0) 부터(높이, 너비)까지 축소
		ImageIO.write(thumb, fileExt.toUpperCase(), save);// 메모리에 그린 이미지 파일을 저장
	}
}
