package gsystem;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.Test;

import global.factorybank.FactoryBank;
import global.levels.GlobalLevels;
import global.lock.Locks;
import global.map.ProgramMap;
import global.midi.Midi;
import global.pedal.Pedal;
import global.switches.Switches;
import global.tuner.Tuner;

public class SQSContentTest {

	@Test
	public void testRaw() throws IOException {
		Path filePath = Paths.get("src", "test", "resources", "myset.sqs");
		byte[] sqs = Files.readAllBytes(filePath);
		SQSContent sqsContent = new SQSContent(sqs);
		sqsContent.write2Bytes(0);
	}

	@Test
	public void testShowSQS() throws IOException {
		Path filePath = Paths.get("src", "test", "resources", "switches", "mto4.SQS"); // "myset.sqs");
		byte[] sqs = Files.readAllBytes(filePath);
		SQSContent sqsContent = new SQSContent(sqs);
		GlobalLevels globalLevels = new GlobalLevels();
		globalLevels.set(sqsContent.getGlobalData());
		globalLevels.show();

		System.out.println("= Global Levels =");
		Tuner tuner = new Tuner();
		tuner.set(sqsContent.getGlobalData());
		tuner.show();

		System.out.println("= Factory Bank =");
		FactoryBank factoryBank = new FactoryBank();
		factoryBank.set(sqsContent.getGlobalData());
		factoryBank.show();

		System.out.println("= Midi =");
		Midi midi = new Midi();
		midi.set(sqsContent.getGlobalData());
		midi.show();

		System.out.println("= Pedal =");
		Pedal pedal = new Pedal();
		pedal.set(sqsContent.getGlobalData());
		pedal.show();

		System.out.println("= Program Map =");
		ProgramMap programMap = new ProgramMap();
		programMap.set(sqsContent.getGlobalData());
		programMap.show();

		System.out.println("= Locks =");
		Locks locks = new Locks();
		locks.set(sqsContent.getGlobalData());
		locks.show();

		System.out.println("= Switches =");
		Switches switches = new Switches();
		switches.set(sqsContent.getGlobalData());
		switches.show();

		// ToDo: Pedal

//		List<PRSContent> prsContents = sqsContent.getPRSContents();
//		System.out.println(
//				"ID;Patch;Filter;Filter Values;Compressor;Compressor Values;Noise Gate;Noise Gate Values;Modulation;Modulation Values;Pitch;Pitch Values;Delay;Delay Values;Reverb;Reverb Values;EQ;EQ Values; RelayA; RelayB");
//		for (PRSContent prsContent : prsContents) {
//			Preset preset = new Preset();
//			preset.setFromPrsContent(prsContent);
//			preset.show();
//		}

	}

}
