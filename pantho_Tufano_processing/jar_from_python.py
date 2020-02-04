import subprocess
def get_source_target(file1, file2, line_number, change_window_size):
    source_target = subprocess.check_output(['java', '-jar', 'ChangedLine.jar', \
                                file1, file2, str(line_number), str(change_window_size)]).decode("utf-8")
    (source, target) = source_target.split("<|source-target-sep|>")
    return source, target

source, target = get_source_target(file1, file2, 1, 5)
print(source, target)