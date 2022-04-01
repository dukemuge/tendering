package controllers

import java.io.File
import java.io.IOException
import java.nio.file.Files
import java.nio.file.attribute.BasicFileAttributes
import java.time.Instant
import java.util
import java.util.Comparator



class Test {
    val dir = new File("d:\\test")
    val files = dir.listFiles
    System.out.println("-- printing files before sort --")
    printFiles(files)
    sortFilesByDateCreated(files)
    System.out.println("-- printing files after sort --")
    printFiles(files)



  import java.time.ZoneId

  private def printFiles(files: Array[File]): Unit = {
    for (file <- files) {
      val m = getFileCreationEpoch(file)
      val instant = Instant.ofEpochMilli(m)
      val date = instant.atZone(ZoneId.systemDefault).toLocalDateTime
    }
  }

  def sortFilesByDateCreated(files: Array[File]): Unit = {
    util.Arrays.sort(files, new Comparator[File]() {
      override def compare(f1: File, f2: File): Int = {
        val l1 = getFileCreationEpoch(f1)
        val l2 = getFileCreationEpoch(f2)
           (l1).compareTo(l2)
      }
    })
  }


  def getFileCreationEpoch(file: File): Long = try {
    val attr = Files.readAttributes(file.toPath, classOf[BasicFileAttributes])
    attr.creationTime.toInstant.toEpochMilli
  } catch {
    case e: IOException =>
      throw new RuntimeException(file.getAbsolutePath, e)
  }

}
