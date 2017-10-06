package co.rsk.net.sync;


import co.rsk.net.MessageChannel;
import co.rsk.net.Status;

public class SimpleSyncInformation implements SyncInformation {
    private boolean hasLowerDifficulty = true;

    @Override
    public boolean isKnownBlock(byte[] hash) {
        return false;
    }

    @Override
    public boolean hasLowerDifficulty(MessageChannel peer) {
        return hasLowerDifficulty;
    }

    @Override
    public Status getSelectedPeerStatus() {
        return null;
    }

    public SimpleSyncInformation withWorsePeers() {
        this.hasLowerDifficulty = false;
        return this;
    }
}